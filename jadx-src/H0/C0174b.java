package h0;

import a.AbstractC0062a;
import android.content.ContentResolver;
import android.net.Uri;
import j0.C0217h;
import j0.C0218i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174b extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.i f1786g;
    public final /* synthetic */ Uri h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f1787i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174b(X.i iVar, Uri uri, String str, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1786g = iVar;
        this.h = uri;
        this.f1787i = str;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0174b) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0174b c0174b = new C0174b(this.f1786g, this.h, this.f1787i, interfaceC0311d);
        c0174b.f1785f = obj;
        return c0174b;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        File file;
        Object obj2;
        Uri uri = this.h;
        AbstractC0062a.X(obj);
        X.i iVar = this.f1786g;
        try {
            file = new File(this.f1787i);
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (file.isDirectory()) {
            throw new C0217h();
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            throw new C0218i();
        }
        InputStream inputStreamOpenInputStream = ((ContentResolver) iVar.f715b).openInputStream(uri);
        objM = C0235h.f2029a;
        if (inputStreamOpenInputStream != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    if (P0.b.e(inputStreamOpenInputStream, fileOutputStream, 8192) <= 0) {
                        throw new j0.s(null);
                    }
                    AbstractC0062a.k(fileOutputStream, null);
                    AbstractC0062a.k(inputStreamOpenInputStream, null);
                    obj2 = objM;
                } finally {
                }
            } finally {
            }
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            return new C0232e(X.i.z(iVar, objM, uri));
        }
        throw new j0.s(null);
    }
}
