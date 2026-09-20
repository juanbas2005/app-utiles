.class public final Lwo;
.super Lko;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lri4;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final D0:Lzt6;

.field public static final E0:[I

.field public static final F0:Z


# instance fields
.field public A0:Loq;

.field public B0:Landroid/window/OnBackInvokedDispatcher;

.field public C0:Landroid/window/OnBackInvokedCallback;

.field public final F:Ljava/lang/Object;

.field public final G:Landroid/content/Context;

.field public H:Landroid/view/Window;

.field public I:Lro;

.field public J:Lu98;

.field public K:Lf87;

.field public L:Ljava/lang/CharSequence;

.field public M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public N:Lf96;

.field public O:Lwv2;

.field public P:Lh8;

.field public Q:Landroidx/appcompat/widget/ActionBarContextView;

.field public R:Landroid/widget/PopupWindow;

.field public S:Llo;

.field public T:Lc68;

.field public final U:Z

.field public V:Z

.field public W:Landroid/view/ViewGroup;

.field public X:Landroid/widget/TextView;

.field public Y:Landroid/view/View;

.field public Z:Z

.field public a0:Z

.field public b0:Z

.field public c0:Z

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:[Lvo;

.field public i0:Lvo;

.field public j0:Z

.field public k0:Z

.field public l0:Z

.field public m0:Z

.field public n0:Landroid/content/res/Configuration;

.field public final o0:I

.field public p0:I

.field public q0:I

.field public r0:Z

.field public s0:Lso;

.field public t0:Lso;

.field public u0:Z

.field public v0:I

.field public final w0:Llo;

.field public x0:Z

.field public y0:Landroid/graphics/Rect;

.field public z0:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzt6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lzt6;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwo;->D0:Lzt6;

    .line 8
    .line 9
    const v0, 0x1010054

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lwo;->E0:[I

    .line 17
    .line 18
    const-string v0, "robolectric"

    .line 19
    .line 20
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    xor-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    sput-boolean v0, Lwo;->F0:Z

    .line 29
    .line 30
    return-void
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

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lco;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    iput-object p3, p0, Lwo;->T:Lc68;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lwo;->U:Z

    .line 9
    .line 10
    const/16 v0, -0x64

    .line 11
    .line 12
    iput v0, p0, Lwo;->o0:I

    .line 13
    .line 14
    new-instance v1, Llo;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Llo;-><init>(Lwo;I)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lwo;->w0:Llo;

    .line 21
    .line 22
    iput-object p1, p0, Lwo;->G:Landroid/content/Context;

    .line 23
    .line 24
    iput-object p4, p0, Lwo;->F:Ljava/lang/Object;

    .line 25
    .line 26
    instance-of p4, p4, Landroid/app/Dialog;

    .line 27
    .line 28
    if-eqz p4, :cond_2

    .line 29
    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    instance-of p4, p1, Lyn;

    .line 33
    .line 34
    if-eqz p4, :cond_0

    .line 35
    .line 36
    move-object p3, p1

    .line 37
    check-cast p3, Lyn;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    instance-of p4, p1, Landroid/content/ContextWrapper;

    .line 41
    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    check-cast p1, Landroid/content/ContextWrapper;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :goto_1
    if-eqz p3, :cond_2

    .line 52
    .line 53
    invoke-virtual {p3}, Lyn;->r()Lko;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lwo;

    .line 58
    .line 59
    iget p1, p1, Lwo;->o0:I

    .line 60
    .line 61
    iput p1, p0, Lwo;->o0:I

    .line 62
    .line 63
    :cond_2
    iget p1, p0, Lwo;->o0:I

    .line 64
    .line 65
    if-ne p1, v0, :cond_3

    .line 66
    .line 67
    iget-object p1, p0, Lwo;->F:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object p3, Lwo;->D0:Lzt6;

    .line 78
    .line 79
    invoke-virtual {p3, p1}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ljava/lang/Integer;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput p1, p0, Lwo;->o0:I

    .line 92
    .line 93
    iget-object p1, p0, Lwo;->F:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p3, p1}, Lzt6;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_3
    if-eqz p2, :cond_4

    .line 107
    .line 108
    invoke-virtual {p0, p2}, Lwo;->p(Landroid/view/Window;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-static {}, Lyo;->d()V

    .line 112
    .line 113
    .line 114
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public static q(Landroid/content/Context;)Lza4;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lko;->y:Lza4;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    iget-object v1, v0, Lza4;->a:Lab4;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Loo;->b(Landroid/content/res/Configuration;)Lza4;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0}, Lza4;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget-object v0, Lza4;->b:Lza4;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    :goto_1
    iget-object v3, v1, Lab4;->a:Landroid/os/LocaleList;

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget-object v4, p0, Lza4;->a:Lab4;

    .line 54
    .line 55
    iget-object v4, v4, Lab4;->a:Landroid/os/LocaleList;

    .line 56
    .line 57
    invoke-virtual {v4}, Landroid/os/LocaleList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    add-int/2addr v4, v3

    .line 62
    if-ge v2, v4, :cond_5

    .line 63
    .line 64
    iget-object v3, v1, Lab4;->a:Landroid/os/LocaleList;

    .line 65
    .line 66
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-ge v2, v3, :cond_3

    .line 71
    .line 72
    iget-object v3, v1, Lab4;->a:Landroid/os/LocaleList;

    .line 73
    .line 74
    invoke-virtual {v3, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget-object v3, v1, Lab4;->a:Landroid/os/LocaleList;

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    sub-int v3, v2, v3

    .line 86
    .line 87
    iget-object v4, p0, Lza4;->a:Lab4;

    .line 88
    .line 89
    iget-object v4, v4, Lab4;->a:Landroid/os/LocaleList;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :goto_2
    if-eqz v3, :cond_4

    .line 96
    .line 97
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    new-array v1, v1, [Ljava/util/Locale;

    .line 108
    .line 109
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, [Ljava/util/Locale;

    .line 114
    .line 115
    new-instance v1, Landroid/os/LocaleList;

    .line 116
    .line 117
    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, Lza4;

    .line 121
    .line 122
    new-instance v2, Lab4;

    .line 123
    .line 124
    invoke-direct {v2, v1}, Lab4;-><init>(Landroid/os/LocaleList;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v2}, Lza4;-><init>(Lab4;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-virtual {v0}, Lza4;->b()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_6
    return-object v0
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public static v(Landroid/content/Context;ILza4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 p0, p0, 0x30

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 p0, 0x20

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/16 p0, 0x10

    .line 32
    .line 33
    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 p4, 0x0

    .line 39
    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 40
    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p3, p3, -0x31

    .line 49
    .line 50
    or-int/2addr p0, p3

    .line 51
    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    invoke-static {p1, p2}, Loo;->d(Landroid/content/res/Configuration;Lza4;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-object p1
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
.end method


# virtual methods
.method public final A(Landroid/content/Context;)Lf1;
    .locals 3

    .line 1
    iget-object v0, p0, Lwo;->s0:Lso;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lso;

    .line 6
    .line 7
    sget-object v1, Lcf4;->A:Lcf4;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v1, Lcf4;

    .line 16
    .line 17
    const-string v2, "location"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/location/LocationManager;

    .line 24
    .line 25
    invoke-direct {v1, p1, v2}, Lcf4;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lcf4;->A:Lcf4;

    .line 29
    .line 30
    :cond_0
    sget-object p1, Lcf4;->A:Lcf4;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Lso;-><init>(Lwo;Lcf4;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lwo;->s0:Lso;

    .line 36
    .line 37
    :cond_1
    iget-object p0, p0, Lwo;->s0:Lso;

    .line 38
    .line 39
    return-object p0
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final B(I)Lvo;
    .locals 4

    .line 1
    iget-object v0, p0, Lwo;->h0:[Lvo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v2, p1, :cond_2

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    new-array v2, v2, [Lvo;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    array-length v3, v0

    .line 16
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v2, p0, Lwo;->h0:[Lvo;

    .line 20
    .line 21
    move-object v0, v2

    .line 22
    :cond_2
    aget-object p0, v0, p1

    .line 23
    .line 24
    if-nez p0, :cond_3

    .line 25
    .line 26
    new-instance p0, Lvo;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput p1, p0, Lvo;->a:I

    .line 32
    .line 33
    iput-boolean v1, p0, Lvo;->n:Z

    .line 34
    .line 35
    aput-object p0, v0, p1

    .line 36
    .line 37
    :cond_3
    return-object p0
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final C()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lwo;->y()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lwo;->b0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    iget-object v0, p0, Lwo;->J:Lu98;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object v0, p0, Lwo;->F:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lu98;

    .line 20
    .line 21
    check-cast v0, Landroid/app/Activity;

    .line 22
    .line 23
    iget-boolean v2, p0, Lwo;->c0:Z

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Lu98;-><init>(Landroid/app/Activity;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lwo;->J:Lu98;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    new-instance v1, Lu98;

    .line 36
    .line 37
    check-cast v0, Landroid/app/Dialog;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lu98;-><init>(Landroid/app/Dialog;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lwo;->J:Lu98;

    .line 43
    .line 44
    :cond_2
    :goto_0
    iget-object v0, p0, Lwo;->J:Lu98;

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-boolean p0, p0, Lwo;->x0:Z

    .line 49
    .line 50
    iget-boolean v1, v0, Lu98;->h:Z

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    const/4 v1, 0x4

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    move p0, v1

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 p0, 0x0

    .line 60
    :goto_1
    iget-object v2, v0, Lu98;->e:Lsk1;

    .line 61
    .line 62
    check-cast v2, Lsj7;

    .line 63
    .line 64
    iget v3, v2, Lsj7;->b:I

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    iput-boolean v4, v0, Lu98;->h:Z

    .line 68
    .line 69
    and-int/2addr p0, v1

    .line 70
    and-int/lit8 v0, v3, -0x5

    .line 71
    .line 72
    or-int/2addr p0, v0

    .line 73
    invoke-virtual {v2, p0}, Lsj7;->a(I)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_2
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final D(I)V
    .locals 2

    .line 1
    iget v0, p0, Lwo;->v0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Lwo;->v0:I

    .line 8
    .line 9
    iget-boolean p1, p0, Lwo;->u0:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lwo;->H:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Le58;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    iget-object v0, p0, Lwo;->w0:Llo;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, Lwo;->u0:Z

    .line 27
    .line 28
    :cond_0
    return-void
    .line 29
.end method

.method public final E(Landroid/content/Context;I)I
    .locals 2

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq p2, v0, :cond_5

    .line 5
    .line 6
    if-eq p2, v1, :cond_4

    .line 7
    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p2, v0, :cond_4

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p2, v0, :cond_4

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Lwo;->t0:Lso;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    new-instance p2, Lso;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1}, Lso;-><init>(Lwo;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lwo;->t0:Lso;

    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, Lwo;->t0:Lso;

    .line 31
    .line 32
    invoke-virtual {p0}, Lso;->f()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    const-string p0, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 38
    .line 39
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string v0, "uimode"

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Landroid/app/UiModeManager;

    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p0, p1}, Lwo;->A(Landroid/content/Context;)Lf1;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Lf1;->f()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    return p0

    .line 72
    :cond_4
    return p2

    .line 73
    :cond_5
    :goto_0
    return v1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
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

.method public final F()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lwo;->j0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lwo;->j0:Z

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lwo;->B(I)Lvo;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-boolean v3, v2, Lvo;->m:Z

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0, v2, v4}, Lwo;->u(Lvo;Z)V

    .line 18
    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    iget-object v0, p0, Lwo;->P:Lh8;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lh8;->b()V

    .line 26
    .line 27
    .line 28
    return v4

    .line 29
    :cond_1
    invoke-virtual {p0}, Lwo;->C()V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lwo;->J:Lu98;

    .line 33
    .line 34
    if-eqz p0, :cond_4

    .line 35
    .line 36
    iget-object p0, p0, Lu98;->e:Lsk1;

    .line 37
    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    check-cast v0, Lsj7;

    .line 42
    .line 43
    iget-object v0, v0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 44
    .line 45
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->k0:Lmj7;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iget-object v0, v0, Lmj7;->x:Lyi4;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p0, Lsj7;

    .line 54
    .line 55
    iget-object p0, p0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->k0:Lmj7;

    .line 58
    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object p0, p0, Lmj7;->x:Lyi4;

    .line 64
    .line 65
    :goto_0
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Lyi4;->collapseActionView()Z

    .line 68
    .line 69
    .line 70
    :cond_3
    return v4

    .line 71
    :cond_4
    return v1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final G(Lvo;Landroid/view/KeyEvent;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lvo;->m:Z

    .line 6
    .line 7
    iget v3, v1, Lvo;->a:I

    .line 8
    .line 9
    if-nez v2, :cond_1a

    .line 10
    .line 11
    iget-boolean v2, v0, Lwo;->m0:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, Lwo;->G:Landroid/content/Context;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 30
    .line 31
    and-int/lit8 v4, v4, 0xf

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_1
    iget-object v4, v0, Lwo;->H:Landroid/view/Window;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    iget-object v6, v1, Lvo;->h:Lti4;

    .line 48
    .line 49
    invoke-interface {v4, v3, v6}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v1, v5}, Lwo;->u(Lvo;Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string v4, "window"

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/view/WindowManager;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_3
    invoke-virtual/range {p0 .. p2}, Lwo;->I(Lvo;Landroid/view/KeyEvent;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_4

    .line 76
    .line 77
    goto/16 :goto_9

    .line 78
    .line 79
    :cond_4
    iget-object v6, v1, Lvo;->e:Luo;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, -0x2

    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    iget-boolean v9, v1, Lvo;->n:Z

    .line 86
    .line 87
    if-eqz v9, :cond_5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iget-object v2, v1, Lvo;->g:Landroid/view/View;

    .line 91
    .line 92
    if-eqz v2, :cond_18

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_18

    .line 99
    .line 100
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 101
    .line 102
    const/4 v6, -0x1

    .line 103
    if-ne v2, v6, :cond_18

    .line 104
    .line 105
    move v10, v6

    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_6
    :goto_0
    if-nez v6, :cond_b

    .line 109
    .line 110
    invoke-virtual {v0}, Lwo;->C()V

    .line 111
    .line 112
    .line 113
    iget-object v6, v0, Lwo;->J:Lu98;

    .line 114
    .line 115
    if-eqz v6, :cond_7

    .line 116
    .line 117
    invoke-virtual {v6}, Lu98;->b()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_1

    .line 122
    :cond_7
    const/4 v6, 0x0

    .line 123
    :goto_1
    if-nez v6, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move-object v2, v6

    .line 127
    :goto_2
    new-instance v6, Landroid/util/TypedValue;

    .line 128
    .line 129
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v9, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 145
    .line 146
    .line 147
    const v10, 0x7f040006

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 151
    .line 152
    .line 153
    iget v10, v6, Landroid/util/TypedValue;->resourceId:I

    .line 154
    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 158
    .line 159
    .line 160
    :cond_9
    const v10, 0x7f0403f8

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 164
    .line 165
    .line 166
    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    .line 167
    .line 168
    if-eqz v6, :cond_a

    .line 169
    .line 170
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_a
    const v6, 0x7f12025d

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 178
    .line 179
    .line 180
    :goto_3
    new-instance v6, Ld61;

    .line 181
    .line 182
    invoke-direct {v6, v2, v7}, Ld61;-><init>(Landroid/content/Context;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Ld61;->getTheme()Landroid/content/res/Resources$Theme;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 190
    .line 191
    .line 192
    iput-object v6, v1, Lvo;->j:Ld61;

    .line 193
    .line 194
    sget-object v2, Lqv5;->j:[I

    .line 195
    .line 196
    invoke-virtual {v6, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v6, 0x56

    .line 201
    .line 202
    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    iput v6, v1, Lvo;->b:I

    .line 207
    .line 208
    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    iput v6, v1, Lvo;->d:I

    .line 213
    .line 214
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 215
    .line 216
    .line 217
    new-instance v2, Luo;

    .line 218
    .line 219
    iget-object v6, v1, Lvo;->j:Ld61;

    .line 220
    .line 221
    invoke-direct {v2, v0, v6}, Luo;-><init>(Lwo;Ld61;)V

    .line 222
    .line 223
    .line 224
    iput-object v2, v1, Lvo;->e:Luo;

    .line 225
    .line 226
    const/16 v2, 0x51

    .line 227
    .line 228
    iput v2, v1, Lvo;->c:I

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_b
    iget-boolean v2, v1, Lvo;->n:Z

    .line 232
    .line 233
    if-eqz v2, :cond_c

    .line 234
    .line 235
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-lez v2, :cond_c

    .line 240
    .line 241
    iget-object v2, v1, Lvo;->e:Luo;

    .line 242
    .line 243
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 244
    .line 245
    .line 246
    :cond_c
    :goto_4
    iget-object v2, v1, Lvo;->g:Landroid/view/View;

    .line 247
    .line 248
    if-eqz v2, :cond_d

    .line 249
    .line 250
    iput-object v2, v1, Lvo;->f:Landroid/view/View;

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_d
    iget-object v2, v1, Lvo;->h:Lti4;

    .line 254
    .line 255
    if-nez v2, :cond_e

    .line 256
    .line 257
    goto/16 :goto_8

    .line 258
    .line 259
    :cond_e
    iget-object v2, v0, Lwo;->O:Lwv2;

    .line 260
    .line 261
    if-nez v2, :cond_f

    .line 262
    .line 263
    new-instance v2, Lwv2;

    .line 264
    .line 265
    const/4 v6, 0x3

    .line 266
    invoke-direct {v2, v6, v0}, Lwv2;-><init>(ILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    iput-object v2, v0, Lwo;->O:Lwv2;

    .line 270
    .line 271
    :cond_f
    iget-object v2, v0, Lwo;->O:Lwv2;

    .line 272
    .line 273
    iget-object v6, v1, Lvo;->i:Lz74;

    .line 274
    .line 275
    if-nez v6, :cond_10

    .line 276
    .line 277
    new-instance v6, Lz74;

    .line 278
    .line 279
    iget-object v9, v1, Lvo;->j:Ld61;

    .line 280
    .line 281
    invoke-direct {v6, v9}, Lz74;-><init>(Landroid/content/ContextWrapper;)V

    .line 282
    .line 283
    .line 284
    iput-object v6, v1, Lvo;->i:Lz74;

    .line 285
    .line 286
    iput-object v2, v6, Lz74;->A:Lqj4;

    .line 287
    .line 288
    iget-object v2, v1, Lvo;->h:Lti4;

    .line 289
    .line 290
    iget-object v9, v2, Lti4;->a:Landroid/content/Context;

    .line 291
    .line 292
    invoke-virtual {v2, v6, v9}, Lti4;->b(Lrj4;Landroid/content/Context;)V

    .line 293
    .line 294
    .line 295
    :cond_10
    iget-object v2, v1, Lvo;->i:Lz74;

    .line 296
    .line 297
    iget-object v6, v1, Lvo;->e:Luo;

    .line 298
    .line 299
    iget-object v9, v2, Lz74;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 300
    .line 301
    if-nez v9, :cond_12

    .line 302
    .line 303
    iget-object v9, v2, Lz74;->x:Landroid/view/LayoutInflater;

    .line 304
    .line 305
    const v10, 0x7f0c000d

    .line 306
    .line 307
    .line 308
    invoke-virtual {v9, v10, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    check-cast v6, Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 313
    .line 314
    iput-object v6, v2, Lz74;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 315
    .line 316
    iget-object v6, v2, Lz74;->B:Ly74;

    .line 317
    .line 318
    if-nez v6, :cond_11

    .line 319
    .line 320
    new-instance v6, Ly74;

    .line 321
    .line 322
    invoke-direct {v6, v2}, Ly74;-><init>(Lz74;)V

    .line 323
    .line 324
    .line 325
    iput-object v6, v2, Lz74;->B:Ly74;

    .line 326
    .line 327
    :cond_11
    iget-object v6, v2, Lz74;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 328
    .line 329
    iget-object v9, v2, Lz74;->B:Ly74;

    .line 330
    .line 331
    invoke-virtual {v6, v9}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 332
    .line 333
    .line 334
    iget-object v6, v2, Lz74;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 335
    .line 336
    invoke-virtual {v6, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 337
    .line 338
    .line 339
    :cond_12
    iget-object v2, v2, Lz74;->z:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 340
    .line 341
    iput-object v2, v1, Lvo;->f:Landroid/view/View;

    .line 342
    .line 343
    if-eqz v2, :cond_19

    .line 344
    .line 345
    :goto_5
    iget-object v2, v1, Lvo;->f:Landroid/view/View;

    .line 346
    .line 347
    if-nez v2, :cond_13

    .line 348
    .line 349
    goto/16 :goto_8

    .line 350
    .line 351
    :cond_13
    iget-object v2, v1, Lvo;->g:Landroid/view/View;

    .line 352
    .line 353
    if-eqz v2, :cond_14

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_14
    iget-object v2, v1, Lvo;->i:Lz74;

    .line 357
    .line 358
    iget-object v6, v2, Lz74;->B:Ly74;

    .line 359
    .line 360
    if-nez v6, :cond_15

    .line 361
    .line 362
    new-instance v6, Ly74;

    .line 363
    .line 364
    invoke-direct {v6, v2}, Ly74;-><init>(Lz74;)V

    .line 365
    .line 366
    .line 367
    iput-object v6, v2, Lz74;->B:Ly74;

    .line 368
    .line 369
    :cond_15
    iget-object v2, v2, Lz74;->B:Ly74;

    .line 370
    .line 371
    invoke-virtual {v2}, Ly74;->getCount()I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-lez v2, :cond_19

    .line 376
    .line 377
    :goto_6
    iget-object v2, v1, Lvo;->f:Landroid/view/View;

    .line 378
    .line 379
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    if-nez v2, :cond_16

    .line 384
    .line 385
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 386
    .line 387
    invoke-direct {v2, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 388
    .line 389
    .line 390
    :cond_16
    iget v6, v1, Lvo;->b:I

    .line 391
    .line 392
    iget-object v9, v1, Lvo;->e:Luo;

    .line 393
    .line 394
    invoke-virtual {v9, v6}, Luo;->setBackgroundResource(I)V

    .line 395
    .line 396
    .line 397
    iget-object v6, v1, Lvo;->f:Landroid/view/View;

    .line 398
    .line 399
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    instance-of v9, v6, Landroid/view/ViewGroup;

    .line 404
    .line 405
    if-eqz v9, :cond_17

    .line 406
    .line 407
    check-cast v6, Landroid/view/ViewGroup;

    .line 408
    .line 409
    iget-object v9, v1, Lvo;->f:Landroid/view/View;

    .line 410
    .line 411
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    :cond_17
    iget-object v6, v1, Lvo;->e:Luo;

    .line 415
    .line 416
    iget-object v9, v1, Lvo;->f:Landroid/view/View;

    .line 417
    .line 418
    invoke-virtual {v6, v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 419
    .line 420
    .line 421
    iget-object v2, v1, Lvo;->f:Landroid/view/View;

    .line 422
    .line 423
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-nez v2, :cond_18

    .line 428
    .line 429
    iget-object v2, v1, Lvo;->f:Landroid/view/View;

    .line 430
    .line 431
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 432
    .line 433
    .line 434
    :cond_18
    move v10, v8

    .line 435
    :goto_7
    iput-boolean v7, v1, Lvo;->l:Z

    .line 436
    .line 437
    new-instance v9, Landroid/view/WindowManager$LayoutParams;

    .line 438
    .line 439
    const/high16 v15, 0x820000

    .line 440
    .line 441
    const/16 v16, -0x3

    .line 442
    .line 443
    const/4 v11, -0x2

    .line 444
    const/4 v12, 0x0

    .line 445
    const/4 v13, 0x0

    .line 446
    const/16 v14, 0x3ea

    .line 447
    .line 448
    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 449
    .line 450
    .line 451
    iget v2, v1, Lvo;->c:I

    .line 452
    .line 453
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 454
    .line 455
    iget v2, v1, Lvo;->d:I

    .line 456
    .line 457
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 458
    .line 459
    iget-object v2, v1, Lvo;->e:Luo;

    .line 460
    .line 461
    invoke-interface {v4, v2, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 462
    .line 463
    .line 464
    iput-boolean v5, v1, Lvo;->m:Z

    .line 465
    .line 466
    if-nez v3, :cond_1a

    .line 467
    .line 468
    invoke-virtual {v0}, Lwo;->K()V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :cond_19
    :goto_8
    iput-boolean v5, v1, Lvo;->n:Z

    .line 473
    .line 474
    :cond_1a
    :goto_9
    return-void
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
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
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method

.method public final H(Lvo;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p1, Lvo;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, Lwo;->I(Lvo;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object p0, p1, Lvo;->h:Lti4;

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-virtual {p0, p2, p3, p1}, Lti4;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :cond_2
    return v1
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
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
.end method

.method public final I(Lvo;Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, Lwo;->m0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_5

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p1, Lvo;->k:Z

    .line 9
    .line 10
    iget v2, p1, Lvo;->a:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v3

    .line 16
    :cond_1
    iget-object v0, p0, Lwo;->i0:Lvo;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-eq v0, p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Lwo;->u(Lvo;Z)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lwo;->H:Landroid/view/Window;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v0, v2}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iput-object v4, p1, Lvo;->g:Landroid/view/View;

    .line 38
    .line 39
    :cond_3
    const/16 v4, 0x6c

    .line 40
    .line 41
    if-eqz v2, :cond_5

    .line 42
    .line 43
    if-ne v2, v4, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    move v5, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_5
    :goto_0
    move v5, v3

    .line 49
    :goto_1
    if-eqz v5, :cond_6

    .line 50
    .line 51
    iget-object v6, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 56
    .line 57
    .line 58
    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 59
    .line 60
    check-cast v6, Lsj7;

    .line 61
    .line 62
    iput-boolean v3, v6, Lsj7;->l:Z

    .line 63
    .line 64
    :cond_6
    iget-object v6, p1, Lvo;->g:Landroid/view/View;

    .line 65
    .line 66
    if-nez v6, :cond_1d

    .line 67
    .line 68
    iget-object v6, p1, Lvo;->h:Lti4;

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    if-eqz v6, :cond_7

    .line 72
    .line 73
    iget-boolean v8, p1, Lvo;->o:Z

    .line 74
    .line 75
    if-eqz v8, :cond_17

    .line 76
    .line 77
    :cond_7
    if-nez v6, :cond_10

    .line 78
    .line 79
    iget-object v6, p0, Lwo;->G:Landroid/content/Context;

    .line 80
    .line 81
    if-eqz v2, :cond_8

    .line 82
    .line 83
    if-ne v2, v4, :cond_c

    .line 84
    .line 85
    :cond_8
    iget-object v4, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 86
    .line 87
    if-eqz v4, :cond_c

    .line 88
    .line 89
    new-instance v4, Landroid/util/TypedValue;

    .line 90
    .line 91
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    const v9, 0x7f04000d

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v9, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 102
    .line 103
    .line 104
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    .line 105
    .line 106
    const v10, 0x7f04000e

    .line 107
    .line 108
    .line 109
    if-eqz v9, :cond_9

    .line 110
    .line 111
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 120
    .line 121
    .line 122
    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    .line 123
    .line 124
    invoke-virtual {v9, v11, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_9
    invoke-virtual {v8, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 132
    .line 133
    .line 134
    move-object v9, v7

    .line 135
    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    .line 136
    .line 137
    if-eqz v10, :cond_b

    .line 138
    .line 139
    if-nez v9, :cond_a

    .line 140
    .line 141
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 150
    .line 151
    .line 152
    :cond_a
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    .line 153
    .line 154
    invoke-virtual {v9, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 155
    .line 156
    .line 157
    :cond_b
    if-eqz v9, :cond_c

    .line 158
    .line 159
    new-instance v4, Ld61;

    .line 160
    .line 161
    invoke-direct {v4, v6, v1}, Ld61;-><init>(Landroid/content/Context;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4}, Ld61;->getTheme()Landroid/content/res/Resources$Theme;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 169
    .line 170
    .line 171
    move-object v6, v4

    .line 172
    :cond_c
    new-instance v4, Lti4;

    .line 173
    .line 174
    invoke-direct {v4, v6}, Lti4;-><init>(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    iput-object p0, v4, Lti4;->e:Lri4;

    .line 178
    .line 179
    iget-object v6, p1, Lvo;->h:Lti4;

    .line 180
    .line 181
    if-ne v4, v6, :cond_d

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_d
    if-eqz v6, :cond_e

    .line 185
    .line 186
    iget-object v8, p1, Lvo;->i:Lz74;

    .line 187
    .line 188
    invoke-virtual {v6, v8}, Lti4;->r(Lrj4;)V

    .line 189
    .line 190
    .line 191
    :cond_e
    iput-object v4, p1, Lvo;->h:Lti4;

    .line 192
    .line 193
    iget-object v6, p1, Lvo;->i:Lz74;

    .line 194
    .line 195
    if-eqz v6, :cond_f

    .line 196
    .line 197
    iget-object v8, v4, Lti4;->a:Landroid/content/Context;

    .line 198
    .line 199
    invoke-virtual {v4, v6, v8}, Lti4;->b(Lrj4;Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    :cond_f
    :goto_3
    iget-object v4, p1, Lvo;->h:Lti4;

    .line 203
    .line 204
    if-nez v4, :cond_10

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_10
    if-eqz v5, :cond_12

    .line 208
    .line 209
    iget-object v4, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 210
    .line 211
    if-eqz v4, :cond_12

    .line 212
    .line 213
    iget-object v6, p0, Lwo;->N:Lf96;

    .line 214
    .line 215
    if-nez v6, :cond_11

    .line 216
    .line 217
    new-instance v6, Lf96;

    .line 218
    .line 219
    const/4 v8, 0x5

    .line 220
    invoke-direct {v6, v8, p0}, Lf96;-><init>(ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iput-object v6, p0, Lwo;->N:Lf96;

    .line 224
    .line 225
    :cond_11
    iget-object v6, p1, Lvo;->h:Lti4;

    .line 226
    .line 227
    iget-object v8, p0, Lwo;->N:Lf96;

    .line 228
    .line 229
    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;Lqj4;)V

    .line 230
    .line 231
    .line 232
    :cond_12
    iget-object v4, p1, Lvo;->h:Lti4;

    .line 233
    .line 234
    invoke-virtual {v4}, Lti4;->w()V

    .line 235
    .line 236
    .line 237
    iget-object v4, p1, Lvo;->h:Lti4;

    .line 238
    .line 239
    invoke-interface {v0, v2, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_16

    .line 244
    .line 245
    iget-object p2, p1, Lvo;->h:Lti4;

    .line 246
    .line 247
    if-nez p2, :cond_13

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_13
    if-eqz p2, :cond_14

    .line 251
    .line 252
    iget-object v0, p1, Lvo;->i:Lz74;

    .line 253
    .line 254
    invoke-virtual {p2, v0}, Lti4;->r(Lrj4;)V

    .line 255
    .line 256
    .line 257
    :cond_14
    iput-object v7, p1, Lvo;->h:Lti4;

    .line 258
    .line 259
    :goto_4
    if-eqz v5, :cond_15

    .line 260
    .line 261
    iget-object p1, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 262
    .line 263
    if-eqz p1, :cond_15

    .line 264
    .line 265
    iget-object p0, p0, Lwo;->N:Lf96;

    .line 266
    .line 267
    invoke-virtual {p1, v7, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;Lqj4;)V

    .line 268
    .line 269
    .line 270
    :cond_15
    :goto_5
    return v1

    .line 271
    :cond_16
    iput-boolean v1, p1, Lvo;->o:Z

    .line 272
    .line 273
    :cond_17
    iget-object v2, p1, Lvo;->h:Lti4;

    .line 274
    .line 275
    invoke-virtual {v2}, Lti4;->w()V

    .line 276
    .line 277
    .line 278
    iget-object v2, p1, Lvo;->p:Landroid/os/Bundle;

    .line 279
    .line 280
    if-eqz v2, :cond_18

    .line 281
    .line 282
    iget-object v4, p1, Lvo;->h:Lti4;

    .line 283
    .line 284
    invoke-virtual {v4, v2}, Lti4;->s(Landroid/os/Bundle;)V

    .line 285
    .line 286
    .line 287
    iput-object v7, p1, Lvo;->p:Landroid/os/Bundle;

    .line 288
    .line 289
    :cond_18
    iget-object v2, p1, Lvo;->g:Landroid/view/View;

    .line 290
    .line 291
    iget-object v4, p1, Lvo;->h:Lti4;

    .line 292
    .line 293
    invoke-interface {v0, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-nez v0, :cond_1a

    .line 298
    .line 299
    if-eqz v5, :cond_19

    .line 300
    .line 301
    iget-object p2, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 302
    .line 303
    if-eqz p2, :cond_19

    .line 304
    .line 305
    iget-object p0, p0, Lwo;->N:Lf96;

    .line 306
    .line 307
    invoke-virtual {p2, v7, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;Lqj4;)V

    .line 308
    .line 309
    .line 310
    :cond_19
    iget-object p0, p1, Lvo;->h:Lti4;

    .line 311
    .line 312
    invoke-virtual {p0}, Lti4;->v()V

    .line 313
    .line 314
    .line 315
    return v1

    .line 316
    :cond_1a
    if-eqz p2, :cond_1b

    .line 317
    .line 318
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 319
    .line 320
    .line 321
    move-result p2

    .line 322
    goto :goto_6

    .line 323
    :cond_1b
    const/4 p2, -0x1

    .line 324
    :goto_6
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 329
    .line 330
    .line 331
    move-result p2

    .line 332
    if-eq p2, v3, :cond_1c

    .line 333
    .line 334
    move p2, v3

    .line 335
    goto :goto_7

    .line 336
    :cond_1c
    move p2, v1

    .line 337
    :goto_7
    iget-object v0, p1, Lvo;->h:Lti4;

    .line 338
    .line 339
    invoke-virtual {v0, p2}, Lti4;->setQwertyMode(Z)V

    .line 340
    .line 341
    .line 342
    iget-object p2, p1, Lvo;->h:Lti4;

    .line 343
    .line 344
    invoke-virtual {p2}, Lti4;->v()V

    .line 345
    .line 346
    .line 347
    :cond_1d
    iput-boolean v3, p1, Lvo;->k:Z

    .line 348
    .line 349
    iput-boolean v1, p1, Lvo;->l:Z

    .line 350
    .line 351
    iput-object p1, p0, Lwo;->i0:Lvo;

    .line 352
    .line 353
    return v3
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final J()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Lwo;->V:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v0, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final K()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lwo;->B0:Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, v1}, Lwo;->B(I)Lvo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-boolean v0, v0, Lvo;->m:Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    move v1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, Lwo;->P:Lh8;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lwo;->C0:Landroid/window/OnBackInvokedCallback;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lwo;->B0:Landroid/window/OnBackInvokedDispatcher;

    .line 36
    .line 37
    invoke-static {v0, p0}, Lqo;->b(Ljava/lang/Object;Lwo;)Landroid/window/OnBackInvokedCallback;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lwo;->C0:Landroid/window/OnBackInvokedCallback;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    if-nez v1, :cond_4

    .line 45
    .line 46
    iget-object v0, p0, Lwo;->C0:Landroid/window/OnBackInvokedCallback;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object v1, p0, Lwo;->B0:Landroid/window/OnBackInvokedDispatcher;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lqo;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lwo;->C0:Landroid/window/OnBackInvokedCallback;

    .line 57
    .line 58
    :cond_4
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of p0, p0, Lwo;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-string p0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v0, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 28
    .line 29
    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
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

.method public final e()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lwo;->k0:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v1, v0}, Lwo;->o(ZZ)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lwo;->z()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lwo;->F:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v2, v1, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    :try_start_0
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, Lb96;->C(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 35
    :catch_1
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lwo;->J:Lu98;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    iput-boolean v0, p0, Lwo;->x0:Z

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-boolean v2, v1, Lu98;->h:Z

    .line 46
    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    iget-object v2, v1, Lu98;->e:Lsk1;

    .line 50
    .line 51
    check-cast v2, Lsj7;

    .line 52
    .line 53
    iget v3, v2, Lsj7;->b:I

    .line 54
    .line 55
    iput-boolean v0, v1, Lu98;->h:Z

    .line 56
    .line 57
    and-int/lit8 v1, v3, -0x5

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    or-int/2addr v1, v3

    .line 61
    invoke-virtual {v2, v1}, Lsj7;->a(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_1
    sget-object v1, Lko;->D:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v1

    .line 67
    :try_start_3
    invoke-static {p0}, Lko;->h(Lwo;)V

    .line 68
    .line 69
    .line 70
    sget-object v2, Lko;->C:Los;

    .line 71
    .line 72
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Los;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    monitor-exit v1

    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 84
    throw p0

    .line 85
    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    .line 86
    .line 87
    iget-object v2, p0, Lwo;->G:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lwo;->n0:Landroid/content/res/Configuration;

    .line 101
    .line 102
    iput-boolean v0, p0, Lwo;->l0:Z

    .line 103
    .line 104
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lwo;->F:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lko;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-static {p0}, Lko;->h(Lwo;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p0

    .line 18
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lwo;->u0:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lwo;->H:Landroid/view/Window;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lwo;->w0:Llo;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lwo;->m0:Z

    .line 35
    .line 36
    iget v0, p0, Lwo;->o0:I

    .line 37
    .line 38
    const/16 v1, -0x64

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lwo;->F:Ljava/lang/Object;

    .line 43
    .line 44
    instance-of v1, v0, Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    check-cast v0, Landroid/app/Activity;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Lwo;->D0:Lzt6;

    .line 57
    .line 58
    iget-object v1, p0, Lwo;->F:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget v2, p0, Lwo;->o0:I

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v0, Lwo;->D0:Lzt6;

    .line 79
    .line 80
    iget-object v1, p0, Lwo;->F:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Lzt6;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v0, p0, Lwo;->s0:Lso;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0}, Lf1;->c()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object p0, p0, Lwo;->t0:Lso;

    .line 101
    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0}, Lf1;->c()V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final g(Lti4;Landroid/view/MenuItem;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lwo;->H:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v2, p0, Lwo;->m0:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Lti4;->k()Lti4;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, Lwo;->h0:[Lvo;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    array-length v2, p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v1

    .line 25
    :goto_0
    move v3, v1

    .line 26
    :goto_1
    if-ge v3, v2, :cond_2

    .line 27
    .line 28
    aget-object v4, p0, v3

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget-object v5, v4, Lvo;->h:Lti4;

    .line 33
    .line 34
    if-ne v5, p1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v4, 0x0

    .line 41
    :goto_2
    if-eqz v4, :cond_3

    .line 42
    .line 43
    iget p0, v4, Lvo;->a:I

    .line 44
    .line 45
    invoke-interface {v0, p0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_3
    return v1
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
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

.method public final i(I)Z
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/16 v1, 0x6d

    .line 4
    .line 5
    const/16 v2, 0x6c

    .line 6
    .line 7
    const-string v3, "AppCompatDelegate"

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 12
    .line 13
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v0, 0x9

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 23
    .line 24
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move p1, v1

    .line 28
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lwo;->f0:Z

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-ne p1, v2, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    iget-boolean v0, p0, Lwo;->b0:Z

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-ne p1, v4, :cond_3

    .line 42
    .line 43
    iput-boolean v3, p0, Lwo;->b0:Z

    .line 44
    .line 45
    :cond_3
    if-eq p1, v4, :cond_9

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    if-eq p1, v0, :cond_8

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    if-eq p1, v0, :cond_7

    .line 52
    .line 53
    const/16 v0, 0xa

    .line 54
    .line 55
    if-eq p1, v0, :cond_6

    .line 56
    .line 57
    if-eq p1, v2, :cond_5

    .line 58
    .line 59
    if-eq p1, v1, :cond_4

    .line 60
    .line 61
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_4
    invoke-virtual {p0}, Lwo;->J()V

    .line 69
    .line 70
    .line 71
    iput-boolean v4, p0, Lwo;->c0:Z

    .line 72
    .line 73
    return v4

    .line 74
    :cond_5
    invoke-virtual {p0}, Lwo;->J()V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, Lwo;->b0:Z

    .line 78
    .line 79
    return v4

    .line 80
    :cond_6
    invoke-virtual {p0}, Lwo;->J()V

    .line 81
    .line 82
    .line 83
    iput-boolean v4, p0, Lwo;->d0:Z

    .line 84
    .line 85
    return v4

    .line 86
    :cond_7
    invoke-virtual {p0}, Lwo;->J()V

    .line 87
    .line 88
    .line 89
    iput-boolean v4, p0, Lwo;->a0:Z

    .line 90
    .line 91
    return v4

    .line 92
    :cond_8
    invoke-virtual {p0}, Lwo;->J()V

    .line 93
    .line 94
    .line 95
    iput-boolean v4, p0, Lwo;->Z:Z

    .line 96
    .line 97
    return v4

    .line 98
    :cond_9
    invoke-virtual {p0}, Lwo;->J()V

    .line 99
    .line 100
    .line 101
    iput-boolean v4, p0, Lwo;->f0:Z

    .line 102
    .line 103
    return v4
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final j(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lwo;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwo;->W:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lwo;->G:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final k(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lwo;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwo;->W:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lwo;->I:Lro;

    .line 22
    .line 23
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, Lro;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final l(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lwo;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwo;->W:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lwo;->I:Lro;

    .line 22
    .line 23
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, Lro;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public final m(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lwo;->L:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lwo;->J:Lu98;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p0, v0, Lu98;->e:Lsk1;

    .line 16
    .line 17
    check-cast p0, Lsj7;

    .line 18
    .line 19
    iget-boolean v0, p0, Lsj7;->g:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 24
    .line 25
    iput-object p1, p0, Lsj7;->h:Ljava/lang/CharSequence;

    .line 26
    .line 27
    iget v1, p0, Lsj7;->b:I

    .line 28
    .line 29
    and-int/lit8 v1, v1, 0x8

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-boolean p0, p0, Lsj7;->g:Z

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0, p1}, Le58;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object p0, p0, Lwo;->X:Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final o(ZZ)Z
    .locals 13

    .line 1
    iget-boolean v0, p0, Lwo;->m0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/16 v0, -0x64

    .line 8
    .line 9
    iget v2, p0, Lwo;->o0:I

    .line 10
    .line 11
    if-eq v2, v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    sget v2, Lko;->x:I

    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p0, v0, v2}, Lwo;->E(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v5, 0x21

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    if-ge v4, v5, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Lwo;->q(Landroid/content/Context;)Lza4;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v5, v6

    .line 35
    :goto_1
    if-nez p2, :cond_3

    .line 36
    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Loo;->b(Landroid/content/res/Configuration;)Lza4;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :cond_3
    invoke-static {v0, v3, v5, v6, v1}, Lwo;->v(Landroid/content/Context;ILza4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iget-boolean v3, p0, Lwo;->r0:Z

    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    iget-object v8, p0, Lwo;->F:Ljava/lang/Object;

    .line 59
    .line 60
    if-nez v3, :cond_6

    .line 61
    .line 62
    instance-of v3, v8, Landroid/app/Activity;

    .line 63
    .line 64
    if-eqz v3, :cond_6

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    move v3, v1

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    const/16 v9, 0x1d

    .line 75
    .line 76
    if-lt v4, v9, :cond_5

    .line 77
    .line 78
    const/high16 v4, 0x100c0000

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    const/high16 v4, 0xc0000

    .line 82
    .line 83
    :goto_2
    :try_start_0
    new-instance v9, Landroid/content/ComponentName;

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-direct {v9, v0, v10}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v9, v4}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-eqz v3, :cond_6

    .line 97
    .line 98
    iget v3, v3, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 99
    .line 100
    iput v3, p0, Lwo;->q0:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :catch_0
    move-exception v3

    .line 104
    const-string v4, "AppCompatDelegate"

    .line 105
    .line 106
    const-string v9, "Exception while getting ActivityInfo"

    .line 107
    .line 108
    invoke-static {v4, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 109
    .line 110
    .line 111
    iput v1, p0, Lwo;->q0:I

    .line 112
    .line 113
    :cond_6
    :goto_3
    iput-boolean v7, p0, Lwo;->r0:Z

    .line 114
    .line 115
    iget v3, p0, Lwo;->q0:I

    .line 116
    .line 117
    :goto_4
    iget-object v4, p0, Lwo;->n0:Landroid/content/res/Configuration;

    .line 118
    .line 119
    if-nez v4, :cond_7

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    :cond_7
    iget v9, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 130
    .line 131
    and-int/lit8 v9, v9, 0x30

    .line 132
    .line 133
    iget v10, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 134
    .line 135
    and-int/lit8 v10, v10, 0x30

    .line 136
    .line 137
    invoke-static {v4}, Loo;->b(Landroid/content/res/Configuration;)Lza4;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    if-nez v5, :cond_8

    .line 142
    .line 143
    move-object v5, v6

    .line 144
    goto :goto_5

    .line 145
    :cond_8
    invoke-static {p2}, Loo;->b(Landroid/content/res/Configuration;)Lza4;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    :goto_5
    if-eq v9, v10, :cond_9

    .line 150
    .line 151
    const/16 v9, 0x200

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_9
    move v9, v1

    .line 155
    :goto_6
    if-eqz v5, :cond_a

    .line 156
    .line 157
    invoke-virtual {v4, v5}, Lza4;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-nez v4, :cond_a

    .line 162
    .line 163
    or-int/lit16 v9, v9, 0x2004

    .line 164
    .line 165
    :cond_a
    not-int v4, v3

    .line 166
    and-int/2addr v4, v9

    .line 167
    const/16 v11, 0x1c

    .line 168
    .line 169
    if-eqz v4, :cond_e

    .line 170
    .line 171
    if-eqz p1, :cond_e

    .line 172
    .line 173
    iget-boolean p1, p0, Lwo;->k0:Z

    .line 174
    .line 175
    if-eqz p1, :cond_e

    .line 176
    .line 177
    sget-boolean p1, Lwo;->F0:Z

    .line 178
    .line 179
    if-nez p1, :cond_b

    .line 180
    .line 181
    iget-boolean p1, p0, Lwo;->l0:Z

    .line 182
    .line 183
    if-eqz p1, :cond_e

    .line 184
    .line 185
    :cond_b
    instance-of p1, v8, Landroid/app/Activity;

    .line 186
    .line 187
    if-eqz p1, :cond_e

    .line 188
    .line 189
    move-object p1, v8

    .line 190
    check-cast p1, Landroid/app/Activity;

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-nez v4, :cond_e

    .line 197
    .line 198
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 199
    .line 200
    const/16 v12, 0x1f

    .line 201
    .line 202
    if-lt v4, v12, :cond_c

    .line 203
    .line 204
    and-int/lit16 v12, v9, 0x2000

    .line 205
    .line 206
    if-eqz v12, :cond_c

    .line 207
    .line 208
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    invoke-virtual {v12}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    invoke-virtual {v12, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 221
    .line 222
    .line 223
    :cond_c
    if-lt v4, v11, :cond_d

    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_d
    new-instance p2, Landroid/os/Handler;

    .line 230
    .line 231
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-direct {p2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 236
    .line 237
    .line 238
    new-instance v4, Ly0;

    .line 239
    .line 240
    invoke-direct {v4, v7, p1}, Ly0;-><init>(ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 244
    .line 245
    .line 246
    :goto_7
    move p1, v7

    .line 247
    goto :goto_8

    .line 248
    :cond_e
    move p1, v1

    .line 249
    :goto_8
    if-nez p1, :cond_1e

    .line 250
    .line 251
    if-eqz v9, :cond_1e

    .line 252
    .line 253
    and-int p1, v9, v3

    .line 254
    .line 255
    if-ne p1, v9, :cond_f

    .line 256
    .line 257
    move v1, v7

    .line 258
    :cond_f
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    new-instance p2, Landroid/content/res/Configuration;

    .line 263
    .line 264
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-direct {p2, v3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    iget v3, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 276
    .line 277
    and-int/lit8 v3, v3, -0x31

    .line 278
    .line 279
    or-int/2addr v3, v10

    .line 280
    iput v3, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 281
    .line 282
    if-eqz v5, :cond_10

    .line 283
    .line 284
    invoke-static {p2, v5}, Loo;->d(Landroid/content/res/Configuration;Lza4;)V

    .line 285
    .line 286
    .line 287
    :cond_10
    invoke-virtual {p1, p2, v6}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 288
    .line 289
    .line 290
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 291
    .line 292
    const/16 v4, 0x1a

    .line 293
    .line 294
    if-ge v3, v4, :cond_1b

    .line 295
    .line 296
    if-lt v3, v11, :cond_11

    .line 297
    .line 298
    goto/16 :goto_10

    .line 299
    .line 300
    :cond_11
    sget-boolean v3, Ln85;->j:Z

    .line 301
    .line 302
    const-string v4, "ResourcesFlusher"

    .line 303
    .line 304
    if-nez v3, :cond_12

    .line 305
    .line 306
    :try_start_1
    const-class v3, Landroid/content/res/Resources;

    .line 307
    .line 308
    const-string v9, "mResourcesImpl"

    .line 309
    .line 310
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    sput-object v3, Ln85;->i:Ljava/lang/reflect/Field;

    .line 315
    .line 316
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 317
    .line 318
    .line 319
    goto :goto_9

    .line 320
    :catch_1
    move-exception v3

    .line 321
    const-string v9, "Could not retrieve Resources#mResourcesImpl field"

    .line 322
    .line 323
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 324
    .line 325
    .line 326
    :goto_9
    sput-boolean v7, Ln85;->j:Z

    .line 327
    .line 328
    :cond_12
    sget-object v3, Ln85;->i:Ljava/lang/reflect/Field;

    .line 329
    .line 330
    if-nez v3, :cond_13

    .line 331
    .line 332
    goto/16 :goto_10

    .line 333
    .line 334
    :cond_13
    :try_start_2
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 338
    goto :goto_a

    .line 339
    :catch_2
    move-exception p1

    .line 340
    const-string v3, "Could not retrieve value from Resources#mResourcesImpl"

    .line 341
    .line 342
    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 343
    .line 344
    .line 345
    move-object p1, v6

    .line 346
    :goto_a
    if-nez p1, :cond_14

    .line 347
    .line 348
    goto/16 :goto_10

    .line 349
    .line 350
    :cond_14
    sget-boolean v3, Ln85;->d:Z

    .line 351
    .line 352
    if-nez v3, :cond_15

    .line 353
    .line 354
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    const-string v9, "mDrawableCache"

    .line 359
    .line 360
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    sput-object v3, Ln85;->c:Ljava/lang/reflect/Field;

    .line 365
    .line 366
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_3

    .line 367
    .line 368
    .line 369
    goto :goto_b

    .line 370
    :catch_3
    move-exception v3

    .line 371
    const-string v9, "Could not retrieve ResourcesImpl#mDrawableCache field"

    .line 372
    .line 373
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 374
    .line 375
    .line 376
    :goto_b
    sput-boolean v7, Ln85;->d:Z

    .line 377
    .line 378
    :cond_15
    sget-object v3, Ln85;->c:Ljava/lang/reflect/Field;

    .line 379
    .line 380
    if-eqz v3, :cond_16

    .line 381
    .line 382
    :try_start_4
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    .line 386
    goto :goto_c

    .line 387
    :catch_4
    move-exception p1

    .line 388
    const-string v3, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    .line 389
    .line 390
    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 391
    .line 392
    .line 393
    :cond_16
    move-object p1, v6

    .line 394
    :goto_c
    if-eqz p1, :cond_1b

    .line 395
    .line 396
    sget-boolean v3, Ln85;->f:Z

    .line 397
    .line 398
    if-nez v3, :cond_17

    .line 399
    .line 400
    :try_start_5
    const-string v3, "android.content.res.ThemedResourceCache"

    .line 401
    .line 402
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    sput-object v3, Ln85;->e:Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :catch_5
    move-exception v3

    .line 410
    const-string v9, "Could not find ThemedResourceCache class"

    .line 411
    .line 412
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 413
    .line 414
    .line 415
    :goto_d
    sput-boolean v7, Ln85;->f:Z

    .line 416
    .line 417
    :cond_17
    sget-object v3, Ln85;->e:Ljava/lang/Class;

    .line 418
    .line 419
    if-nez v3, :cond_18

    .line 420
    .line 421
    goto :goto_10

    .line 422
    :cond_18
    sget-boolean v9, Ln85;->h:Z

    .line 423
    .line 424
    if-nez v9, :cond_19

    .line 425
    .line 426
    :try_start_6
    const-string v9, "mUnthemedEntries"

    .line 427
    .line 428
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    sput-object v3, Ln85;->g:Ljava/lang/reflect/Field;

    .line 433
    .line 434
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_6

    .line 435
    .line 436
    .line 437
    goto :goto_e

    .line 438
    :catch_6
    move-exception v3

    .line 439
    const-string v9, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"

    .line 440
    .line 441
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 442
    .line 443
    .line 444
    :goto_e
    sput-boolean v7, Ln85;->h:Z

    .line 445
    .line 446
    :cond_19
    sget-object v3, Ln85;->g:Ljava/lang/reflect/Field;

    .line 447
    .line 448
    if-nez v3, :cond_1a

    .line 449
    .line 450
    goto :goto_10

    .line 451
    :cond_1a
    :try_start_7
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    check-cast p1, Landroid/util/LongSparseArray;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    .line 456
    .line 457
    move-object v6, p1

    .line 458
    goto :goto_f

    .line 459
    :catch_7
    move-exception p1

    .line 460
    const-string v3, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"

    .line 461
    .line 462
    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 463
    .line 464
    .line 465
    :goto_f
    if-eqz v6, :cond_1b

    .line 466
    .line 467
    invoke-virtual {v6}, Landroid/util/LongSparseArray;->clear()V

    .line 468
    .line 469
    .line 470
    :cond_1b
    :goto_10
    iget p1, p0, Lwo;->p0:I

    .line 471
    .line 472
    if-eqz p1, :cond_1c

    .line 473
    .line 474
    invoke-virtual {v0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    iget v3, p0, Lwo;->p0:I

    .line 482
    .line 483
    invoke-virtual {p1, v3, v7}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 484
    .line 485
    .line 486
    :cond_1c
    if-eqz v1, :cond_1f

    .line 487
    .line 488
    instance-of p1, v8, Landroid/app/Activity;

    .line 489
    .line 490
    if-eqz p1, :cond_1f

    .line 491
    .line 492
    check-cast v8, Landroid/app/Activity;

    .line 493
    .line 494
    instance-of p1, v8, Lt54;

    .line 495
    .line 496
    if-eqz p1, :cond_1d

    .line 497
    .line 498
    move-object p1, v8

    .line 499
    check-cast p1, Lt54;

    .line 500
    .line 501
    invoke-interface {p1}, Lt54;->k()Lin8;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    invoke-virtual {p1}, Lin8;->G0()Lk54;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    sget-object v1, Lk54;->y:Lk54;

    .line 510
    .line 511
    invoke-virtual {p1, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 512
    .line 513
    .line 514
    move-result p1

    .line 515
    if-ltz p1, :cond_1f

    .line 516
    .line 517
    invoke-virtual {v8, p2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 518
    .line 519
    .line 520
    goto :goto_11

    .line 521
    :cond_1d
    iget-boolean p1, p0, Lwo;->l0:Z

    .line 522
    .line 523
    if-eqz p1, :cond_1f

    .line 524
    .line 525
    iget-boolean p1, p0, Lwo;->m0:Z

    .line 526
    .line 527
    if-nez p1, :cond_1f

    .line 528
    .line 529
    invoke-virtual {v8, p2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 530
    .line 531
    .line 532
    goto :goto_11

    .line 533
    :cond_1e
    move v7, p1

    .line 534
    :cond_1f
    :goto_11
    if-eqz v5, :cond_20

    .line 535
    .line 536
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    invoke-static {p1}, Loo;->b(Landroid/content/res/Configuration;)Lza4;

    .line 545
    .line 546
    .line 547
    move-result-object p1

    .line 548
    invoke-static {p1}, Loo;->c(Lza4;)V

    .line 549
    .line 550
    .line 551
    :cond_20
    if-nez v2, :cond_21

    .line 552
    .line 553
    invoke-virtual {p0, v0}, Lwo;->A(Landroid/content/Context;)Lf1;

    .line 554
    .line 555
    .line 556
    move-result-object p1

    .line 557
    invoke-virtual {p1}, Lf1;->r()V

    .line 558
    .line 559
    .line 560
    goto :goto_12

    .line 561
    :cond_21
    iget-object p1, p0, Lwo;->s0:Lso;

    .line 562
    .line 563
    if-eqz p1, :cond_22

    .line 564
    .line 565
    invoke-virtual {p1}, Lf1;->c()V

    .line 566
    .line 567
    .line 568
    :cond_22
    :goto_12
    iget-object p1, p0, Lwo;->t0:Lso;

    .line 569
    .line 570
    const/4 p2, 0x3

    .line 571
    if-ne v2, p2, :cond_24

    .line 572
    .line 573
    if-nez p1, :cond_23

    .line 574
    .line 575
    new-instance p1, Lso;

    .line 576
    .line 577
    invoke-direct {p1, p0, v0}, Lso;-><init>(Lwo;Landroid/content/Context;)V

    .line 578
    .line 579
    .line 580
    iput-object p1, p0, Lwo;->t0:Lso;

    .line 581
    .line 582
    :cond_23
    iget-object p0, p0, Lwo;->t0:Lso;

    .line 583
    .line 584
    invoke-virtual {p0}, Lf1;->r()V

    .line 585
    .line 586
    .line 587
    goto :goto_13

    .line 588
    :cond_24
    if-eqz p1, :cond_25

    .line 589
    .line 590
    invoke-virtual {p1}, Lf1;->c()V

    .line 591
    .line 592
    .line 593
    :cond_25
    :goto_13
    return v7
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
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
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    iget-object p1, p0, Lwo;->A0:Loq;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    sget-object p1, Lqv5;->j:[I

    .line 7
    .line 8
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v2, 0x74

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance p1, Loq;

    .line 26
    .line 27
    invoke-direct {p1}, Loq;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lwo;->A0:Loq;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Loq;

    .line 50
    .line 51
    iput-object p1, p0, Lwo;->A0:Loq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v3, "Failed to instantiate custom view inflater "

    .line 59
    .line 60
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v2, ". Falling back to default."

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v2, "AppCompatDelegate"

    .line 76
    .line 77
    invoke-static {v2, v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    new-instance p1, Loq;

    .line 81
    .line 82
    invoke-direct {p1}, Loq;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lwo;->A0:Loq;

    .line 86
    .line 87
    :cond_1
    :goto_0
    iget-object p0, p0, Lwo;->A0:Loq;

    .line 88
    .line 89
    sget p1, La38;->a:I

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget-object p1, Lqv5;->x:[I

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    invoke-virtual {p3, p4, p1, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const/4 v0, 0x4

    .line 102
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    const-string v3, "AppCompatViewInflater"

    .line 109
    .line 110
    const-string v4, "app:theme is now deprecated. Please move to using android:theme instead."

    .line 111
    .line 112
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 116
    .line 117
    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    instance-of p1, p3, Ld61;

    .line 121
    .line 122
    if-eqz p1, :cond_3

    .line 123
    .line 124
    move-object p1, p3

    .line 125
    check-cast p1, Ld61;

    .line 126
    .line 127
    iget p1, p1, Ld61;->a:I

    .line 128
    .line 129
    if-eq p1, v2, :cond_4

    .line 130
    .line 131
    :cond_3
    new-instance p1, Ld61;

    .line 132
    .line 133
    invoke-direct {p1, p3, v2}, Ld61;-><init>(Landroid/content/Context;I)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    move-object p1, p3

    .line 138
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const/4 v3, 0x3

    .line 146
    const/4 v4, 0x1

    .line 147
    const/4 v6, -0x1

    .line 148
    sparse-switch v2, :sswitch_data_0

    .line 149
    .line 150
    .line 151
    :goto_2
    move v0, v6

    .line 152
    goto/16 :goto_3

    .line 153
    .line 154
    :sswitch_0
    const-string v0, "Button"

    .line 155
    .line 156
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_5

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    const/16 v0, 0xd

    .line 164
    .line 165
    goto/16 :goto_3

    .line 166
    .line 167
    :sswitch_1
    const-string v0, "EditText"

    .line 168
    .line 169
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_6

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_6
    const/16 v0, 0xc

    .line 177
    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    :sswitch_2
    const-string v0, "CheckBox"

    .line 181
    .line 182
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_7

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    const/16 v0, 0xb

    .line 190
    .line 191
    goto/16 :goto_3

    .line 192
    .line 193
    :sswitch_3
    const-string v0, "AutoCompleteTextView"

    .line 194
    .line 195
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-nez v0, :cond_8

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_8
    const/16 v0, 0xa

    .line 203
    .line 204
    goto/16 :goto_3

    .line 205
    .line 206
    :sswitch_4
    const-string v0, "ImageView"

    .line 207
    .line 208
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_9

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_9
    const/16 v0, 0x9

    .line 216
    .line 217
    goto/16 :goto_3

    .line 218
    .line 219
    :sswitch_5
    const-string v0, "ToggleButton"

    .line 220
    .line 221
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_a

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_a
    const/16 v0, 0x8

    .line 229
    .line 230
    goto/16 :goto_3

    .line 231
    .line 232
    :sswitch_6
    const-string v0, "RadioButton"

    .line 233
    .line 234
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-nez v0, :cond_b

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_b
    const/4 v0, 0x7

    .line 242
    goto :goto_3

    .line 243
    :sswitch_7
    const-string v0, "Spinner"

    .line 244
    .line 245
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_c

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_c
    const/4 v0, 0x6

    .line 253
    goto :goto_3

    .line 254
    :sswitch_8
    const-string v0, "SeekBar"

    .line 255
    .line 256
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_d

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_d
    const/4 v0, 0x5

    .line 264
    goto :goto_3

    .line 265
    :sswitch_9
    const-string v2, "ImageButton"

    .line 266
    .line 267
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-nez v2, :cond_12

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :sswitch_a
    const-string v0, "TextView"

    .line 275
    .line 276
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-nez v0, :cond_e

    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :cond_e
    move v0, v3

    .line 285
    goto :goto_3

    .line 286
    :sswitch_b
    const-string v0, "MultiAutoCompleteTextView"

    .line 287
    .line 288
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_f

    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :cond_f
    const/4 v0, 0x2

    .line 297
    goto :goto_3

    .line 298
    :sswitch_c
    const-string v0, "CheckedTextView"

    .line 299
    .line 300
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-nez v0, :cond_10

    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :cond_10
    move v0, v4

    .line 309
    goto :goto_3

    .line 310
    :sswitch_d
    const-string v0, "RatingBar"

    .line 311
    .line 312
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-nez v0, :cond_11

    .line 317
    .line 318
    goto/16 :goto_2

    .line 319
    .line 320
    :cond_11
    const/4 v0, 0x0

    .line 321
    :cond_12
    :goto_3
    packed-switch v0, :pswitch_data_0

    .line 322
    .line 323
    .line 324
    move-object v0, v1

    .line 325
    goto :goto_4

    .line 326
    :pswitch_0
    invoke-virtual {p0, p1, p4}, Loq;->b(Landroid/content/Context;Landroid/util/AttributeSet;)Lbo;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    goto :goto_4

    .line 331
    :pswitch_1
    new-instance v0, Lap;

    .line 332
    .line 333
    invoke-direct {v0, p1, p4}, Lap;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :pswitch_2
    invoke-virtual {p0, p1, p4}, Loq;->c(Landroid/content/Context;Landroid/util/AttributeSet;)Leo;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    goto :goto_4

    .line 342
    :pswitch_3
    invoke-virtual {p0, p1, p4}, Loq;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lzn;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    goto :goto_4

    .line 347
    :pswitch_4
    new-instance v0, Ldp;

    .line 348
    .line 349
    invoke-direct {v0, p1, p4, v5}, Ldp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 350
    .line 351
    .line 352
    goto :goto_4

    .line 353
    :pswitch_5
    new-instance v0, Lmq;

    .line 354
    .line 355
    invoke-direct {v0, p1, p4}, Lmq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 356
    .line 357
    .line 358
    goto :goto_4

    .line 359
    :pswitch_6
    invoke-virtual {p0, p1, p4}, Loq;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Lgp;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    goto :goto_4

    .line 364
    :pswitch_7
    new-instance v0, Lvp;

    .line 365
    .line 366
    invoke-direct {v0, p1, p4}, Lvp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 367
    .line 368
    .line 369
    goto :goto_4

    .line 370
    :pswitch_8
    new-instance v0, Ljp;

    .line 371
    .line 372
    invoke-direct {v0, p1, p4}, Ljp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 373
    .line 374
    .line 375
    goto :goto_4

    .line 376
    :pswitch_9
    new-instance v0, Lcp;

    .line 377
    .line 378
    const v2, 0x7f040286

    .line 379
    .line 380
    .line 381
    invoke-direct {v0, p1, p4, v2}, Lcp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 382
    .line 383
    .line 384
    goto :goto_4

    .line 385
    :pswitch_a
    invoke-virtual {p0, p1, p4}, Loq;->e(Landroid/content/Context;Landroid/util/AttributeSet;)Lgq;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    goto :goto_4

    .line 390
    :pswitch_b
    new-instance v0, Lep;

    .line 391
    .line 392
    invoke-direct {v0, p1, p4}, Lep;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 393
    .line 394
    .line 395
    goto :goto_4

    .line 396
    :pswitch_c
    new-instance v0, Lfo;

    .line 397
    .line 398
    invoke-direct {v0, p1, p4}, Lfo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 399
    .line 400
    .line 401
    goto :goto_4

    .line 402
    :pswitch_d
    new-instance v0, Lhp;

    .line 403
    .line 404
    invoke-direct {v0, p1, p4}, Lhp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 405
    .line 406
    .line 407
    :goto_4
    if-nez v0, :cond_17

    .line 408
    .line 409
    if-eq p3, p1, :cond_17

    .line 410
    .line 411
    iget-object p3, p0, Loq;->a:[Ljava/lang/Object;

    .line 412
    .line 413
    const-string v0, "view"

    .line 414
    .line 415
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-eqz v0, :cond_13

    .line 420
    .line 421
    const-string p2, "class"

    .line 422
    .line 423
    invoke-interface {p4, v1, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p2

    .line 427
    :cond_13
    :try_start_1
    aput-object p1, p3, v5

    .line 428
    .line 429
    aput-object p4, p3, v4

    .line 430
    .line 431
    const/16 v0, 0x2e

    .line 432
    .line 433
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-ne v6, v0, :cond_16

    .line 438
    .line 439
    move v0, v5

    .line 440
    :goto_5
    sget-object v2, Loq;->g:[Ljava/lang/String;

    .line 441
    .line 442
    if-ge v0, v3, :cond_15

    .line 443
    .line 444
    aget-object v2, v2, v0

    .line 445
    .line 446
    invoke-virtual {p0, p1, p2, v2}, Loq;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 450
    if-eqz v2, :cond_14

    .line 451
    .line 452
    aput-object v1, p3, v5

    .line 453
    .line 454
    aput-object v1, p3, v4

    .line 455
    .line 456
    move-object v1, v2

    .line 457
    goto :goto_7

    .line 458
    :cond_14
    add-int/lit8 v0, v0, 0x1

    .line 459
    .line 460
    goto :goto_5

    .line 461
    :catchall_1
    move-exception v0

    .line 462
    move-object p0, v0

    .line 463
    goto :goto_6

    .line 464
    :cond_15
    aput-object v1, p3, v5

    .line 465
    .line 466
    aput-object v1, p3, v4

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_16
    :try_start_2
    invoke-virtual {p0, p1, p2, v1}, Loq;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 470
    .line 471
    .line 472
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 473
    aput-object v1, p3, v5

    .line 474
    .line 475
    aput-object v1, p3, v4

    .line 476
    .line 477
    move-object v1, p0

    .line 478
    goto :goto_7

    .line 479
    :goto_6
    aput-object v1, p3, v5

    .line 480
    .line 481
    aput-object v1, p3, v4

    .line 482
    .line 483
    throw p0

    .line 484
    :catch_0
    aput-object v1, p3, v5

    .line 485
    .line 486
    aput-object v1, p3, v4

    .line 487
    .line 488
    :goto_7
    move-object v0, v1

    .line 489
    :cond_17
    if-eqz v0, :cond_1f

    .line 490
    .line 491
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    instance-of p2, p0, Landroid/content/ContextWrapper;

    .line 496
    .line 497
    if-eqz p2, :cond_1a

    .line 498
    .line 499
    invoke-virtual {v0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 500
    .line 501
    .line 502
    move-result p2

    .line 503
    if-nez p2, :cond_18

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :cond_18
    sget-object p2, Loq;->c:[I

    .line 507
    .line 508
    invoke-virtual {p0, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    invoke-virtual {p0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p2

    .line 516
    if-eqz p2, :cond_19

    .line 517
    .line 518
    new-instance p3, Lnq;

    .line 519
    .line 520
    invoke-direct {p3, v0, p2}, Lnq;-><init>(Landroid/view/View;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 524
    .line 525
    .line 526
    :cond_19
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 527
    .line 528
    .line 529
    :cond_1a
    :goto_8
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 530
    .line 531
    const/16 v6, 0x1c

    .line 532
    .line 533
    if-le p0, v6, :cond_1b

    .line 534
    .line 535
    goto :goto_9

    .line 536
    :cond_1b
    sget-object p0, Loq;->d:[I

    .line 537
    .line 538
    invoke-virtual {p1, p4, p0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 539
    .line 540
    .line 541
    move-result-object p0

    .line 542
    invoke-virtual {p0, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 543
    .line 544
    .line 545
    move-result p2

    .line 546
    const-class v4, Ljava/lang/Boolean;

    .line 547
    .line 548
    if-eqz p2, :cond_1c

    .line 549
    .line 550
    invoke-virtual {p0, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 551
    .line 552
    .line 553
    move-result p2

    .line 554
    sget-object p3, Le58;->a:Ljava/util/WeakHashMap;

    .line 555
    .line 556
    new-instance v2, Ls48;

    .line 557
    .line 558
    const v3, 0x7f0901fa

    .line 559
    .line 560
    .line 561
    const/4 v7, 0x2

    .line 562
    invoke-direct/range {v2 .. v7}, Ls48;-><init>(ILjava/lang/Class;III)V

    .line 563
    .line 564
    .line 565
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 566
    .line 567
    .line 568
    move-result-object p2

    .line 569
    invoke-virtual {v2, v0, p2}, Lye4;->g(Landroid/view/View;Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    :cond_1c
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 573
    .line 574
    .line 575
    sget-object p0, Loq;->e:[I

    .line 576
    .line 577
    invoke-virtual {p1, p4, p0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    invoke-virtual {p0, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 582
    .line 583
    .line 584
    move-result p2

    .line 585
    if-eqz p2, :cond_1d

    .line 586
    .line 587
    invoke-virtual {p0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object p2

    .line 591
    invoke-static {v0, p2}, Le58;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 592
    .line 593
    .line 594
    :cond_1d
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 595
    .line 596
    .line 597
    sget-object p0, Loq;->f:[I

    .line 598
    .line 599
    invoke-virtual {p1, p4, p0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    invoke-virtual {p0, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 604
    .line 605
    .line 606
    move-result p1

    .line 607
    if-eqz p1, :cond_1e

    .line 608
    .line 609
    invoke-virtual {p0, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 610
    .line 611
    .line 612
    move-result p1

    .line 613
    sget-object p2, Le58;->a:Ljava/util/WeakHashMap;

    .line 614
    .line 615
    new-instance v2, Ls48;

    .line 616
    .line 617
    const v3, 0x7f090200

    .line 618
    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    invoke-direct/range {v2 .. v7}, Ls48;-><init>(ILjava/lang/Class;III)V

    .line 622
    .line 623
    .line 624
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    invoke-virtual {v2, v0, p1}, Lye4;->g(Landroid/view/View;Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    :cond_1e
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 632
    .line 633
    .line 634
    :cond_1f
    :goto_9
    return-object v0

    .line 635
    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
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
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 635
    invoke-virtual {p0, v0, p1, p2, p3}, Lwo;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public final p(Landroid/view/Window;)V
    .locals 7

    .line 1
    const-string v0, "AppCompat has already installed itself into the Window"

    .line 2
    .line 3
    iget-object v1, p0, Lwo;->H:Landroid/view/Window;

    .line 4
    .line 5
    if-nez v1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Lro;

    .line 12
    .line 13
    if-nez v2, :cond_5

    .line 14
    .line 15
    new-instance v0, Lro;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lro;-><init>(Lwo;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lwo;->I:Lro;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 26
    .line 27
    sget-object v1, Lwo;->E0:[I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {}, Lyo;->a()Lyo;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    monitor-enter v4

    .line 52
    :try_start_0
    iget-object v5, v4, Lyo;->a:Lt56;

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-virtual {v5, v0, v3, v6}, Lt56;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p0

    .line 64
    :cond_0
    move-object v0, v2

    .line 65
    :goto_0
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lwo;->H:Landroid/view/Window;

    .line 74
    .line 75
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v0, 0x21

    .line 78
    .line 79
    if-lt p1, v0, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, Lwo;->B0:Landroid/window/OnBackInvokedDispatcher;

    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Lwo;->F:Ljava/lang/Object;

    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    iget-object v1, p0, Lwo;->C0:Landroid/window/OnBackInvokedCallback;

    .line 90
    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    invoke-static {p1, v1}, Lqo;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v2, p0, Lwo;->C0:Landroid/window/OnBackInvokedCallback;

    .line 97
    .line 98
    :cond_2
    instance-of p1, v0, Landroid/app/Activity;

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    check-cast v0, Landroid/app/Activity;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-static {v0}, Lqo;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, Lwo;->B0:Landroid/window/OnBackInvokedDispatcher;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    iput-object v2, p0, Lwo;->B0:Landroid/window/OnBackInvokedDispatcher;

    .line 118
    .line 119
    :goto_1
    invoke-virtual {p0}, Lwo;->K()V

    .line 120
    .line 121
    .line 122
    :cond_4
    return-void

    .line 123
    :cond_5
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_6
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final r(ILvo;Lti4;)V
    .locals 2

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lwo;->h0:[Lvo;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    aget-object p2, v0, p1

    .line 13
    .line 14
    :cond_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p3, p2, Lvo;->h:Lti4;

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p2, Lvo;->m:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean p2, p0, Lwo;->m0:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    iget-object p2, p0, Lwo;->I:Lro;

    .line 30
    .line 31
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    const/4 v1, 0x0

    .line 42
    :try_start_0
    iput-boolean v0, p2, Lro;->z:Z

    .line 43
    .line 44
    invoke-interface {p0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    iput-boolean v1, p2, Lro;->z:Z

    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    iput-boolean v1, p2, Lro;->z:Z

    .line 52
    .line 53
    throw p0

    .line 54
    :cond_3
    :goto_0
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
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
.end method

.method public final s(Lti4;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 11
    .line 12
    check-cast p1, Lsj7;

    .line 13
    .line 14
    iget-object p1, p1, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_5

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz p1, :cond_5

    .line 25
    .line 26
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->O:Z

    .line 27
    .line 28
    if-eqz p1, :cond_5

    .line 29
    .line 30
    iget-object p1, p0, Lwo;->G:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    iget-object p1, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 48
    .line 49
    check-cast p1, Lsj7;

    .line 50
    .line 51
    iget-object p1, p1, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 52
    .line 53
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 54
    .line 55
    if-eqz p1, :cond_5

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object v2, p1, Ld8;->Q:Lnt2;

    .line 62
    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {p1}, Ld8;->j()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    :cond_0
    iget-object p1, p0, Lwo;->H:Landroid/view/Window;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v2, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 80
    .line 81
    .line 82
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 83
    .line 84
    check-cast v2, Lsj7;

    .line 85
    .line 86
    iget-object v2, v2, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 87
    .line 88
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 89
    .line 90
    const/16 v3, 0x6c

    .line 91
    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 95
    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    invoke-virtual {v2}, Ld8;->j()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    iget-object v0, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 107
    .line 108
    .line 109
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 110
    .line 111
    check-cast v0, Lsj7;

    .line 112
    .line 113
    iget-object v0, v0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 114
    .line 115
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 116
    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 120
    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    invoke-virtual {v0}, Ld8;->g()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    :cond_1
    iget-boolean v0, p0, Lwo;->m0:Z

    .line 128
    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Lwo;->B(I)Lvo;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p0, p0, Lvo;->h:Lti4;

    .line 136
    .line 137
    invoke-interface {p1, v3, p0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_2
    if-eqz p1, :cond_4

    .line 142
    .line 143
    iget-boolean v2, p0, Lwo;->m0:Z

    .line 144
    .line 145
    if-nez v2, :cond_4

    .line 146
    .line 147
    iget-boolean v2, p0, Lwo;->u0:Z

    .line 148
    .line 149
    if-eqz v2, :cond_3

    .line 150
    .line 151
    iget v2, p0, Lwo;->v0:I

    .line 152
    .line 153
    and-int/2addr v0, v2

    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    iget-object v0, p0, Lwo;->H:Landroid/view/Window;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v2, p0, Lwo;->w0:Llo;

    .line 163
    .line 164
    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Llo;->run()V

    .line 168
    .line 169
    .line 170
    :cond_3
    invoke-virtual {p0, v1}, Lwo;->B(I)Lvo;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v2, v0, Lvo;->h:Lti4;

    .line 175
    .line 176
    if-eqz v2, :cond_4

    .line 177
    .line 178
    iget-boolean v4, v0, Lvo;->o:Z

    .line 179
    .line 180
    if-nez v4, :cond_4

    .line 181
    .line 182
    iget-object v4, v0, Lvo;->g:Landroid/view/View;

    .line 183
    .line 184
    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_4

    .line 189
    .line 190
    iget-object v0, v0, Lvo;->h:Lti4;

    .line 191
    .line 192
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 196
    .line 197
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 198
    .line 199
    .line 200
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 201
    .line 202
    check-cast p0, Lsj7;

    .line 203
    .line 204
    iget-object p0, p0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 205
    .line 206
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 207
    .line 208
    if-eqz p0, :cond_4

    .line 209
    .line 210
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 211
    .line 212
    if-eqz p0, :cond_4

    .line 213
    .line 214
    invoke-virtual {p0}, Ld8;->l()Z

    .line 215
    .line 216
    .line 217
    :cond_4
    return-void

    .line 218
    :cond_5
    invoke-virtual {p0, v1}, Lwo;->B(I)Lvo;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    iput-boolean v0, p1, Lvo;->n:Z

    .line 223
    .line 224
    invoke-virtual {p0, p1, v1}, Lwo;->u(Lvo;Z)V

    .line 225
    .line 226
    .line 227
    const/4 v0, 0x0

    .line 228
    invoke-virtual {p0, p1, v0}, Lwo;->G(Lvo;Landroid/view/KeyEvent;)V

    .line 229
    .line 230
    .line 231
    return-void
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final t(Lti4;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lwo;->g0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lwo;->g0:Z

    .line 8
    .line 9
    iget-object v0, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 15
    .line 16
    check-cast v0, Lsj7;

    .line 17
    .line 18
    iget-object v0, v0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ld8;->g()Z

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Ld8;->P:La8;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lij4;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Lij4;->i:Lgj4;

    .line 42
    .line 43
    invoke-interface {v0}, Lqs6;->dismiss()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lwo;->H:Landroid/view/Window;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-boolean v1, p0, Lwo;->m0:Z

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    const/16 v1, 0x6c

    .line 59
    .line 60
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    const/4 p1, 0x0

    .line 64
    iput-boolean p1, p0, Lwo;->g0:Z

    .line 65
    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final u(Lvo;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p1, Lvo;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 15
    .line 16
    check-cast v0, Lsj7;

    .line 17
    .line 18
    iget-object v0, v0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ld8;->j()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object p1, p1, Lvo;->h:Lti4;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lwo;->t(Lti4;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 41
    .line 42
    const-string v1, "window"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroid/view/WindowManager;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-boolean v2, p1, Lvo;->m:Z

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    iget-object v2, p1, Lvo;->e:Luo;

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    iget p2, p1, Lvo;->a:I

    .line 67
    .line 68
    invoke-virtual {p0, p2, p1, v1}, Lwo;->r(ILvo;Lti4;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p2, 0x0

    .line 72
    iput-boolean p2, p1, Lvo;->k:Z

    .line 73
    .line 74
    iput-boolean p2, p1, Lvo;->l:Z

    .line 75
    .line 76
    iput-boolean p2, p1, Lvo;->m:Z

    .line 77
    .line 78
    iput-object v1, p1, Lvo;->f:Landroid/view/View;

    .line 79
    .line 80
    const/4 p2, 0x1

    .line 81
    iput-boolean p2, p1, Lvo;->n:Z

    .line 82
    .line 83
    iget-object p2, p0, Lwo;->i0:Lvo;

    .line 84
    .line 85
    if-ne p2, p1, :cond_2

    .line 86
    .line 87
    iput-object v1, p0, Lwo;->i0:Lvo;

    .line 88
    .line 89
    :cond_2
    iget p1, p1, Lvo;->a:I

    .line 90
    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Lwo;->K()V

    .line 94
    .line 95
    .line 96
    :cond_3
    return-void
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

.method public final w(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lwo;->F:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lrs3;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    instance-of v0, v0, Lra;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lwo;->H:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0, p1}, Lh03;->h(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/16 v3, 0x52

    .line 34
    .line 35
    if-ne v0, v3, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lwo;->I:Lro;

    .line 38
    .line 39
    iget-object v4, p0, Lwo;->H:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    :try_start_0
    iput-boolean v2, v0, Lro;->y:Z

    .line 49
    .line 50
    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 51
    .line 52
    .line 53
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    iput-boolean v1, v0, Lro;->y:Z

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :catchall_0
    move-exception p0

    .line 61
    iput-boolean v1, v0, Lro;->y:Z

    .line 62
    .line 63
    throw p0

    .line 64
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x4

    .line 73
    if-nez v4, :cond_6

    .line 74
    .line 75
    if-eq v0, v5, :cond_4

    .line 76
    .line 77
    if-eq v0, v3, :cond_3

    .line 78
    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_11

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Lwo;->B(I)Lvo;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v1, v0, Lvo;->m:Z

    .line 92
    .line 93
    if-nez v1, :cond_11

    .line 94
    .line 95
    invoke-virtual {p0, v0, p1}, Lwo;->I(Lvo;Landroid/view/KeyEvent;)Z

    .line 96
    .line 97
    .line 98
    return v2

    .line 99
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    and-int/lit16 p1, p1, 0x80

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    move v2, v1

    .line 109
    :goto_0
    iput-boolean v2, p0, Lwo;->j0:Z

    .line 110
    .line 111
    return v1

    .line 112
    :cond_6
    if-eq v0, v5, :cond_10

    .line 113
    .line 114
    if-eq v0, v3, :cond_7

    .line 115
    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :cond_7
    iget-object v0, p0, Lwo;->P:Lh8;

    .line 119
    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :cond_8
    invoke-virtual {p0, v1}, Lwo;->B(I)Lvo;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 129
    .line 130
    iget-object v4, p0, Lwo;->G:Landroid/content/Context;

    .line 131
    .line 132
    if-eqz v3, :cond_a

    .line 133
    .line 134
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 135
    .line 136
    .line 137
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 138
    .line 139
    check-cast v3, Lsj7;

    .line 140
    .line 141
    iget-object v3, v3, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 142
    .line 143
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-nez v5, :cond_a

    .line 148
    .line 149
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 150
    .line 151
    if-eqz v3, :cond_a

    .line 152
    .line 153
    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView;->O:Z

    .line 154
    .line 155
    if-eqz v3, :cond_a

    .line 156
    .line 157
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_a

    .line 166
    .line 167
    iget-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 168
    .line 169
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 170
    .line 171
    .line 172
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 173
    .line 174
    check-cast v3, Lsj7;

    .line 175
    .line 176
    iget-object v3, v3, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 177
    .line 178
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 179
    .line 180
    if-eqz v3, :cond_9

    .line 181
    .line 182
    iget-object v3, v3, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 183
    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    invoke-virtual {v3}, Ld8;->j()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_9

    .line 191
    .line 192
    iget-object p0, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 193
    .line 194
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 198
    .line 199
    check-cast p0, Lsj7;

    .line 200
    .line 201
    iget-object p0, p0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 202
    .line 203
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 204
    .line 205
    if-eqz p0, :cond_d

    .line 206
    .line 207
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 208
    .line 209
    if-eqz p0, :cond_d

    .line 210
    .line 211
    invoke-virtual {p0}, Ld8;->g()Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_d

    .line 216
    .line 217
    :goto_1
    goto :goto_3

    .line 218
    :cond_9
    iget-boolean v3, p0, Lwo;->m0:Z

    .line 219
    .line 220
    if-nez v3, :cond_d

    .line 221
    .line 222
    invoke-virtual {p0, v0, p1}, Lwo;->I(Lvo;Landroid/view/KeyEvent;)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_d

    .line 227
    .line 228
    iget-object p0, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 229
    .line 230
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 231
    .line 232
    .line 233
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Lsk1;

    .line 234
    .line 235
    check-cast p0, Lsj7;

    .line 236
    .line 237
    iget-object p0, p0, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 238
    .line 239
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 240
    .line 241
    if-eqz p0, :cond_d

    .line 242
    .line 243
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 244
    .line 245
    if-eqz p0, :cond_d

    .line 246
    .line 247
    invoke-virtual {p0}, Ld8;->l()Z

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    if-eqz p0, :cond_d

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_a
    iget-boolean v3, v0, Lvo;->m:Z

    .line 255
    .line 256
    if-nez v3, :cond_e

    .line 257
    .line 258
    iget-boolean v5, v0, Lvo;->l:Z

    .line 259
    .line 260
    if-eqz v5, :cond_b

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_b
    iget-boolean v3, v0, Lvo;->k:Z

    .line 264
    .line 265
    if-eqz v3, :cond_d

    .line 266
    .line 267
    iget-boolean v3, v0, Lvo;->o:Z

    .line 268
    .line 269
    if-eqz v3, :cond_c

    .line 270
    .line 271
    iput-boolean v1, v0, Lvo;->k:Z

    .line 272
    .line 273
    invoke-virtual {p0, v0, p1}, Lwo;->I(Lvo;Landroid/view/KeyEvent;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    goto :goto_2

    .line 278
    :cond_c
    move v3, v2

    .line 279
    :goto_2
    if-eqz v3, :cond_d

    .line 280
    .line 281
    invoke-virtual {p0, v0, p1}, Lwo;->G(Lvo;Landroid/view/KeyEvent;)V

    .line 282
    .line 283
    .line 284
    :goto_3
    move p0, v2

    .line 285
    goto :goto_5

    .line 286
    :cond_d
    move p0, v1

    .line 287
    goto :goto_5

    .line 288
    :cond_e
    :goto_4
    invoke-virtual {p0, v0, v2}, Lwo;->u(Lvo;Z)V

    .line 289
    .line 290
    .line 291
    move p0, v3

    .line 292
    :goto_5
    if-eqz p0, :cond_11

    .line 293
    .line 294
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    const-string p1, "audio"

    .line 299
    .line 300
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    check-cast p0, Landroid/media/AudioManager;

    .line 305
    .line 306
    if-eqz p0, :cond_f

    .line 307
    .line 308
    invoke-virtual {p0, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 309
    .line 310
    .line 311
    return v2

    .line 312
    :cond_f
    const-string p0, "AppCompatDelegate"

    .line 313
    .line 314
    const-string p1, "Couldn\'t get audio manager"

    .line 315
    .line 316
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    return v2

    .line 320
    :cond_10
    invoke-virtual {p0}, Lwo;->F()Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-eqz p0, :cond_12

    .line 325
    .line 326
    :cond_11
    :goto_6
    return v2

    .line 327
    :cond_12
    :goto_7
    return v1
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final x(I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lwo;->B(I)Lvo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lvo;->h:Lti4;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Lvo;->h:Lti4;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lti4;->t(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    iput-object v1, v0, Lvo;->p:Landroid/os/Bundle;

    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, Lvo;->h:Lti4;

    .line 28
    .line 29
    invoke-virtual {v1}, Lti4;->w()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lvo;->h:Lti4;

    .line 33
    .line 34
    invoke-virtual {v1}, Lti4;->clear()V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, v0, Lvo;->o:Z

    .line 39
    .line 40
    iput-boolean v1, v0, Lvo;->n:Z

    .line 41
    .line 42
    const/16 v0, 0x6c

    .line 43
    .line 44
    if-eq p1, v0, :cond_2

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, Lwo;->B(I)Lvo;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-boolean p1, v0, Lvo;->k:Z

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, v0, p1}, Lwo;->I(Lvo;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final y()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lwo;->V:Z

    .line 2
    .line 3
    if-nez v0, :cond_1b

    .line 4
    .line 5
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v1, Lqv5;->j:[I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x75

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1a

    .line 20
    .line 21
    const/16 v4, 0x7e

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v6, 0x6c

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v7}, Lwo;->i(I)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v6}, Lwo;->i(I)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    const/16 v3, 0x76

    .line 47
    .line 48
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0x6d

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v4}, Lwo;->i(I)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    const/16 v3, 0x77

    .line 60
    .line 61
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    const/16 v3, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, v3}, Lwo;->i(I)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput-boolean v3, p0, Lwo;->e0:Z

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lwo;->z()V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lwo;->H:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-boolean v3, p0, Lwo;->f0:Z

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-nez v3, :cond_9

    .line 97
    .line 98
    iget-boolean v3, p0, Lwo;->e0:Z

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    const v3, 0x7f0c000c

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Landroid/view/ViewGroup;

    .line 110
    .line 111
    iput-boolean v5, p0, Lwo;->c0:Z

    .line 112
    .line 113
    iput-boolean v5, p0, Lwo;->b0:Z

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_4
    iget-boolean v2, p0, Lwo;->b0:Z

    .line 118
    .line 119
    if-eqz v2, :cond_8

    .line 120
    .line 121
    new-instance v2, Landroid/util/TypedValue;

    .line 122
    .line 123
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const v9, 0x7f04000d

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v9, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    new-instance v3, Ld61;

    .line 141
    .line 142
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 143
    .line 144
    invoke-direct {v3, v0, v2}, Ld61;-><init>(Landroid/content/Context;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-object v3, v0

    .line 149
    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const v3, 0x7f0c0017

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Landroid/view/ViewGroup;

    .line 161
    .line 162
    const v3, 0x7f0900a4

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 170
    .line 171
    iput-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 172
    .line 173
    iget-object v9, p0, Lwo;->H:Landroid/view/Window;

    .line 174
    .line 175
    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-virtual {v3, v9}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v3, p0, Lwo;->c0:Z

    .line 183
    .line 184
    if-eqz v3, :cond_6

    .line 185
    .line 186
    iget-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 187
    .line 188
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 189
    .line 190
    .line 191
    :cond_6
    iget-boolean v3, p0, Lwo;->Z:Z

    .line 192
    .line 193
    if-eqz v3, :cond_7

    .line 194
    .line 195
    iget-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 196
    .line 197
    const/4 v4, 0x2

    .line 198
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 199
    .line 200
    .line 201
    :cond_7
    iget-boolean v3, p0, Lwo;->a0:Z

    .line 202
    .line 203
    if-eqz v3, :cond_b

    .line 204
    .line 205
    iget-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 206
    .line 207
    const/4 v4, 0x5

    .line 208
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    move-object v2, v8

    .line 213
    goto :goto_2

    .line 214
    :cond_9
    iget-boolean v3, p0, Lwo;->d0:Z

    .line 215
    .line 216
    if-eqz v3, :cond_a

    .line 217
    .line 218
    const v3, 0x7f0c0016

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    check-cast v2, Landroid/view/ViewGroup;

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_a
    const v3, 0x7f0c0015

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Landroid/view/ViewGroup;

    .line 236
    .line 237
    :cond_b
    :goto_2
    if-eqz v2, :cond_19

    .line 238
    .line 239
    new-instance v3, Lji8;

    .line 240
    .line 241
    const/4 v4, 0x4

    .line 242
    invoke-direct {v3, v4, p0}, Lji8;-><init>(ILjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object v4, Le58;->a:Ljava/util/WeakHashMap;

    .line 246
    .line 247
    invoke-static {v2, v3}, Lw48;->c(Landroid/view/View;Ll45;)V

    .line 248
    .line 249
    .line 250
    iget-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 251
    .line 252
    if-nez v3, :cond_c

    .line 253
    .line 254
    const v3, 0x7f090218

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    check-cast v3, Landroid/widget/TextView;

    .line 262
    .line 263
    iput-object v3, p0, Lwo;->X:Landroid/widget/TextView;

    .line 264
    .line 265
    :cond_c
    sget-boolean v3, Lo68;->a:Z

    .line 266
    .line 267
    const-string v3, "Could not invoke makeOptionalFitsSystemWindows"

    .line 268
    .line 269
    const-string v4, "ViewUtils"

    .line 270
    .line 271
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    const-string v10, "makeOptionalFitsSystemWindows"

    .line 276
    .line 277
    invoke-virtual {v9, v10, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    invoke-virtual {v9}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-nez v10, :cond_d

    .line 286
    .line 287
    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :catch_0
    move-exception v9

    .line 292
    goto :goto_4

    .line 293
    :catch_1
    move-exception v9

    .line 294
    goto :goto_5

    .line 295
    :cond_d
    :goto_3
    invoke-virtual {v9, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 296
    .line 297
    .line 298
    goto :goto_6

    .line 299
    :goto_4
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 300
    .line 301
    .line 302
    goto :goto_6

    .line 303
    :goto_5
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :catch_2
    const-string v3, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    .line 308
    .line 309
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    :goto_6
    const v3, 0x7f090034

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    check-cast v3, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 320
    .line 321
    iget-object v4, p0, Lwo;->H:Landroid/view/Window;

    .line 322
    .line 323
    const v9, 0x1020002

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    check-cast v4, Landroid/view/ViewGroup;

    .line 331
    .line 332
    if-eqz v4, :cond_f

    .line 333
    .line 334
    :goto_7
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    if-lez v10, :cond_e

    .line 339
    .line 340
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 348
    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_e
    const/4 v10, -0x1

    .line 352
    invoke-virtual {v4, v10}, Landroid/view/View;->setId(I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3, v9}, Landroid/view/View;->setId(I)V

    .line 356
    .line 357
    .line 358
    instance-of v10, v4, Landroid/widget/FrameLayout;

    .line 359
    .line 360
    if-eqz v10, :cond_f

    .line 361
    .line 362
    check-cast v4, Landroid/widget/FrameLayout;

    .line 363
    .line 364
    invoke-virtual {v4, v8}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 365
    .line 366
    .line 367
    :cond_f
    iget-object v4, p0, Lwo;->H:Landroid/view/Window;

    .line 368
    .line 369
    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 370
    .line 371
    .line 372
    new-instance v4, Lns8;

    .line 373
    .line 374
    const/4 v8, 0x3

    .line 375
    invoke-direct {v4, v8, p0}, Lns8;-><init>(ILjava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Lp41;)V

    .line 379
    .line 380
    .line 381
    iput-object v2, p0, Lwo;->W:Landroid/view/ViewGroup;

    .line 382
    .line 383
    iget-object v2, p0, Lwo;->F:Ljava/lang/Object;

    .line 384
    .line 385
    instance-of v3, v2, Landroid/app/Activity;

    .line 386
    .line 387
    if-eqz v3, :cond_10

    .line 388
    .line 389
    check-cast v2, Landroid/app/Activity;

    .line 390
    .line 391
    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    goto :goto_8

    .line 396
    :cond_10
    iget-object v2, p0, Lwo;->L:Ljava/lang/CharSequence;

    .line 397
    .line 398
    :goto_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-nez v3, :cond_13

    .line 403
    .line 404
    iget-object v3, p0, Lwo;->M:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 405
    .line 406
    if-eqz v3, :cond_11

    .line 407
    .line 408
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 409
    .line 410
    .line 411
    goto :goto_9

    .line 412
    :cond_11
    iget-object v3, p0, Lwo;->J:Lu98;

    .line 413
    .line 414
    if-eqz v3, :cond_12

    .line 415
    .line 416
    iget-object v3, v3, Lu98;->e:Lsk1;

    .line 417
    .line 418
    check-cast v3, Lsj7;

    .line 419
    .line 420
    iget-boolean v4, v3, Lsj7;->g:Z

    .line 421
    .line 422
    if-nez v4, :cond_13

    .line 423
    .line 424
    iget-object v4, v3, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 425
    .line 426
    iput-object v2, v3, Lsj7;->h:Ljava/lang/CharSequence;

    .line 427
    .line 428
    iget v8, v3, Lsj7;->b:I

    .line 429
    .line 430
    and-int/lit8 v8, v8, 0x8

    .line 431
    .line 432
    if-eqz v8, :cond_13

    .line 433
    .line 434
    invoke-virtual {v4, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 435
    .line 436
    .line 437
    iget-boolean v3, v3, Lsj7;->g:Z

    .line 438
    .line 439
    if-eqz v3, :cond_13

    .line 440
    .line 441
    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-static {v3, v2}, Le58;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 446
    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_12
    iget-object v3, p0, Lwo;->X:Landroid/widget/TextView;

    .line 450
    .line 451
    if-eqz v3, :cond_13

    .line 452
    .line 453
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 454
    .line 455
    .line 456
    :cond_13
    :goto_9
    iget-object v2, p0, Lwo;->W:Landroid/view/ViewGroup;

    .line 457
    .line 458
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    check-cast v2, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 463
    .line 464
    iget-object v3, p0, Lwo;->H:Landroid/view/Window;

    .line 465
    .line 466
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 479
    .line 480
    .line 481
    move-result v9

    .line 482
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    iget-object v10, v2, Landroidx/appcompat/widget/ContentFrameLayout;->C:Landroid/graphics/Rect;

    .line 487
    .line 488
    invoke-virtual {v10, v4, v8, v9, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-eqz v3, :cond_14

    .line 496
    .line 497
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 498
    .line 499
    .line 500
    :cond_14
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    const/16 v1, 0x7c

    .line 505
    .line 506
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 511
    .line 512
    .line 513
    const/16 v1, 0x7d

    .line 514
    .line 515
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 520
    .line 521
    .line 522
    const/16 v1, 0x7a

    .line 523
    .line 524
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    if-eqz v3, :cond_15

    .line 529
    .line 530
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 535
    .line 536
    .line 537
    :cond_15
    const/16 v1, 0x7b

    .line 538
    .line 539
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    if-eqz v3, :cond_16

    .line 544
    .line 545
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 550
    .line 551
    .line 552
    :cond_16
    const/16 v1, 0x78

    .line 553
    .line 554
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    if-eqz v3, :cond_17

    .line 559
    .line 560
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 565
    .line 566
    .line 567
    :cond_17
    const/16 v1, 0x79

    .line 568
    .line 569
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    if-eqz v3, :cond_18

    .line 574
    .line 575
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 580
    .line 581
    .line 582
    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 586
    .line 587
    .line 588
    iput-boolean v7, p0, Lwo;->V:Z

    .line 589
    .line 590
    invoke-virtual {p0, v5}, Lwo;->B(I)Lvo;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    iget-boolean v1, p0, Lwo;->m0:Z

    .line 595
    .line 596
    if-nez v1, :cond_1b

    .line 597
    .line 598
    iget-object v0, v0, Lvo;->h:Lti4;

    .line 599
    .line 600
    if-nez v0, :cond_1b

    .line 601
    .line 602
    invoke-virtual {p0, v6}, Lwo;->D(I)V

    .line 603
    .line 604
    .line 605
    goto :goto_a

    .line 606
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 607
    .line 608
    iget-boolean v1, p0, Lwo;->b0:Z

    .line 609
    .line 610
    iget-boolean v2, p0, Lwo;->c0:Z

    .line 611
    .line 612
    iget-boolean v3, p0, Lwo;->e0:Z

    .line 613
    .line 614
    iget-boolean v4, p0, Lwo;->d0:Z

    .line 615
    .line 616
    iget-boolean p0, p0, Lwo;->f0:Z

    .line 617
    .line 618
    new-instance v5, Ljava/lang/StringBuilder;

    .line 619
    .line 620
    const-string v6, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 621
    .line 622
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    const-string v1, ", windowActionBarOverlay: "

    .line 629
    .line 630
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    const-string v1, ", android:windowIsFloating: "

    .line 637
    .line 638
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v1, ", windowActionModeOverlay: "

    .line 645
    .line 646
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    const-string v1, ", windowNoTitle: "

    .line 653
    .line 654
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    const-string p0, " }"

    .line 661
    .line 662
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object p0

    .line 669
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    throw v0

    .line 673
    :cond_1a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 674
    .line 675
    .line 676
    const-string p0, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 677
    .line 678
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    :cond_1b
    :goto_a
    return-void
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
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
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwo;->H:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lwo;->F:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lwo;->p(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p0, "We have not been given a Window"

    .line 26
    .line 27
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
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
