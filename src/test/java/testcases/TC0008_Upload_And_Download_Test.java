package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0008_UploadAndDownload_Page;


public class TC0008_Upload_And_Download_Test {
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void uploadAndDownload_Click() throws Exception {
		TC0008_UploadAndDownload_Page up = new TC0008_UploadAndDownload_Page();
		up.uploadAndDownloadButton_Click();
	}
	
	@Test(priority = 2,groups = {"smoke","regression"})
	public void updateFile_download() throws Exception {
		TC0008_UploadAndDownload_Page up = new TC0008_UploadAndDownload_Page();
		up.uploadFile();
		up.download_File();
	}
	
	@Test(priority = 3,groups = {"smoke","regression"})
	public void tear() {
		BaseClass.tear();
	}
}
