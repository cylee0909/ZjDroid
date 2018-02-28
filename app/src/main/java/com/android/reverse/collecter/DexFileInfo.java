package com.android.reverse.collecter;

public class DexFileInfo {
	
	private String dexPath;
	private Object mCookie;
	private ClassLoader defineClassLoader;

	
	public DexFileInfo(String dexPath,Object mCookie) {
		super();
		this.dexPath = dexPath;
		this.mCookie = mCookie;
	}
	
	public DexFileInfo(String dexPath,Object mCookie,ClassLoader classLoader) {
		this(dexPath,mCookie);
		this.defineClassLoader = classLoader;
	}
	
	public String getDexPath() {
		return dexPath;
	}

	public Object getmCookie() {
		return mCookie;
	}

	public void setmCookie(Object mCookie) {
		this.mCookie = mCookie;
	}

	public ClassLoader getDefineClassLoader() {
		return defineClassLoader;
	}

	public void setDefineClassLoader(ClassLoader defineClassLoader) {
		this.defineClassLoader = defineClassLoader;
	}

	public void setDexPath(String dexPath) {
		this.dexPath = dexPath;
	}



}
