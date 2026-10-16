package com.getcapacitor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public String f1480a;

    /* renamed from: b, reason: collision with root package name */
    public String f1481b;

    /* renamed from: c, reason: collision with root package name */
    public String f1482c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f1483e;

    /* renamed from: f, reason: collision with root package name */
    public String f1484f;

    /* renamed from: g, reason: collision with root package name */
    public String f1485g;
    public String h;

    public final ByteArrayInputStream a(InputStream inputStream) {
        String string;
        String str = "<script type=\"text/javascript\">" + b() + "</script>";
        try {
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            while (true) {
                int i2 = inputStreamReader.read(cArr, 0, 1024);
                if (i2 < 0) {
                    break;
                }
                sb.append(cArr, 0, i2);
            }
            string = sb.toString();
        } catch (Exception e2) {
            L.c.p("Unable to process HTML asset file. This is a fatal error", e2);
            string = "";
        }
        StringBuilder sb2 = new StringBuilder(string);
        if (string.contains("<head>")) {
            sb2.insert(string.indexOf("<head>") + 6, "\n" + str + "\n");
            string = sb2.toString();
        } else if (string.contains("</head>")) {
            sb2.insert(string.indexOf("</head>"), "\n" + str + "\n");
            string = sb2.toString();
        } else {
            L.c.o("Unable to inject Capacitor, Plugins won't work");
        }
        return new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8));
    }

    public final String b() {
        String str = this.f1480a + "\n\n" + this.f1485g + "\n\n" + this.f1481b + "\n\n" + this.f1482c + "\n\n" + this.d + "\n\n" + this.f1484f + "\n\n" + this.f1483e;
        String str2 = this.h;
        if (str2 == null) {
            return str;
        }
        return str + "\n\n" + str2;
    }
}
