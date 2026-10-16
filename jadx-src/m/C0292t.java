package m;

import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.a7m3p9xv.t6qk2z8.app.R;
import z.AbstractC0348a;

/* renamed from: m.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292t {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2453a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2454b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2455c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2456e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2457f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int iC = V0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{V0.f2305b, V0.d, V0.f2306c, V0.f2308f}, new int[]{V0.b(context, R.attr.colorButtonNormal), AbstractC0348a.b(iC, i2), AbstractC0348a.b(iC, i2), i2});
    }

    public static LayerDrawable c(Q0 q02, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableF = q02.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = q02.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0294u.f2460b;
        }
        PorterDuff.Mode mode2 = C0294u.f2460b;
        synchronized (C0294u.class) {
            porterDuffColorFilterH = Q0.h(i2, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    public final ColorStateList d(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return AbstractC0062a.t(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0062a.t(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, V0.c(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return b(context, V0.c(context, R.attr.colorAccent));
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0062a.t(context, R.color.abc_tint_spinner);
            }
            if (a(this.f2454b, i2)) {
                return V0.d(context, R.attr.colorControlNormal);
            }
            if (a(this.f2456e, i2)) {
                return AbstractC0062a.t(context, R.color.abc_tint_default);
            }
            if (a(this.f2457f, i2)) {
                return AbstractC0062a.t(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0062a.t(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = V0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = V0.f2305b;
            iArr2[0] = V0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = V0.f2307e;
            iArr2[1] = V0.c(context, R.attr.colorControlActivated);
            iArr[2] = V0.f2308f;
            iArr2[2] = V0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = V0.f2305b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = V0.f2307e;
            iArr2[1] = V0.c(context, R.attr.colorControlActivated);
            iArr[2] = V0.f2308f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
