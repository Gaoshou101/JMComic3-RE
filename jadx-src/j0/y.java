package j0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f1957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1958b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f1959c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.b f1960e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f1961f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1962g;

    public y(String str, String str2, Uri uri, long j2, P0.b bVar, Long l2, long j3) {
        x0.g.e("uri", uri);
        this.f1957a = str;
        this.f1958b = str2;
        this.f1959c = uri;
        this.d = j2;
        this.f1960e = bVar;
        this.f1961f = l2;
        this.f1962g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return x0.g.a(this.f1957a, yVar.f1957a) && x0.g.a(this.f1958b, yVar.f1958b) && x0.g.a(this.f1959c, yVar.f1959c) && this.d == yVar.d && x0.g.a(this.f1960e, yVar.f1960e) && x0.g.a(this.f1961f, yVar.f1961f) && this.f1962g == yVar.f1962g;
    }

    public final int hashCode() {
        int iHashCode = (this.f1959c.hashCode() + ((this.f1958b.hashCode() + (this.f1957a.hashCode() * 31)) * 31)) * 31;
        long j2 = this.d;
        int iHashCode2 = (this.f1960e.hashCode() + ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        Long l2 = this.f1961f;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        long j3 = this.f1962g;
        return ((iHashCode2 + iHashCode3) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return "IONFILEMetadataResult(fullPath=" + this.f1957a + ", name=" + this.f1958b + ", uri=" + this.f1959c + ", size=" + this.d + ", type=" + this.f1960e + ", createdTimestamp=" + this.f1961f + ", lastModifiedTimestamp=" + this.f1962g + ")";
    }
}
