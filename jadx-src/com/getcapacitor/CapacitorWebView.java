package com.getcapacitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class CapacitorWebView extends WebView {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1359c = 0;

    /* renamed from: a, reason: collision with root package name */
    public BaseInputConnection f1360a;

    /* renamed from: b, reason: collision with root package name */
    public C0101f f1361b;

    public CapacitorWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 2) {
            return super.dispatchKeyEvent(keyEvent);
        }
        evaluateJavascript("document.activeElement.value = document.activeElement.value + '" + keyEvent.getCharacters() + "';", null);
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C0101f c0101f = this.f1361b;
        if (!(c0101f != null ? c0101f.f1411a : r.c(getContext())).f1466j) {
            return super.onCreateInputConnection(editorInfo);
        }
        if (this.f1360a == null) {
            this.f1360a = new BaseInputConnection(this, false);
        }
        return this.f1360a;
    }

    public void setBridge(C0101f c0101f) {
        this.f1361b = c0101f;
    }
}
