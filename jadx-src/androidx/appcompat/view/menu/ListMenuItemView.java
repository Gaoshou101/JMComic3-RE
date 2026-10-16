package androidx.appcompat.view.menu;

import G.C0037m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.a7m3p9xv.t6qk2z8.app.R;
import f.AbstractC0113a;
import l.InterfaceC0236A;
import l.p;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0236A, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public p f898a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f899b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f900c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f901e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f902f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f903g;
    public ImageView h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f904i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f905j;

    /* renamed from: k, reason: collision with root package name */
    public final int f906k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f907l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f908m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f909n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f910o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f911p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f912q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0037m c0037mM = C0037m.m(getContext(), attributeSet, AbstractC0113a.f1512r, R.attr.listMenuViewStyle);
        this.f905j = c0037mM.i(5);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        this.f906k = typedArray.getResourceId(1, -1);
        this.f908m = typedArray.getBoolean(7, false);
        this.f907l = context;
        this.f909n = c0037mM.i(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f910o = typedArrayObtainStyledAttributes.hasValue(0);
        c0037mM.r();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f911p == null) {
            this.f911p = LayoutInflater.from(getContext());
        }
        return this.f911p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f903g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // l.InterfaceC0236A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(l.p r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.p):void");
    }

    @Override // l.InterfaceC0236A
    public p getItemData() {
        return this.f898a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f905j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i2 = this.f906k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f907l, i2);
        }
        this.f902f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f903g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f909n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.f904i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f899b != null && this.f908m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f899b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f900c == null && this.f901e == null) {
            return;
        }
        if ((this.f898a.x & 4) != 0) {
            if (this.f900c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f900c = radioButton;
                LinearLayout linearLayout = this.f904i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f900c;
            view = this.f901e;
        } else {
            if (this.f901e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f901e = checkBox;
                LinearLayout linearLayout2 = this.f904i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f901e;
            view = this.f900c;
        }
        if (z2) {
            compoundButton.setChecked(this.f898a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f901e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f900c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f898a.x & 4) != 0) {
            if (this.f900c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f900c = radioButton;
                LinearLayout linearLayout = this.f904i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f900c;
        } else {
            if (this.f901e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f901e = checkBox;
                LinearLayout linearLayout2 = this.f904i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f901e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f912q = z2;
        this.f908m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f910o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f898a.f2149n.getClass();
        boolean z2 = this.f912q;
        if (z2 || this.f908m) {
            ImageView imageView = this.f899b;
            if (imageView == null && drawable == null && !this.f908m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f899b = imageView2;
                LinearLayout linearLayout = this.f904i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f908m) {
                this.f899b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f899b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f899b.getVisibility() != 0) {
                this.f899b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}
