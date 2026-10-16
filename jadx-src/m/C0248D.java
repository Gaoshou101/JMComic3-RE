package m;

import G.C0037m;
import a.AbstractC0062a;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import f.AbstractC0113a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0248D {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2214a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f2215b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2216c;

    public /* synthetic */ C0248D() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((D.c) ((X.i) this.f2216c).f715b).getClass();
        if (keyListener instanceof M.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new M.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i2) {
        switch (this.f2214a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2215b;
                C0037m c0037mM = C0037m.m(absSeekBar.getContext(), attributeSet, d, i2);
                Drawable drawableJ = c0037mM.j(0);
                if (drawableJ != null) {
                    if (drawableJ instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableJ;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i3), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableJ = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableJ);
                }
                Drawable drawableJ2 = c0037mM.j(1);
                if (drawableJ2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableJ2, false));
                }
                c0037mM.r();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2215b).getContext().obtainStyledAttributes(attributeSet, AbstractC0113a.f1503i, i2, 0);
                try {
                    boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    d(z2);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public M.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        X.i iVar = (X.i) this.f2216c;
        if (inputConnection == null) {
            iVar.getClass();
            inputConnection = null;
        } else {
            D.c cVar = (D.c) iVar.f715b;
            cVar.getClass();
            if (!(inputConnection instanceof M.b)) {
                inputConnection = new M.b((EditText) cVar.f19b, inputConnection, editorInfo);
            }
        }
        return (M.b) inputConnection;
    }

    public void d(boolean z2) {
        M.i iVar = (M.i) ((D.c) ((X.i) this.f2216c).f715b).f20c;
        if (iVar.f433c != z2) {
            if (iVar.f432b != null) {
                androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
                M.h hVar = iVar.f432b;
                jVarA.getClass();
                AbstractC0062a.j("initCallback cannot be null", hVar);
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f1112a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f1113b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f433c = z2;
            if (z2) {
                M.i.a(iVar.f431a, androidx.emoji2.text.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z2) {
        if (drawable instanceof A.b) {
            ((A.c) ((A.b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = e(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f2216c) == null) {
                    this.f2216c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0248D(AbsSeekBar absSeekBar) {
        this.f2215b = absSeekBar;
    }

    public C0248D(EditText editText) {
        this.f2215b = editText;
        this.f2216c = new X.i(editText);
    }
}
