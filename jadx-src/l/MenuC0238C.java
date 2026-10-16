package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import g.AbstractC0152x;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0238C extends AbstractC0152x implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final n f2030c;

    public MenuC0238C(Context context, n nVar) {
        super(context);
        if (nVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2030c = nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f2030c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f2030c.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = f(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f2030c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        p.k kVar = (p.k) this.f1687b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f2030c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f2030c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return f(this.f2030c.findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return f(this.f2030c.getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f2030c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f2030c.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return this.f2030c.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f2030c.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((p.k) this.f1687b) != null) {
            int i3 = 0;
            while (true) {
                p.k kVar = (p.k) this.f1687b;
                if (i3 >= kVar.d) {
                    break;
                }
                if (((B.a) kVar.e(i3)).getGroupId() == i2) {
                    ((p.k) this.f1687b).f(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f2030c.removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((p.k) this.f1687b) != null) {
            int i3 = 0;
            while (true) {
                p.k kVar = (p.k) this.f1687b;
                if (i3 >= kVar.d) {
                    break;
                }
                if (((B.a) kVar.e(i3)).getItemId() == i2) {
                    ((p.k) this.f1687b).f(i3);
                    break;
                }
                i3++;
            }
        }
        this.f2030c.removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f2030c.setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        this.f2030c.setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        this.f2030c.setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2030c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2030c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return this.f2030c.addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return f(this.f2030c.add(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return this.f2030c.addSubMenu(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return f(this.f2030c.a(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return this.f2030c.addSubMenu(i2, i3, i4, i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return f(this.f2030c.add(i2, i3, i4, i5));
    }
}
