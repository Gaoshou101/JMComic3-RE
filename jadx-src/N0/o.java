package N0;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileNotFoundException;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public String f523a;
    public m cordova;
    public t webView;

    public boolean execute(String str, String str2, C0053d c0053d) {
        return execute(str, new JSONArray(str2), c0053d);
    }

    public p getPathHandler() {
        return null;
    }

    public String getServiceName() {
        return this.f523a;
    }

    public r handleOpenForRead(Uri uri) throws FileNotFoundException {
        throw new FileNotFoundException("Plugin can't handle uri: " + uri);
    }

    public boolean hasPermisssion() {
        return true;
    }

    public Object onMessage(String str, Object obj) {
        return null;
    }

    public boolean onOverrideUrlLoading(String str) {
        return false;
    }

    public boolean onReceivedClientCertRequest(t tVar, B b2) {
        return false;
    }

    public boolean onReceivedHttpAuthRequest(t tVar, D d, String str, String str2) {
        return false;
    }

    public Bundle onSaveInstanceState() {
        return null;
    }

    public final void privateInitialize(String str, m mVar, t tVar, q qVar) {
        this.f523a = str;
        this.cordova = mVar;
        this.webView = tVar;
        initialize(mVar, tVar);
        pluginInitialize();
    }

    public Uri remapUri(Uri uri) {
        return null;
    }

    public Boolean shouldAllowBridgeAccess(String str) {
        return shouldAllowNavigation(str);
    }

    public Boolean shouldAllowNavigation(String str) {
        return null;
    }

    public Boolean shouldAllowRequest(String str) {
        return null;
    }

    public Boolean shouldOpenExternalUrl(String str) {
        return null;
    }

    public boolean execute(String str, JSONArray jSONArray, C0053d c0053d) {
        return execute(str, new C0055f(), c0053d);
    }

    public boolean execute(String str, C0055f c0055f, C0053d c0053d) {
        return false;
    }

    public void onDestroy() {
    }

    public void onReset() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void pluginInitialize() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onNewIntent(Intent intent) {
    }

    public void onPause(boolean z2) {
    }

    public void onResume(boolean z2) {
    }

    public void requestPermissions(int i2) {
    }

    public void initialize(m mVar, t tVar) {
    }

    public void onRestoreStateForActivityResult(Bundle bundle, C0053d c0053d) {
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Deprecated
    public void onRequestPermissionResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }
}
