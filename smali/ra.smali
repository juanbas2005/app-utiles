.class public final Lra;
.super Lvv0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Lco;


# instance fields
.field public A:Lwo;

.field public final B:Lxo;

.field public final C:Lpa;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lra;->g(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    const v1, 0x7f0401a7

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance v2, Landroid/util/TypedValue;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, p2

    .line 27
    :goto_0
    invoke-direct {p0, p1, v2}, Lvv0;-><init>(Landroid/content/Context;I)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lxo;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lxo;-><init>(Lra;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Lra;->B:Lxo;

    .line 36
    .line 37
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    new-instance p2, Landroid/util/TypedValue;

    .line 44
    .line 45
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 53
    .line 54
    .line 55
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 56
    .line 57
    :cond_1
    move-object p1, v2

    .line 58
    check-cast p1, Lwo;

    .line 59
    .line 60
    iput p2, p1, Lwo;->p0:I

    .line 61
    .line 62
    invoke-virtual {v2}, Lko;->e()V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lpa;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, p2, p0, v0}, Lpa;-><init>(Landroid/content/Context;Lra;Landroid/view/Window;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lra;->C:Lpa;

    .line 79
    .line 80
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public static g(Landroid/content/Context;I)I
    .locals 2

    .line 1
    ushr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v0, 0x7f040030

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 22
    .line 23
    .line 24
    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    .line 25
    .line 26
    return p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lvv0;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwo;->y()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lwo;->W:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v1, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lwo;->I:Lro;

    .line 28
    .line 29
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Lro;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final dismiss()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lko;->f()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lra;->B:Lxo;

    .line 10
    .line 11
    invoke-static {v1, v0, p0, p1}, Lh03;->i(Lrs3;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final e()Lko;
    .locals 3

    .line 1
    iget-object v0, p0, Lra;->A:Lwo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lko;->w:Lol6;

    .line 6
    .line 7
    new-instance v0, Lwo;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p0, p0}, Lwo;-><init>(Landroid/content/Context;Landroid/view/Window;Lco;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lra;->A:Lwo;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Lra;->A:Lwo;

    .line 23
    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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

.method public final f(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lko;->c()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lvv0;->onCreate(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lko;->e()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwo;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwo;->y()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final i(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lko;->m(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwo;

    .line 6
    .line 7
    iget-object v0, p0, Lwo;->J:Lu98;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lwo;->C()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lwo;->J:Lu98;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lwo;->D(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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

.method public final j(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p1}, Lra;->f(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    iget-object v0, v0, Lra;->C:Lpa;

    .line 7
    .line 8
    iget v1, v0, Lpa;->u:I

    .line 9
    .line 10
    iget-object v2, v0, Lpa;->b:Lra;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lra;->setContentView(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lpa;->a:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v2, v0, Lpa;->c:Landroid/view/Window;

    .line 18
    .line 19
    const v3, 0x7f090196

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const v4, 0x7f09021d

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const v6, 0x7f090095

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const v8, 0x7f090077

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    const v10, 0x7f09009e

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Landroid/view/ViewGroup;

    .line 55
    .line 56
    iget-object v10, v0, Lpa;->f:Landroid/view/View;

    .line 57
    .line 58
    if-eqz v10, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v10, 0x0

    .line 62
    :goto_0
    const/4 v13, 0x0

    .line 63
    if-eqz v10, :cond_1

    .line 64
    .line 65
    const/4 v14, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v14, v13

    .line 68
    :goto_1
    if-eqz v14, :cond_2

    .line 69
    .line 70
    invoke-static {v10}, Lpa;->a(Landroid/view/View;)Z

    .line 71
    .line 72
    .line 73
    move-result v15

    .line 74
    if-nez v15, :cond_3

    .line 75
    .line 76
    :cond_2
    const/high16 v15, 0x20000

    .line 77
    .line 78
    invoke-virtual {v2, v15, v15}, Landroid/view/Window;->setFlags(II)V

    .line 79
    .line 80
    .line 81
    :cond_3
    const/16 v15, 0x8

    .line 82
    .line 83
    const/4 v12, -0x1

    .line 84
    if-eqz v14, :cond_5

    .line 85
    .line 86
    const v14, 0x7f09009d

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v14}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    check-cast v14, Landroid/widget/FrameLayout;

    .line 94
    .line 95
    const/16 p1, 0x0

    .line 96
    .line 97
    new-instance v11, Landroid/view/ViewGroup$LayoutParams;

    .line 98
    .line 99
    invoke-direct {v11, v12, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14, v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    .line 104
    .line 105
    iget-boolean v10, v0, Lpa;->g:Z

    .line 106
    .line 107
    if-eqz v10, :cond_4

    .line 108
    .line 109
    invoke-virtual {v14, v13, v13, v13, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-object v10, v0, Lpa;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 113
    .line 114
    if-eqz v10, :cond_6

    .line 115
    .line 116
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    check-cast v10, Lq64;

    .line 121
    .line 122
    const/4 v11, 0x0

    .line 123
    iput v11, v10, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    const/16 p1, 0x0

    .line 127
    .line 128
    invoke-virtual {v3, v15}, Landroid/view/View;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    invoke-static {v4, v5}, Lpa;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v6, v7}, Lpa;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-static {v8, v9}, Lpa;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    const v7, 0x7f0901bc

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Landroidx/core/widget/NestedScrollView;

    .line 163
    .line 164
    iput-object v7, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 165
    .line 166
    invoke-virtual {v7, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 167
    .line 168
    .line 169
    iget-object v7, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 170
    .line 171
    invoke-virtual {v7, v13}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 172
    .line 173
    .line 174
    const v7, 0x102000b

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    check-cast v7, Landroid/widget/TextView;

    .line 182
    .line 183
    iput-object v7, v0, Lpa;->q:Landroid/widget/TextView;

    .line 184
    .line 185
    if-nez v7, :cond_7

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    invoke-virtual {v7, v15}, Landroid/view/View;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    iget-object v7, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 192
    .line 193
    iget-object v8, v0, Lpa;->q:Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    iget-object v7, v0, Lpa;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 199
    .line 200
    if-eqz v7, :cond_8

    .line 201
    .line 202
    iget-object v7, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 203
    .line 204
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    check-cast v7, Landroid/view/ViewGroup;

    .line 209
    .line 210
    iget-object v8, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 211
    .line 212
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 217
    .line 218
    .line 219
    iget-object v9, v0, Lpa;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 220
    .line 221
    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    .line 222
    .line 223
    invoke-direct {v10, v12, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v7, v9, v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_8
    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    .line 231
    .line 232
    .line 233
    :goto_3
    const v7, 0x1020019

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    check-cast v7, Landroid/widget/Button;

    .line 241
    .line 242
    iput-object v7, v0, Lpa;->h:Landroid/widget/Button;

    .line 243
    .line 244
    iget-object v8, v0, Lpa;->A:Lr7;

    .line 245
    .line 246
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    .line 248
    .line 249
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    iget-object v9, v0, Lpa;->h:Landroid/widget/Button;

    .line 254
    .line 255
    if-eqz v7, :cond_9

    .line 256
    .line 257
    invoke-virtual {v9, v15}, Landroid/view/View;->setVisibility(I)V

    .line 258
    .line 259
    .line 260
    move v7, v13

    .line 261
    goto :goto_4

    .line 262
    :cond_9
    move-object/from16 v7, p1

    .line 263
    .line 264
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    iget-object v7, v0, Lpa;->h:Landroid/widget/Button;

    .line 268
    .line 269
    invoke-virtual {v7, v13}, Landroid/view/View;->setVisibility(I)V

    .line 270
    .line 271
    .line 272
    const/4 v7, 0x1

    .line 273
    :goto_4
    const v9, 0x102001a

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    check-cast v9, Landroid/widget/Button;

    .line 281
    .line 282
    iput-object v9, v0, Lpa;->i:Landroid/widget/Button;

    .line 283
    .line 284
    invoke-virtual {v9, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    iget-object v9, v0, Lpa;->j:Ljava/lang/CharSequence;

    .line 288
    .line 289
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    iget-object v10, v0, Lpa;->i:Landroid/widget/Button;

    .line 294
    .line 295
    if-eqz v9, :cond_a

    .line 296
    .line 297
    invoke-virtual {v10, v15}, Landroid/view/View;->setVisibility(I)V

    .line 298
    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_a
    iget-object v9, v0, Lpa;->j:Ljava/lang/CharSequence;

    .line 302
    .line 303
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 304
    .line 305
    .line 306
    iget-object v9, v0, Lpa;->i:Landroid/widget/Button;

    .line 307
    .line 308
    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    .line 309
    .line 310
    .line 311
    or-int/lit8 v7, v7, 0x2

    .line 312
    .line 313
    :goto_5
    const v9, 0x102001b

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    check-cast v9, Landroid/widget/Button;

    .line 321
    .line 322
    iput-object v9, v0, Lpa;->l:Landroid/widget/Button;

    .line 323
    .line 324
    invoke-virtual {v9, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    .line 326
    .line 327
    const/4 v8, 0x0

    .line 328
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    iget-object v10, v0, Lpa;->l:Landroid/widget/Button;

    .line 333
    .line 334
    if-eqz v9, :cond_b

    .line 335
    .line 336
    invoke-virtual {v10, v15}, Landroid/view/View;->setVisibility(I)V

    .line 337
    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_b
    invoke-virtual {v10, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 341
    .line 342
    .line 343
    iget-object v9, v0, Lpa;->l:Landroid/widget/Button;

    .line 344
    .line 345
    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    .line 346
    .line 347
    .line 348
    or-int/lit8 v7, v7, 0x4

    .line 349
    .line 350
    :goto_6
    new-instance v9, Landroid/util/TypedValue;

    .line 351
    .line 352
    invoke-direct {v9}, Landroid/util/TypedValue;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    const v10, 0x7f04002e

    .line 360
    .line 361
    .line 362
    const/4 v11, 0x1

    .line 363
    invoke-virtual {v1, v10, v9, v11}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 364
    .line 365
    .line 366
    iget v1, v9, Landroid/util/TypedValue;->data:I

    .line 367
    .line 368
    const/4 v9, 0x2

    .line 369
    if-eqz v1, :cond_e

    .line 370
    .line 371
    const/high16 v1, 0x3f000000    # 0.5f

    .line 372
    .line 373
    if-ne v7, v11, :cond_c

    .line 374
    .line 375
    iget-object v10, v0, Lpa;->h:Landroid/widget/Button;

    .line 376
    .line 377
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 378
    .line 379
    .line 380
    move-result-object v14

    .line 381
    check-cast v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 382
    .line 383
    iput v11, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 384
    .line 385
    iput v1, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 386
    .line 387
    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_c
    if-ne v7, v9, :cond_d

    .line 392
    .line 393
    iget-object v10, v0, Lpa;->i:Landroid/widget/Button;

    .line 394
    .line 395
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 396
    .line 397
    .line 398
    move-result-object v14

    .line 399
    check-cast v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 400
    .line 401
    iput v11, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 402
    .line 403
    iput v1, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 404
    .line 405
    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 406
    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_d
    const/4 v10, 0x4

    .line 410
    if-ne v7, v10, :cond_e

    .line 411
    .line 412
    iget-object v10, v0, Lpa;->l:Landroid/widget/Button;

    .line 413
    .line 414
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 415
    .line 416
    .line 417
    move-result-object v14

    .line 418
    check-cast v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 419
    .line 420
    iput v11, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 421
    .line 422
    iput v1, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 423
    .line 424
    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 425
    .line 426
    .line 427
    :cond_e
    :goto_7
    if-eqz v7, :cond_f

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_f
    invoke-virtual {v6, v15}, Landroid/view/View;->setVisibility(I)V

    .line 431
    .line 432
    .line 433
    :goto_8
    iget-object v1, v0, Lpa;->r:Landroid/view/View;

    .line 434
    .line 435
    const v7, 0x7f09021a

    .line 436
    .line 437
    .line 438
    if-eqz v1, :cond_10

    .line 439
    .line 440
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 441
    .line 442
    const/4 v10, -0x2

    .line 443
    invoke-direct {v1, v12, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 444
    .line 445
    .line 446
    iget-object v10, v0, Lpa;->r:Landroid/view/View;

    .line 447
    .line 448
    invoke-virtual {v4, v10, v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 456
    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_10
    const v1, 0x1020006

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    check-cast v1, Landroid/widget/ImageView;

    .line 467
    .line 468
    iput-object v1, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 469
    .line 470
    iget-object v1, v0, Lpa;->d:Ljava/lang/CharSequence;

    .line 471
    .line 472
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    if-nez v1, :cond_12

    .line 477
    .line 478
    iget-boolean v1, v0, Lpa;->y:Z

    .line 479
    .line 480
    if-eqz v1, :cond_12

    .line 481
    .line 482
    const v1, 0x7f09004b

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, Landroid/widget/TextView;

    .line 490
    .line 491
    iput-object v1, v0, Lpa;->p:Landroid/widget/TextView;

    .line 492
    .line 493
    iget-object v7, v0, Lpa;->d:Ljava/lang/CharSequence;

    .line 494
    .line 495
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 496
    .line 497
    .line 498
    iget-object v1, v0, Lpa;->n:Landroid/graphics/drawable/Drawable;

    .line 499
    .line 500
    if-eqz v1, :cond_11

    .line 501
    .line 502
    iget-object v7, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 503
    .line 504
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 505
    .line 506
    .line 507
    goto :goto_9

    .line 508
    :cond_11
    iget-object v1, v0, Lpa;->p:Landroid/widget/TextView;

    .line 509
    .line 510
    iget-object v7, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 511
    .line 512
    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    iget-object v10, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 517
    .line 518
    invoke-virtual {v10}, Landroid/view/View;->getPaddingTop()I

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    iget-object v11, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 523
    .line 524
    invoke-virtual {v11}, Landroid/view/View;->getPaddingRight()I

    .line 525
    .line 526
    .line 527
    move-result v11

    .line 528
    iget-object v14, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 529
    .line 530
    invoke-virtual {v14}, Landroid/view/View;->getPaddingBottom()I

    .line 531
    .line 532
    .line 533
    move-result v14

    .line 534
    invoke-virtual {v1, v7, v10, v11, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 535
    .line 536
    .line 537
    iget-object v1, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 538
    .line 539
    invoke-virtual {v1, v15}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 540
    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_12
    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 548
    .line 549
    .line 550
    iget-object v1, v0, Lpa;->o:Landroid/widget/ImageView;

    .line 551
    .line 552
    invoke-virtual {v1, v15}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v4, v15}, Landroid/view/View;->setVisibility(I)V

    .line 556
    .line 557
    .line 558
    :goto_9
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    if-eq v1, v15, :cond_13

    .line 563
    .line 564
    const/4 v11, 0x1

    .line 565
    goto :goto_a

    .line 566
    :cond_13
    move v11, v13

    .line 567
    :goto_a
    if-eqz v4, :cond_14

    .line 568
    .line 569
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-eq v1, v15, :cond_14

    .line 574
    .line 575
    const/4 v1, 0x1

    .line 576
    goto :goto_b

    .line 577
    :cond_14
    move v1, v13

    .line 578
    :goto_b
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-eq v3, v15, :cond_15

    .line 583
    .line 584
    const/4 v3, 0x1

    .line 585
    goto :goto_c

    .line 586
    :cond_15
    move v3, v13

    .line 587
    :goto_c
    if-nez v3, :cond_16

    .line 588
    .line 589
    const v6, 0x7f09020a

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 593
    .line 594
    .line 595
    move-result-object v6

    .line 596
    if-eqz v6, :cond_16

    .line 597
    .line 598
    invoke-virtual {v6, v13}, Landroid/view/View;->setVisibility(I)V

    .line 599
    .line 600
    .line 601
    :cond_16
    if-eqz v1, :cond_19

    .line 602
    .line 603
    iget-object v6, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 604
    .line 605
    if-eqz v6, :cond_17

    .line 606
    .line 607
    const/4 v7, 0x1

    .line 608
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 609
    .line 610
    .line 611
    :cond_17
    iget-object v6, v0, Lpa;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 612
    .line 613
    if-eqz v6, :cond_18

    .line 614
    .line 615
    const v6, 0x7f090219

    .line 616
    .line 617
    .line 618
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    goto :goto_d

    .line 623
    :cond_18
    move-object v4, v8

    .line 624
    :goto_d
    if-eqz v4, :cond_1a

    .line 625
    .line 626
    invoke-virtual {v4, v13}, Landroid/view/View;->setVisibility(I)V

    .line 627
    .line 628
    .line 629
    goto :goto_e

    .line 630
    :cond_19
    const v4, 0x7f09020b

    .line 631
    .line 632
    .line 633
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    if-eqz v4, :cond_1a

    .line 638
    .line 639
    invoke-virtual {v4, v13}, Landroid/view/View;->setVisibility(I)V

    .line 640
    .line 641
    .line 642
    :cond_1a
    :goto_e
    iget-object v4, v0, Lpa;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 643
    .line 644
    if-eqz v4, :cond_1e

    .line 645
    .line 646
    if-eqz v3, :cond_1b

    .line 647
    .line 648
    if-nez v1, :cond_1e

    .line 649
    .line 650
    :cond_1b
    invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I

    .line 651
    .line 652
    .line 653
    move-result v6

    .line 654
    if-eqz v1, :cond_1c

    .line 655
    .line 656
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 657
    .line 658
    .line 659
    move-result v7

    .line 660
    goto :goto_f

    .line 661
    :cond_1c
    iget v7, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->w:I

    .line 662
    .line 663
    :goto_f
    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    .line 664
    .line 665
    .line 666
    move-result v8

    .line 667
    if-eqz v3, :cond_1d

    .line 668
    .line 669
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 670
    .line 671
    .line 672
    move-result v10

    .line 673
    goto :goto_10

    .line 674
    :cond_1d
    iget v10, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->x:I

    .line 675
    .line 676
    :goto_10
    invoke-virtual {v4, v6, v7, v8, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 677
    .line 678
    .line 679
    :cond_1e
    if-nez v11, :cond_22

    .line 680
    .line 681
    iget-object v4, v0, Lpa;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 682
    .line 683
    if-eqz v4, :cond_1f

    .line 684
    .line 685
    goto :goto_11

    .line 686
    :cond_1f
    iget-object v4, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 687
    .line 688
    :goto_11
    if-eqz v4, :cond_22

    .line 689
    .line 690
    if-eqz v3, :cond_20

    .line 691
    .line 692
    move v13, v9

    .line 693
    :cond_20
    or-int/2addr v1, v13

    .line 694
    const v3, 0x7f0901bb

    .line 695
    .line 696
    .line 697
    invoke-virtual {v2, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    const v6, 0x7f0901ba

    .line 702
    .line 703
    .line 704
    invoke-virtual {v2, v6}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    sget-object v6, Le58;->a:Ljava/util/WeakHashMap;

    .line 709
    .line 710
    const/4 v6, 0x3

    .line 711
    invoke-virtual {v4, v1, v6}, Landroid/view/View;->setScrollIndicators(II)V

    .line 712
    .line 713
    .line 714
    if-eqz v3, :cond_21

    .line 715
    .line 716
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 717
    .line 718
    .line 719
    :cond_21
    if-eqz v2, :cond_22

    .line 720
    .line 721
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 722
    .line 723
    .line 724
    :cond_22
    iget-object v1, v0, Lpa;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 725
    .line 726
    if-eqz v1, :cond_23

    .line 727
    .line 728
    iget-object v2, v0, Lpa;->s:Landroid/widget/ListAdapter;

    .line 729
    .line 730
    if-eqz v2, :cond_23

    .line 731
    .line 732
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 733
    .line 734
    .line 735
    iget v0, v0, Lpa;->t:I

    .line 736
    .line 737
    if-le v0, v12, :cond_23

    .line 738
    .line 739
    const/4 v7, 0x1

    .line 740
    invoke-virtual {v1, v0, v7}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setSelection(I)V

    .line 744
    .line 745
    .line 746
    :cond_23
    return-void
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lra;->C:Lpa;

    .line 2
    .line 3
    iget-object v0, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lra;->C:Lpa;

    .line 2
    .line 3
    iget-object v0, v0, Lpa;->m:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Lvv0;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwo;->C()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwo;->J:Lu98;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lu98;->u:Z

    .line 19
    .line 20
    iget-object p0, p0, Lu98;->t:Ld68;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ld68;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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

.method public final setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvv0;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lko;->j(I)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Lvv0;->d()V

    .line 13
    invoke-virtual {p0}, Lra;->e()Lko;

    move-result-object p0

    invoke-virtual {p0, p1}, Lko;->k(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Lvv0;->d()V

    .line 15
    invoke-virtual {p0}, Lra;->e()Lko;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lko;->l(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lra;->e()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Lko;->m(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lra;->i(Ljava/lang/CharSequence;)V

    .line 21
    iget-object p0, p0, Lra;->C:Lpa;

    iput-object p1, p0, Lpa;->d:Ljava/lang/CharSequence;

    .line 22
    iget-object p0, p0, Lpa;->p:Landroid/widget/TextView;

    if-eqz p0, :cond_0

    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
