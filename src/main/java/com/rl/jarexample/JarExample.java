package com.rl.jarexample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JarExample {
public static void main(String[] args) throws IOException {
	File file = new File("newfile.txt");
	FileOutputStream fout = new FileOutputStream(file);
	fout.write(34);
	fout.close();
}
}

