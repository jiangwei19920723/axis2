package cn.jcloud.srm.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
/**
 * 纯工具类
 * @time 2017年11月8日 上午11:14:03
 * @Description TODO
 */
public class FileUtil {

	/**
	 * 向文件中写入信息
	 * @param fileName 文件名
	 * @param messages 需写入的信息
	 * @throws Exception
	 */
	public static void writeFile(String fileName, List<String> messages)
			throws Exception {
		File file = new File(fileName);
		writeFile(file, messages);
	}

	/**
	 * 向文件中写入信息
	 * @param file 文件
	 * @param messages 需写入的信息
	 * @throws Exception
	 */
	public static void writeFile(File file, List<String> messages)
			throws Exception {
		if (!file.exists() || !file.isFile()) {
			throw new Exception("文件路径不正确");
		}
		FileWriter fileWriter = null;
		BufferedWriter writer = null;
		try {
			fileWriter = new FileWriter(file, true);
			writer = new BufferedWriter(fileWriter);
			for (String message : messages) {
				writer.newLine();
				writer.write(message);
			}
		} finally {
			if (writer != null) {
				try {
					writer.close();
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 删除文件
	 * @param fileName 需删除的文件名
	 */
	public static void deleteFile(String fileName){
		File file = new File(fileName);
		deleteFile(file);
	}
	
	/**
	 * 删除文件
	 * @param source 需删除的文件
	 */
	public static void deleteFile(File source) {
		if(source.exists())
			source.delete();
	}
	
	/**
	 * 文件移动(剪切)
	 * @param sourceName 原文件名
	 * @param destinationName 目标文件(夹)名称
	 * @return if true success else failed
	 * @throws Exception
	 */
	public static boolean moveFile(String sourceName, String destinationName) throws Exception {
		File source = new File(sourceName);
		File destination = new File(destinationName);
		return moveFile(source, destination);
	}

	/**
	 * 文件移动(剪切)
	 * @param source 原文件
	 * @param destination 目标文件(夹)
	 * @return if true success else failed
	 * @throws Exception
	 */
	public static boolean moveFile(File source, File destination) throws Exception {
		if(!source.exists())
			throw new Exception("source not exists");
		if(destination.isDirectory()){
			String destinationPath = destination.getAbsolutePath() + File.separator+source.getName();
			destination = new File(destinationPath);
		}
		if(!destination.exists())
			destination.mkdirs();
		if(copyFile(source, destination)){
			deleteFile(source);
			return true;
		}
		return false;
	}

	/**
	 * 文件复制
	 * @param sourceName 原文件名
	 * @param destinationName 目标文件(夹)名称
	 * @return if true success else failed
	 * @throws Exception
	 */
	public static boolean copyFile(String sourceName, String destinationName) throws Exception {
		File source = new File(sourceName);
		File destination = new File(destinationName);
		return copyFile(source, destination);
	}
	
	/**
	 * 文件复制
	 * @param source 原文件
	 * @param destination 目标文件(夹)
	 * @return if true success else failed
	 * @throws Exception
	 */
	public static boolean copyFile(File source, File destination) throws Exception {
		if(!source.exists())
			throw new Exception("source not exists");
		if(destination.isDirectory()){
			String destinationPath = destination.getAbsolutePath() + File.separator+source.getName();
			destination = new File(destinationPath);
		}
		if(!destination.exists())
			destination.createNewFile();
		FileChannel in = null;
		FileChannel out = null;
		try {
			in = new FileInputStream(source).getChannel();
			out = new FileOutputStream(destination).getChannel();
			in.transferTo(0, in.size(), out);
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
		return true;
	}
}
