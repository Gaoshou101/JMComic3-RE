package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.AbstractC0113a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f884a;

    /* renamed from: b, reason: collision with root package name */
    public final int f885b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0113a.f1514t);
        this.f885b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f884a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
