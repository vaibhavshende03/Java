package com.up;

import java.io.File;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;


@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {

   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> multifiles=sf.parseRequest(request);


		
		
		for(FileItem item:multifiles) {
			item.write(new File("/C://Users//shend//OneDrive//Desktop//ServletFileUpload/"+item.getName()));
		}
		
		System.out.println("File Upload");
	}

}
