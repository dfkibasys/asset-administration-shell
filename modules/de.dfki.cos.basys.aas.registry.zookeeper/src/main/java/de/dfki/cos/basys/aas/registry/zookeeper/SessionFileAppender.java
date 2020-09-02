package de.dfki.cos.basys.aas.registry.zookeeper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;


public class SessionFileAppender extends FileAppender {

	static String timeString = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss").format(Calendar.getInstance().getTime());

	public SessionFileAppender() {
	}

	public SessionFileAppender(Layout layout, String filename, boolean append) throws IOException {
		super(layout, filename, append);
	}

	public SessionFileAppender(Layout layout, String filename) throws IOException {
		super(layout, filename);
	}

	@Override
	public synchronized void setFile(String fileName, boolean append, boolean bufferedIO, int bufferSize) throws IOException {
		fileName = fileName + "#" + timeString + ".log";
		super.setFile(fileName, append, this.bufferedIO, this.bufferSize);
	}

}
