package com.sumsec.util;

import com.sumsec.core.cfg.core.CFGViewerOver;
import soot.tools.CFGViewer;

import java.io.File;

/**
 * @ClassName: ConstatField
 * @Description: TODO
 * @Author: Summer
 * @Date: 2022/2/6 21:08
 * @Version: v1.0.0
 * @Description:
 **/
public class ConstatField {
    public final static String HOME = System.getProperty("user.dir");
    public static final String separator = File.separator;
    public static final String DatasHome = HOME + separator + "datas";
    public final static String CFGHOME = DatasHome + separator + "cfg";
    public final static String Result = HOME + separator + "result";
    public static String CFGHOMETemp = CFGHOME;
    public static String ResultTemp = Result;
    public final static String sootOutput = "datas" + separator + "sootOutput";
    public static String sootOutputTemp = sootOutput;
    public static boolean flag = true;
    public static boolean flag1 = true;
    public static String filename ;
    public static String graphtype;

    public static CFGViewer viewer = new CFGViewer();


}