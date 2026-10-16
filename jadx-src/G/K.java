package G;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m.C0298w;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f146a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f147b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f148c = false;
    public static final C0047x d = new C0047x();

    /* renamed from: e, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0049z f149e = new ViewTreeObserverOnGlobalLayoutListenerC0049z();

    public static O a(View view) {
        if (f146a == null) {
            f146a = new WeakHashMap();
        }
        O o2 = (O) f146a.get(view);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(view);
        f146a.put(view, o3);
        return o3;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = J.d;
        J j2 = (J) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (j2 == null) {
            j2 = new J();
            j2.f143a = null;
            j2.f144b = null;
            j2.f145c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, j2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = j2.f143a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = J.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (j2.f143a == null) {
                            j2.f143a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = J.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                j2.f143a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    j2.f143a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = j2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (j2.f144b == null) {
                    j2.f144b = new SparseArray();
                }
                j2.f144b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return G.a(view);
        }
        if (f148c) {
            return null;
        }
        if (f147b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f147b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f148c = true;
                return null;
            }
        }
        try {
            Object obj = f147b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f148c = true;
            return null;
        }
    }

    public static String[] d(C0298w c0298w) {
        return Build.VERSION.SDK_INT >= 31 ? I.a(c0298w) : (String[]) c0298w.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i2) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i3 = Build.VERSION.SDK_INT;
            CharSequence charSequenceA = null;
            if (i3 >= 28) {
                tag = F.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z2 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z2) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i3 >= 28) {
                        charSequenceA = F.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequenceA = tag2;
                        }
                    }
                    text.add(charSequenceA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i3 >= 28) {
                charSequenceA = F.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequenceA = tag3;
                }
            }
            text2.add(charSequenceA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0031g f(View view, C0031g c0031g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0031g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return I.b(view, c0031g);
        }
        J.k kVar = (J.k) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0043t interfaceC0043t = d;
        if (kVar == null) {
            if (view instanceof InterfaceC0043t) {
                interfaceC0043t = (InterfaceC0043t) view;
            }
            return interfaceC0043t.a(c0031g);
        }
        C0031g c0031gA = J.k.a(view, c0031g);
        if (c0031gA == null) {
            return null;
        }
        if (view instanceof InterfaceC0043t) {
            interfaceC0043t = (InterfaceC0043t) view;
        }
        return interfaceC0043t.a(c0031gA);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            G.b(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void h(View view, C0026b c0026b) {
        if (c0026b == null && (c(view) instanceof C0025a)) {
            c0026b = new C0026b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0026b == null ? null : c0026b.f176b);
    }

    public static void i(View view, CharSequence charSequence) {
        new C0048y(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0049z viewTreeObserverOnGlobalLayoutListenerC0049z = f149e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0049z.f210a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0049z);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0049z);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0049z.f210a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0049z);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0049z);
            }
        }
    }
}
