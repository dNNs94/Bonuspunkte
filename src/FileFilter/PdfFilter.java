package FileFilter;

import java.io.File;
import java.io.FileFilter;

public class PdfFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if(pathname.toString().toLowerCase().endsWith("pdf")){
			return true;
		}
		return false;
	}

	
	
}
