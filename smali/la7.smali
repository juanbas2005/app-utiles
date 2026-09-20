.class public final Lla7;
.super Lhd3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public N:Lvr2;

.field public O:Lib8;


# virtual methods
.method public final N0()V
    .locals 3

    .line 1
    invoke-static {p0}, Lsu0;->K(Lvo1;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lib8;->w:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-static {v0}, Ln63;->j(Landroid/view/View;)Lib8;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Lib8;->a(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lla7;->N:Lvr2;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Laa8;

    .line 21
    .line 22
    iget-object v2, p0, Lhd3;->M:Laa8;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iput-object v0, p0, Lhd3;->M:Laa8;

    .line 31
    .line 32
    invoke-virtual {p0}, Lhd3;->W0()V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput-object v1, p0, Lla7;->O:Lib8;

    .line 36
    .line 37
    invoke-super {p0}, Ldd3;->N0()V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final O0()V
    .locals 3

    .line 1
    invoke-static {p0}, Lsu0;->K(Lvo1;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lla7;->O:Lib8;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v2, v1, Lib8;->u:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    iput v2, v1, Lib8;->u:I

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Le58;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v2}, Lw48;->c(Landroid/view/View;Ll45;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Le58;->o(Landroid/view/View;Lus0;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lib8;->v:Led3;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-super {p0}, Ldd3;->O0()V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
