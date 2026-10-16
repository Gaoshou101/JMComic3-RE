package androidx.lifecycle;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0080l {
    private static final /* synthetic */ EnumC0080l[] $VALUES;
    public static final C0078j Companion;
    public static final EnumC0080l ON_ANY;
    public static final EnumC0080l ON_CREATE;
    public static final EnumC0080l ON_DESTROY;
    public static final EnumC0080l ON_PAUSE;
    public static final EnumC0080l ON_RESUME;
    public static final EnumC0080l ON_START;
    public static final EnumC0080l ON_STOP;

    static {
        EnumC0080l enumC0080l = new EnumC0080l("ON_CREATE", 0);
        ON_CREATE = enumC0080l;
        EnumC0080l enumC0080l2 = new EnumC0080l("ON_START", 1);
        ON_START = enumC0080l2;
        EnumC0080l enumC0080l3 = new EnumC0080l("ON_RESUME", 2);
        ON_RESUME = enumC0080l3;
        EnumC0080l enumC0080l4 = new EnumC0080l("ON_PAUSE", 3);
        ON_PAUSE = enumC0080l4;
        EnumC0080l enumC0080l5 = new EnumC0080l("ON_STOP", 4);
        ON_STOP = enumC0080l5;
        EnumC0080l enumC0080l6 = new EnumC0080l("ON_DESTROY", 5);
        ON_DESTROY = enumC0080l6;
        EnumC0080l enumC0080l7 = new EnumC0080l("ON_ANY", 6);
        ON_ANY = enumC0080l7;
        $VALUES = new EnumC0080l[]{enumC0080l, enumC0080l2, enumC0080l3, enumC0080l4, enumC0080l5, enumC0080l6, enumC0080l7};
        Companion = new C0078j();
    }

    public static EnumC0080l valueOf(String str) {
        return (EnumC0080l) Enum.valueOf(EnumC0080l.class, str);
    }

    public static EnumC0080l[] values() {
        return (EnumC0080l[]) $VALUES.clone();
    }

    public final EnumC0081m a() {
        switch (AbstractC0079k.f1300a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0081m.d;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
                return EnumC0081m.f1303e;
            case 5:
                return EnumC0081m.f1304f;
            case 6:
                return EnumC0081m.f1301b;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
