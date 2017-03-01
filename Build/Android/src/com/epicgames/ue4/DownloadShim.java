package com.epicgames.ue4;

import com.FallingUp.FallingUpVR.OBBDownloaderService;
import com.FallingUp.FallingUpVR.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

