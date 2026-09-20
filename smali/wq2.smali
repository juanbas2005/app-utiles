.class public final Lwq2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljz0;

.field public final b:Lam6;

.field public final c:Lbq2;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Ljz0;Lam6;Lbq2;)V
    .locals 1

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 139
    iput-boolean v0, p0, Lwq2;->d:Z

    const/4 v0, -0x1

    .line 140
    iput v0, p0, Lwq2;->e:I

    .line 141
    iput-object p1, p0, Lwq2;->a:Ljz0;

    .line 142
    iput-object p2, p0, Lwq2;->b:Lam6;

    .line 143
    iput-object p3, p0, Lwq2;->c:Lbq2;

    return-void
.end method

.method public constructor <init>(Ljz0;Lam6;Lbq2;Landroid/os/Bundle;)V
    .locals 2

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 145
    iput-boolean v0, p0, Lwq2;->d:Z

    const/4 v1, -0x1

    .line 146
    iput v1, p0, Lwq2;->e:I

    .line 147
    iput-object p1, p0, Lwq2;->a:Ljz0;

    .line 148
    iput-object p2, p0, Lwq2;->b:Lam6;

    .line 149
    iput-object p3, p0, Lwq2;->c:Lbq2;

    const/4 p0, 0x0

    .line 150
    iput-object p0, p3, Lbq2;->y:Landroid/util/SparseArray;

    .line 151
    iput-object p0, p3, Lbq2;->z:Landroid/os/Bundle;

    .line 152
    iput v0, p3, Lbq2;->O:I

    .line 153
    iput-boolean v0, p3, Lbq2;->K:Z

    .line 154
    iput-boolean v0, p3, Lbq2;->G:Z

    .line 155
    iget-object p1, p3, Lbq2;->C:Lbq2;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lbq2;->A:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    iput-object p1, p3, Lbq2;->D:Ljava/lang/String;

    .line 156
    iput-object p0, p3, Lbq2;->C:Lbq2;

    .line 157
    iput-object p4, p3, Lbq2;->x:Landroid/os/Bundle;

    .line 158
    const-string p0, "arguments"

    invoke-virtual {p4, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    iput-object p0, p3, Lbq2;->B:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Ljz0;Lam6;Ljava/lang/ClassLoader;Llq2;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lwq2;->d:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lwq2;->e:I

    .line 9
    .line 10
    iput-object p1, p0, Lwq2;->a:Ljz0;

    .line 11
    .line 12
    iput-object p2, p0, Lwq2;->b:Lam6;

    .line 13
    .line 14
    const-string p1, "state"

    .line 15
    .line 16
    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lvq2;

    .line 21
    .line 22
    iget-object p2, p1, Lvq2;->w:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p4, p2}, Llq2;->a(Ljava/lang/String;)Lbq2;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object p4, p1, Lvq2;->x:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p4, p2, Lbq2;->A:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean p4, p1, Lvq2;->y:Z

    .line 33
    .line 34
    iput-boolean p4, p2, Lbq2;->J:Z

    .line 35
    .line 36
    iget-boolean p4, p1, Lvq2;->z:Z

    .line 37
    .line 38
    iput-boolean p4, p2, Lbq2;->L:Z

    .line 39
    .line 40
    const/4 p4, 0x1

    .line 41
    iput-boolean p4, p2, Lbq2;->M:Z

    .line 42
    .line 43
    iget p4, p1, Lvq2;->A:I

    .line 44
    .line 45
    iput p4, p2, Lbq2;->T:I

    .line 46
    .line 47
    iget p4, p1, Lvq2;->B:I

    .line 48
    .line 49
    iput p4, p2, Lbq2;->U:I

    .line 50
    .line 51
    iget-object p4, p1, Lvq2;->C:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p4, p2, Lbq2;->V:Ljava/lang/String;

    .line 54
    .line 55
    iget-boolean p4, p1, Lvq2;->D:Z

    .line 56
    .line 57
    iput-boolean p4, p2, Lbq2;->Y:Z

    .line 58
    .line 59
    iget-boolean p4, p1, Lvq2;->E:Z

    .line 60
    .line 61
    iput-boolean p4, p2, Lbq2;->H:Z

    .line 62
    .line 63
    iget-boolean p4, p1, Lvq2;->F:Z

    .line 64
    .line 65
    iput-boolean p4, p2, Lbq2;->X:Z

    .line 66
    .line 67
    iget-boolean p4, p1, Lvq2;->G:Z

    .line 68
    .line 69
    iput-boolean p4, p2, Lbq2;->W:Z

    .line 70
    .line 71
    invoke-static {}, Lk54;->values()[Lk54;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    iget v0, p1, Lvq2;->H:I

    .line 76
    .line 77
    aget-object p4, p4, v0

    .line 78
    .line 79
    iput-object p4, p2, Lbq2;->k0:Lk54;

    .line 80
    .line 81
    iget-object p4, p1, Lvq2;->I:Ljava/lang/String;

    .line 82
    .line 83
    iput-object p4, p2, Lbq2;->D:Ljava/lang/String;

    .line 84
    .line 85
    iget p4, p1, Lvq2;->J:I

    .line 86
    .line 87
    iput p4, p2, Lbq2;->E:I

    .line 88
    .line 89
    iget-boolean p1, p1, Lvq2;->K:Z

    .line 90
    .line 91
    iput-boolean p1, p2, Lbq2;->e0:Z

    .line 92
    .line 93
    iput-object p2, p0, Lwq2;->c:Lbq2;

    .line 94
    .line 95
    iput-object p5, p2, Lbq2;->x:Landroid/os/Bundle;

    .line 96
    .line 97
    const-string p0, "arguments"

    .line 98
    .line 99
    invoke-virtual {p5, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eqz p0, :cond_0

    .line 104
    .line 105
    invoke-virtual {p0, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 106
    .line 107
    .line 108
    :cond_0
    invoke-virtual {p2, p0}, Lbq2;->O(Landroid/os/Bundle;)V

    .line 109
    .line 110
    .line 111
    const/4 p0, 0x2

    .line 112
    invoke-static {p0}, Lrq2;->L(I)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_1

    .line 117
    .line 118
    new-instance p0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string p1, "Instantiated fragment "

    .line 121
    .line 122
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const-string p1, "FragmentManager"

    .line 133
    .line 134
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    :cond_1
    return-void
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
.method public final a()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Lwq2;->c:Lbq2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "moveto ACTIVITY_CREATED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v3, Lbq2;->x:Landroid/os/Bundle;

    .line 30
    .line 31
    const-string v4, "savedInstanceState"

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v1, v3, Lbq2;->R:Lrq2;

    .line 39
    .line 40
    invoke-virtual {v1}, Lrq2;->S()V

    .line 41
    .line 42
    .line 43
    iput v0, v3, Lbq2;->w:I

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-boolean v1, v3, Lbq2;->a0:Z

    .line 47
    .line 48
    invoke-virtual {v3}, Lbq2;->w()V

    .line 49
    .line 50
    .line 51
    iget-boolean v5, v3, Lbq2;->a0:Z

    .line 52
    .line 53
    if-eqz v5, :cond_7

    .line 54
    .line 55
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v5, "moveto RESTORE_VIEW_STATE: "

    .line 64
    .line 65
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    :cond_2
    iget-object v0, v3, Lbq2;->c0:Landroid/view/View;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iget-object v0, v3, Lbq2;->x:Landroid/os/Bundle;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_0

    .line 92
    :cond_3
    move-object v0, v2

    .line 93
    :goto_0
    iget-object v4, v3, Lbq2;->y:Landroid/util/SparseArray;

    .line 94
    .line 95
    if-eqz v4, :cond_4

    .line 96
    .line 97
    iget-object v5, v3, Lbq2;->c0:Landroid/view/View;

    .line 98
    .line 99
    invoke-virtual {v5, v4}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 100
    .line 101
    .line 102
    iput-object v2, v3, Lbq2;->y:Landroid/util/SparseArray;

    .line 103
    .line 104
    :cond_4
    iput-boolean v1, v3, Lbq2;->a0:Z

    .line 105
    .line 106
    invoke-virtual {v3, v0}, Lbq2;->J(Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    iget-boolean v0, v3, Lbq2;->a0:Z

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    iget-object v0, v3, Lbq2;->c0:Landroid/view/View;

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget-object v0, v3, Lbq2;->m0:Lbr2;

    .line 118
    .line 119
    sget-object v4, Lj54;->ON_CREATE:Lj54;

    .line 120
    .line 121
    invoke-virtual {v0, v4}, Lbr2;->a(Lj54;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    const-string p0, " did not call through to super.onViewStateRestored()"

    .line 126
    .line 127
    invoke-static {v3, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_6
    :goto_1
    iput-object v2, v3, Lbq2;->x:Landroid/os/Bundle;

    .line 132
    .line 133
    iget-object v0, v3, Lbq2;->R:Lrq2;

    .line 134
    .line 135
    iput-boolean v1, v0, Lrq2;->H:Z

    .line 136
    .line 137
    iput-boolean v1, v0, Lrq2;->I:Z

    .line 138
    .line 139
    iget-object v2, v0, Lrq2;->O:Ltq2;

    .line 140
    .line 141
    iput-boolean v1, v2, Ltq2;->g:Z

    .line 142
    .line 143
    const/4 v2, 0x4

    .line 144
    invoke-virtual {v0, v2}, Lrq2;->u(I)V

    .line 145
    .line 146
    .line 147
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 148
    .line 149
    invoke-virtual {p0, v3, v1}, Ljz0;->m(Lbq2;Z)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_7
    const-string p0, " did not call through to super.onActivityCreated()"

    .line 154
    .line 155
    invoke-static {v3, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-void
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

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Lwq2;->c:Lbq2;

    .line 2
    .line 3
    iget-object v1, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 4
    .line 5
    :goto_0
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    const v3, 0x7f0900e5

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    instance-of v4, v3, Lbq2;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    check-cast v3, Lbq2;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-object v3, v2

    .line 23
    :goto_1
    if-eqz v3, :cond_1

    .line 24
    .line 25
    move-object v2, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    instance-of v3, v1, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    check-cast v1, Landroid/view/View;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_2
    iget-object v1, v0, Lbq2;->S:Lbq2;

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    if-eq v2, v1, :cond_4

    .line 45
    .line 46
    iget v1, v0, Lbq2;->U:I

    .line 47
    .line 48
    sget-object v3, Lzq2;->a:Lyq2;

    .line 49
    .line 50
    new-instance v3, Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;

    .line 51
    .line 52
    new-instance v4, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v5, "Attempting to nest fragment "

    .line 55
    .line 56
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v5, " within the view of parent fragment "

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, " via container with ID "

    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v2, " without using parent\'s childFragmentManager"

    .line 76
    .line 77
    invoke-static {v4, v1, v2}, Lhl6;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {v3, v0, v1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Lbq2;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v3}, Lzq2;->b(Landroidx/fragment/app/strictmode/Violation;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lzq2;->a(Lbq2;)Lyq2;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    :cond_4
    iget-object p0, p0, Lwq2;->b:Lam6;

    .line 95
    .line 96
    iget-object p0, p0, Lam6;->x:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Ljava/util/ArrayList;

    .line 99
    .line 100
    iget-object v1, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 101
    .line 102
    const/4 v2, -0x1

    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_5
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    add-int/lit8 v4, v3, -0x1

    .line 111
    .line 112
    :goto_3
    if-ltz v4, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Lbq2;

    .line 119
    .line 120
    iget-object v6, v5, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 121
    .line 122
    if-ne v6, v1, :cond_6

    .line 123
    .line 124
    iget-object v5, v5, Lbq2;->c0:Landroid/view/View;

    .line 125
    .line 126
    if-eqz v5, :cond_6

    .line 127
    .line 128
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    add-int/lit8 v2, p0, 0x1

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_6
    add-int/lit8 v4, v4, -0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-ge v3, v4, :cond_9

    .line 145
    .line 146
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Lbq2;

    .line 151
    .line 152
    iget-object v5, v4, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 153
    .line 154
    if-ne v5, v1, :cond_8

    .line 155
    .line 156
    iget-object v4, v4, Lbq2;->c0:Landroid/view/View;

    .line 157
    .line 158
    if-eqz v4, :cond_8

    .line 159
    .line 160
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    goto :goto_5

    .line 165
    :cond_8
    goto :goto_4

    .line 166
    :cond_9
    :goto_5
    iget-object p0, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 167
    .line 168
    iget-object v0, v0, Lbq2;->c0:Landroid/view/View;

    .line 169
    .line 170
    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 171
    .line 172
    .line 173
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
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
.end method

.method public final c()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lwq2;->c:Lbq2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto ATTACHED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lbq2;->C:Lbq2;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const-string v3, " that does not belong to this FragmentManager!"

    .line 33
    .line 34
    const-string v4, " declared target fragment "

    .line 35
    .line 36
    iget-object v5, p0, Lwq2;->b:Lam6;

    .line 37
    .line 38
    const-string v6, "Fragment "

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, Lbq2;->A:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, v5, Lam6;->y:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lwq2;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v3, v1, Lbq2;->C:Lbq2;

    .line 57
    .line 58
    iget-object v3, v3, Lbq2;->A:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v3, v1, Lbq2;->D:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v2, v1, Lbq2;->C:Lbq2;

    .line 63
    .line 64
    move-object v2, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, v1, Lbq2;->C:Lbq2;

    .line 77
    .line 78
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_2
    iget-object v0, v1, Lbq2;->D:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v2, v5, Lam6;->y:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v2, v0

    .line 108
    check-cast v2, Lwq2;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v0, v1, Lbq2;->D:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {p0, v0, v3}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 135
    .line 136
    invoke-virtual {v2}, Lwq2;->k()V

    .line 137
    .line 138
    .line 139
    :cond_5
    iget-object v0, v1, Lbq2;->P:Lrq2;

    .line 140
    .line 141
    iget-object v2, v0, Lrq2;->w:Ldq2;

    .line 142
    .line 143
    iput-object v2, v1, Lbq2;->Q:Ldq2;

    .line 144
    .line 145
    iget-object v0, v0, Lrq2;->y:Lbq2;

    .line 146
    .line 147
    iput-object v0, v1, Lbq2;->S:Lbq2;

    .line 148
    .line 149
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v1, v0}, Ljz0;->v(Lbq2;Z)V

    .line 153
    .line 154
    .line 155
    iget-object v2, v1, Lbq2;->q0:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_6

    .line 166
    .line 167
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    check-cast v4, Lyp2;

    .line 172
    .line 173
    invoke-virtual {v4}, Lyp2;->a()V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 178
    .line 179
    .line 180
    iget-object v2, v1, Lbq2;->R:Lrq2;

    .line 181
    .line 182
    iget-object v3, v1, Lbq2;->Q:Ldq2;

    .line 183
    .line 184
    invoke-virtual {v1}, Lbq2;->a()Lmp7;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v2, v3, v4, v1}, Lrq2;->b(Ldq2;Lmp7;Lbq2;)V

    .line 189
    .line 190
    .line 191
    iput v0, v1, Lbq2;->w:I

    .line 192
    .line 193
    iput-boolean v0, v1, Lbq2;->a0:Z

    .line 194
    .line 195
    iget-object v2, v1, Lbq2;->Q:Ldq2;

    .line 196
    .line 197
    iget-object v2, v2, Ldq2;->M:Leq2;

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Lbq2;->y(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    iget-boolean v2, v1, Lbq2;->a0:Z

    .line 203
    .line 204
    if-eqz v2, :cond_8

    .line 205
    .line 206
    iget-object v2, v1, Lbq2;->P:Lrq2;

    .line 207
    .line 208
    iget-object v2, v2, Lrq2;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_7

    .line 219
    .line 220
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, Luq2;

    .line 225
    .line 226
    invoke-interface {v3}, Luq2;->a()V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_7
    iget-object v2, v1, Lbq2;->R:Lrq2;

    .line 231
    .line 232
    iput-boolean v0, v2, Lrq2;->H:Z

    .line 233
    .line 234
    iput-boolean v0, v2, Lrq2;->I:Z

    .line 235
    .line 236
    iget-object v3, v2, Lrq2;->O:Ltq2;

    .line 237
    .line 238
    iput-boolean v0, v3, Ltq2;->g:Z

    .line 239
    .line 240
    invoke-virtual {v2, v0}, Lrq2;->u(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, v1, v0}, Ljz0;->n(Lbq2;Z)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_8
    const-string p0, " did not call through to super.onAttach()"

    .line 248
    .line 249
    invoke-static {v1, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
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
.end method

.method public final d()I
    .locals 11

    .line 1
    iget-object v0, p0, Lwq2;->c:Lbq2;

    .line 2
    .line 3
    iget-object v1, v0, Lbq2;->P:Lrq2;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget p0, v0, Lbq2;->w:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    iget v1, p0, Lwq2;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Lbq2;->k0:Lk54;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x5

    .line 20
    const/4 v5, -0x1

    .line 21
    const/4 v6, 0x3

    .line 22
    const/4 v7, 0x4

    .line 23
    const/4 v8, 0x2

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eq v2, v9, :cond_3

    .line 26
    .line 27
    if-eq v2, v8, :cond_2

    .line 28
    .line 29
    if-eq v2, v6, :cond_1

    .line 30
    .line 31
    if-eq v2, v7, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Lbq2;->J:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Lbq2;->K:Z

    .line 57
    .line 58
    iget p0, p0, Lwq2;->e:I

    .line 59
    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    invoke-static {p0, v8}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object p0, v0, Lbq2;->c0:Landroid/view/View;

    .line 67
    .line 68
    if-eqz p0, :cond_7

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-nez p0, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    if-ge p0, v7, :cond_6

    .line 82
    .line 83
    iget p0, v0, Lbq2;->w:I

    .line 84
    .line 85
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    goto :goto_1

    .line 90
    :cond_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    :cond_7
    :goto_1
    iget-boolean p0, v0, Lbq2;->L:Z

    .line 95
    .line 96
    if-eqz p0, :cond_8

    .line 97
    .line 98
    iget-object p0, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 99
    .line 100
    if-nez p0, :cond_8

    .line 101
    .line 102
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    :cond_8
    iget-boolean p0, v0, Lbq2;->G:Z

    .line 107
    .line 108
    if-nez p0, :cond_9

    .line 109
    .line 110
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    :cond_9
    iget-object p0, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 115
    .line 116
    if-eqz p0, :cond_d

    .line 117
    .line 118
    invoke-virtual {v0}, Lbq2;->p()Lrq2;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {p0, v2}, Lun1;->i(Landroid/view/ViewGroup;Lrq2;)Lun1;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0, v0}, Lun1;->f(Lbq2;)Lgz6;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    if-eqz v2, :cond_a

    .line 131
    .line 132
    iget v2, v2, Lgz6;->b:I

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_a
    move v2, v3

    .line 136
    :goto_2
    invoke-virtual {p0, v0}, Lun1;->g(Lbq2;)Lgz6;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-eqz p0, :cond_b

    .line 141
    .line 142
    iget v3, p0, Lgz6;->b:I

    .line 143
    .line 144
    :cond_b
    if-nez v2, :cond_c

    .line 145
    .line 146
    move p0, v5

    .line 147
    goto :goto_3

    .line 148
    :cond_c
    sget-object p0, Lhz6;->a:[I

    .line 149
    .line 150
    invoke-static {v2}, Lb81;->B(I)I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    aget p0, p0, v10

    .line 155
    .line 156
    :goto_3
    if-eq p0, v5, :cond_d

    .line 157
    .line 158
    if-eq p0, v9, :cond_d

    .line 159
    .line 160
    move v3, v2

    .line 161
    :cond_d
    if-ne v3, v8, :cond_e

    .line 162
    .line 163
    const/4 p0, 0x6

    .line 164
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    goto :goto_4

    .line 169
    :cond_e
    if-ne v3, v6, :cond_f

    .line 170
    .line 171
    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    goto :goto_4

    .line 176
    :cond_f
    iget-boolean p0, v0, Lbq2;->H:Z

    .line 177
    .line 178
    if-eqz p0, :cond_11

    .line 179
    .line 180
    invoke-virtual {v0}, Lbq2;->v()Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-eqz p0, :cond_10

    .line 185
    .line 186
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    goto :goto_4

    .line 191
    :cond_10
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    :cond_11
    :goto_4
    iget-boolean p0, v0, Lbq2;->d0:Z

    .line 196
    .line 197
    if-eqz p0, :cond_12

    .line 198
    .line 199
    iget p0, v0, Lbq2;->w:I

    .line 200
    .line 201
    if-ge p0, v4, :cond_12

    .line 202
    .line 203
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    :cond_12
    iget-boolean p0, v0, Lbq2;->I:Z

    .line 208
    .line 209
    if-eqz p0, :cond_13

    .line 210
    .line 211
    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    :cond_13
    invoke-static {v8}, Lrq2;->L(I)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-eqz p0, :cond_14

    .line 220
    .line 221
    new-instance p0, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v2, "computeExpectedState() of "

    .line 224
    .line 225
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v2, " for "

    .line 232
    .line 233
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    const-string v0, "FragmentManager"

    .line 244
    .line 245
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    :cond_14
    return v1
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
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
.end method

.method public final e()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Lwq2;->c:Lbq2;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "moveto CREATED: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v2, Lbq2;->x:Landroid/os/Bundle;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v3, "savedInstanceState"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    :goto_0
    iget-boolean v3, v2, Lbq2;->i0:Z

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    const/4 v5, 0x0

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 48
    .line 49
    invoke-virtual {p0, v2, v5}, Ljz0;->w(Lbq2;Z)V

    .line 50
    .line 51
    .line 52
    iget-object v3, v2, Lbq2;->R:Lrq2;

    .line 53
    .line 54
    invoke-virtual {v3}, Lrq2;->S()V

    .line 55
    .line 56
    .line 57
    iput v4, v2, Lbq2;->w:I

    .line 58
    .line 59
    iput-boolean v5, v2, Lbq2;->a0:Z

    .line 60
    .line 61
    iget-object v3, v2, Lbq2;->l0:Lw54;

    .line 62
    .line 63
    new-instance v6, Lky5;

    .line 64
    .line 65
    invoke-direct {v6, v0, v2}, Lky5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v6}, Lw54;->x0(Ls54;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v1}, Lbq2;->z(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    iput-boolean v4, v2, Lbq2;->i0:Z

    .line 75
    .line 76
    iget-boolean v0, v2, Lbq2;->a0:Z

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    iget-object v0, v2, Lbq2;->l0:Lw54;

    .line 81
    .line 82
    sget-object v1, Lj54;->ON_CREATE:Lj54;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lw54;->f1(Lj54;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v2, v5}, Ljz0;->o(Lbq2;Z)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    const-string p0, " did not call through to super.onCreate()"

    .line 92
    .line 93
    invoke-static {v2, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    iput v4, v2, Lbq2;->w:I

    .line 98
    .line 99
    iget-object p0, v2, Lbq2;->x:Landroid/os/Bundle;

    .line 100
    .line 101
    if-eqz p0, :cond_4

    .line 102
    .line 103
    const-string v0, "childFragmentManager"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-eqz p0, :cond_4

    .line 110
    .line 111
    iget-object v0, v2, Lbq2;->R:Lrq2;

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Lrq2;->Y(Landroid/os/Bundle;)V

    .line 114
    .line 115
    .line 116
    iget-object p0, v2, Lbq2;->R:Lrq2;

    .line 117
    .line 118
    iput-boolean v5, p0, Lrq2;->H:Z

    .line 119
    .line 120
    iput-boolean v5, p0, Lrq2;->I:Z

    .line 121
    .line 122
    iget-object v0, p0, Lrq2;->O:Ltq2;

    .line 123
    .line 124
    iput-boolean v5, v0, Ltq2;->g:Z

    .line 125
    .line 126
    invoke-virtual {p0, v4}, Lrq2;->u(I)V

    .line 127
    .line 128
    .line 129
    :cond_4
    return-void
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
    .locals 10

    .line 1
    iget-object v0, p0, Lwq2;->c:Lbq2;

    .line 2
    .line 3
    iget-boolean v1, v0, Lbq2;->J:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    invoke-static {v1}, Lrq2;->L(I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-string v3, "FragmentManager"

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v4, "moveto CREATE_VIEW: "

    .line 20
    .line 21
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v2, v0, Lbq2;->x:Landroid/os/Bundle;

    .line 35
    .line 36
    const-string v4, "savedInstanceState"

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v2, v5

    .line 47
    :goto_0
    invoke-virtual {v0, v2}, Lbq2;->E(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iput-object v6, v0, Lbq2;->h0:Landroid/view/LayoutInflater;

    .line 52
    .line 53
    iget-object v7, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 54
    .line 55
    if-eqz v7, :cond_3

    .line 56
    .line 57
    move-object v5, v7

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_3
    iget v7, v0, Lbq2;->U:I

    .line 61
    .line 62
    if-eqz v7, :cond_7

    .line 63
    .line 64
    const/4 v5, -0x1

    .line 65
    if-eq v7, v5, :cond_6

    .line 66
    .line 67
    iget-object v5, v0, Lbq2;->P:Lrq2;

    .line 68
    .line 69
    iget-object v5, v5, Lrq2;->x:Lmp7;

    .line 70
    .line 71
    invoke-virtual {v5, v7}, Lmp7;->g0(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Landroid/view/ViewGroup;

    .line 76
    .line 77
    if-nez v5, :cond_5

    .line 78
    .line 79
    iget-boolean v7, v0, Lbq2;->M:Z

    .line 80
    .line 81
    if-nez v7, :cond_7

    .line 82
    .line 83
    iget-boolean v7, v0, Lbq2;->L:Z

    .line 84
    .line 85
    if-eqz v7, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Lbq2;->L()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iget v1, v0, Lbq2;->U:I

    .line 97
    .line 98
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    goto :goto_1

    .line 103
    :catch_0
    const-string p0, "unknown"

    .line 104
    .line 105
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 106
    .line 107
    iget v2, v0, Lbq2;->U:I

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    new-instance v3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v4, "No view found for id 0x"

    .line 116
    .line 117
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v2, " ("

    .line 124
    .line 125
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p0, ") for fragment "

    .line 132
    .line 133
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v1

    .line 147
    :cond_5
    instance-of v7, v5, Landroidx/fragment/app/FragmentContainerView;

    .line 148
    .line 149
    if-nez v7, :cond_7

    .line 150
    .line 151
    sget-object v7, Lzq2;->a:Lyq2;

    .line 152
    .line 153
    new-instance v7, Landroidx/fragment/app/strictmode/WrongFragmentContainerViolation;

    .line 154
    .line 155
    new-instance v8, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v9, "Attempting to add fragment "

    .line 158
    .line 159
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v9, " to container "

    .line 166
    .line 167
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v9, " which is not a FragmentContainerView"

    .line 174
    .line 175
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-direct {v7, v0, v8}, Landroidx/fragment/app/strictmode/Violation;-><init>(Lbq2;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v7}, Lzq2;->b(Landroidx/fragment/app/strictmode/Violation;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Lzq2;->a(Lbq2;)Lyq2;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_6
    const-string p0, "Cannot create fragment "

    .line 197
    .line 198
    const-string v1, " for a container view with no id"

    .line 199
    .line 200
    invoke-static {v0, v1, p0}, Lrf2;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_7
    :goto_2
    iput-object v5, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 205
    .line 206
    invoke-virtual {v0, v6, v5, v2}, Lbq2;->K(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 207
    .line 208
    .line 209
    iget-object v2, v0, Lbq2;->c0:Landroid/view/View;

    .line 210
    .line 211
    const/4 v6, 0x2

    .line 212
    if-eqz v2, :cond_e

    .line 213
    .line 214
    invoke-static {v1}, Lrq2;->L(I)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_8

    .line 219
    .line 220
    new-instance v1, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v2, "moveto VIEW_CREATED: "

    .line 223
    .line 224
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    :cond_8
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 238
    .line 239
    const/4 v2, 0x0

    .line 240
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 241
    .line 242
    .line 243
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 244
    .line 245
    const v7, 0x7f0900e5

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v7, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    if-eqz v5, :cond_9

    .line 252
    .line 253
    invoke-virtual {p0}, Lwq2;->b()V

    .line 254
    .line 255
    .line 256
    :cond_9
    iget-boolean v1, v0, Lbq2;->W:Z

    .line 257
    .line 258
    if-eqz v1, :cond_a

    .line 259
    .line 260
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 261
    .line 262
    const/16 v5, 0x8

    .line 263
    .line 264
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 265
    .line 266
    .line 267
    :cond_a
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 268
    .line 269
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    iget-object v5, v0, Lbq2;->c0:Landroid/view/View;

    .line 274
    .line 275
    if-eqz v1, :cond_b

    .line 276
    .line 277
    sget-object v1, Le58;->a:Ljava/util/WeakHashMap;

    .line 278
    .line 279
    invoke-virtual {v5}, Landroid/view/View;->requestApplyInsets()V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_b
    new-instance v1, Lfg;

    .line 284
    .line 285
    const/4 v7, 0x4

    .line 286
    invoke-direct {v1, v7, v5}, Lfg;-><init>(ILjava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v5, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 290
    .line 291
    .line 292
    :goto_3
    iget-object v1, v0, Lbq2;->x:Landroid/os/Bundle;

    .line 293
    .line 294
    if-eqz v1, :cond_c

    .line 295
    .line 296
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 297
    .line 298
    .line 299
    :cond_c
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Lbq2;->I(Landroid/view/View;)V

    .line 302
    .line 303
    .line 304
    iget-object v1, v0, Lbq2;->R:Lrq2;

    .line 305
    .line 306
    invoke-virtual {v1, v6}, Lrq2;->u(I)V

    .line 307
    .line 308
    .line 309
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 310
    .line 311
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 312
    .line 313
    invoke-virtual {p0, v0, v1, v2}, Ljz0;->C(Lbq2;Landroid/view/View;Z)V

    .line 314
    .line 315
    .line 316
    iget-object p0, v0, Lbq2;->c0:Landroid/view/View;

    .line 317
    .line 318
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 323
    .line 324
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    invoke-virtual {v0}, Lbq2;->j()Laq2;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    iput v1, v2, Laq2;->j:F

    .line 333
    .line 334
    iget-object v1, v0, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 335
    .line 336
    if-eqz v1, :cond_e

    .line 337
    .line 338
    if-nez p0, :cond_e

    .line 339
    .line 340
    iget-object p0, v0, Lbq2;->c0:Landroid/view/View;

    .line 341
    .line 342
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    if-eqz p0, :cond_d

    .line 347
    .line 348
    invoke-virtual {v0}, Lbq2;->j()Laq2;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iput-object p0, v1, Laq2;->k:Landroid/view/View;

    .line 353
    .line 354
    invoke-static {v6}, Lrq2;->L(I)Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_d

    .line 359
    .line 360
    new-instance v1, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    const-string v2, "requestFocus: Saved focused view "

    .line 363
    .line 364
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string p0, " for Fragment "

    .line 371
    .line 372
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 383
    .line 384
    .line 385
    :cond_d
    iget-object p0, v0, Lbq2;->c0:Landroid/view/View;

    .line 386
    .line 387
    const/4 v1, 0x0

    .line 388
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 389
    .line 390
    .line 391
    :cond_e
    iput v6, v0, Lbq2;->w:I

    .line 392
    .line 393
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
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
.end method

.method public final g()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lwq2;->c:Lbq2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v0, v1, Lbq2;->H:Z

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Lbq2;->v()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v3

    .line 44
    :goto_0
    const/4 v4, 0x0

    .line 45
    iget-object v5, p0, Lwq2;->b:Lam6;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v6, v1, Lbq2;->A:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v5, v6, v4}, Lam6;->R(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    :cond_2
    if-nez v0, :cond_7

    .line 55
    .line 56
    iget-object v6, v5, Lam6;->A:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Ltq2;

    .line 59
    .line 60
    iget-object v7, v6, Ltq2;->b:Ljava/util/HashMap;

    .line 61
    .line 62
    iget-object v8, v1, Lbq2;->A:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    iget-boolean v7, v6, Ltq2;->e:Z

    .line 72
    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    iget-boolean v6, v6, Ltq2;->f:Z

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    move v6, v2

    .line 79
    :goto_2
    if-eqz v6, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    iget-object p0, v1, Lbq2;->D:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    invoke-virtual {v5, p0}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz p0, :cond_6

    .line 91
    .line 92
    iget-boolean v0, p0, Lbq2;->Y:Z

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iput-object p0, v1, Lbq2;->C:Lbq2;

    .line 97
    .line 98
    :cond_6
    iput v3, v1, Lbq2;->w:I

    .line 99
    .line 100
    return-void

    .line 101
    :cond_7
    :goto_3
    iget-object v6, v1, Lbq2;->Q:Ldq2;

    .line 102
    .line 103
    if-eqz v6, :cond_8

    .line 104
    .line 105
    iget-object v2, v5, Lam6;->A:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Ltq2;

    .line 108
    .line 109
    iget-boolean v2, v2, Ltq2;->f:Z

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    iget-object v6, v6, Ldq2;->M:Leq2;

    .line 113
    .line 114
    if-eqz v6, :cond_9

    .line 115
    .line 116
    invoke-virtual {v6}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    xor-int/2addr v2, v6

    .line 121
    :cond_9
    :goto_4
    if-eqz v0, :cond_a

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_a
    if-eqz v2, :cond_b

    .line 125
    .line 126
    :goto_5
    iget-object v0, v5, Lam6;->A:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Ltq2;

    .line 129
    .line 130
    invoke-virtual {v0, v1, v3}, Ltq2;->e(Lbq2;Z)V

    .line 131
    .line 132
    .line 133
    :cond_b
    iget-object v0, v1, Lbq2;->R:Lrq2;

    .line 134
    .line 135
    invoke-virtual {v0}, Lrq2;->l()V

    .line 136
    .line 137
    .line 138
    iget-object v0, v1, Lbq2;->l0:Lw54;

    .line 139
    .line 140
    sget-object v2, Lj54;->ON_DESTROY:Lj54;

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Lw54;->f1(Lj54;)V

    .line 143
    .line 144
    .line 145
    iput v3, v1, Lbq2;->w:I

    .line 146
    .line 147
    iput-boolean v3, v1, Lbq2;->a0:Z

    .line 148
    .line 149
    iput-boolean v3, v1, Lbq2;->i0:Z

    .line 150
    .line 151
    invoke-virtual {v1}, Lbq2;->B()V

    .line 152
    .line 153
    .line 154
    iget-boolean v0, v1, Lbq2;->a0:Z

    .line 155
    .line 156
    if-eqz v0, :cond_f

    .line 157
    .line 158
    iget-object v0, p0, Lwq2;->a:Ljz0;

    .line 159
    .line 160
    invoke-virtual {v0, v1, v3}, Ljz0;->p(Lbq2;Z)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5}, Lam6;->C()Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_d

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Lwq2;

    .line 182
    .line 183
    if-eqz v2, :cond_c

    .line 184
    .line 185
    iget-object v2, v2, Lwq2;->c:Lbq2;

    .line 186
    .line 187
    iget-object v3, v1, Lbq2;->A:Ljava/lang/String;

    .line 188
    .line 189
    iget-object v6, v2, Lbq2;->D:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_c

    .line 196
    .line 197
    iput-object v1, v2, Lbq2;->C:Lbq2;

    .line 198
    .line 199
    iput-object v4, v2, Lbq2;->D:Ljava/lang/String;

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_d
    iget-object v0, v1, Lbq2;->D:Ljava/lang/String;

    .line 203
    .line 204
    if-eqz v0, :cond_e

    .line 205
    .line 206
    invoke-virtual {v5, v0}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iput-object v0, v1, Lbq2;->C:Lbq2;

    .line 211
    .line 212
    :cond_e
    invoke-virtual {v5, p0}, Lam6;->M(Lwq2;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_f
    const-string p0, " did not call through to super.onDestroy()"

    .line 217
    .line 218
    invoke-static {v1, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
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
.end method

.method public final h()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lwq2;->c:Lbq2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATE_VIEW: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, Lbq2;->c0:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v0, v1, Lbq2;->R:Lrq2;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v0, v2}, Lrq2;->u(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, Lbq2;->c0:Landroid/view/View;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v1, Lbq2;->m0:Lbr2;

    .line 51
    .line 52
    invoke-virtual {v0}, Lbr2;->e()V

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Lbr2;->A:Lw54;

    .line 56
    .line 57
    iget-object v0, v0, Lw54;->E:Lk54;

    .line 58
    .line 59
    sget-object v3, Lk54;->y:Lk54;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-ltz v0, :cond_2

    .line 66
    .line 67
    iget-object v0, v1, Lbq2;->m0:Lbr2;

    .line 68
    .line 69
    sget-object v3, Lj54;->ON_DESTROY:Lj54;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Lbr2;->a(Lj54;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iput v2, v1, Lbq2;->w:I

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, v1, Lbq2;->a0:Z

    .line 78
    .line 79
    invoke-virtual {v1}, Lbq2;->C()V

    .line 80
    .line 81
    .line 82
    iget-boolean v2, v1, Lbq2;->a0:Z

    .line 83
    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    invoke-static {v1}, Lhv2;->N0(Lt54;)Lhv2;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget-object v2, v2, Lhv2;->x:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Li94;

    .line 93
    .line 94
    iget-object v2, v2, Li94;->b:Lcz6;

    .line 95
    .line 96
    invoke-virtual {v2}, Lcz6;->f()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    move v4, v0

    .line 101
    :goto_0
    if-ge v4, v3, :cond_3

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Lcz6;->g(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Lh94;

    .line 108
    .line 109
    invoke-virtual {v5}, Lh94;->k()V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v4, v4, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    iput-boolean v0, v1, Lbq2;->N:Z

    .line 116
    .line 117
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 118
    .line 119
    invoke-virtual {p0, v1, v0}, Ljz0;->D(Lbq2;Z)V

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    iput-object p0, v1, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 124
    .line 125
    iput-object p0, v1, Lbq2;->c0:Landroid/view/View;

    .line 126
    .line 127
    iput-object p0, v1, Lbq2;->m0:Lbr2;

    .line 128
    .line 129
    iget-object v2, v1, Lbq2;->n0:Lbp4;

    .line 130
    .line 131
    invoke-virtual {v2, p0}, Lbp4;->i(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iput-boolean v0, v1, Lbq2;->K:Z

    .line 135
    .line 136
    return-void

    .line 137
    :cond_4
    const-string p0, " did not call through to super.onDestroyView()"

    .line 138
    .line 139
    invoke-static {v1, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-void
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

.method public final i()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Lwq2;->c:Lbq2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "movefrom ATTACHED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v1, -0x1

    .line 30
    iput v1, v3, Lbq2;->w:I

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    iput-boolean v4, v3, Lbq2;->a0:Z

    .line 34
    .line 35
    invoke-virtual {v3}, Lbq2;->D()V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    iput-object v5, v3, Lbq2;->h0:Landroid/view/LayoutInflater;

    .line 40
    .line 41
    iget-boolean v6, v3, Lbq2;->a0:Z

    .line 42
    .line 43
    if-eqz v6, :cond_7

    .line 44
    .line 45
    iget-object v6, v3, Lbq2;->R:Lrq2;

    .line 46
    .line 47
    iget-boolean v7, v6, Lrq2;->J:Z

    .line 48
    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    invoke-virtual {v6}, Lrq2;->l()V

    .line 52
    .line 53
    .line 54
    new-instance v6, Lrq2;

    .line 55
    .line 56
    invoke-direct {v6}, Lrq2;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v6, v3, Lbq2;->R:Lrq2;

    .line 60
    .line 61
    :cond_1
    iget-object v6, p0, Lwq2;->a:Ljz0;

    .line 62
    .line 63
    invoke-virtual {v6, v3, v4}, Ljz0;->r(Lbq2;Z)V

    .line 64
    .line 65
    .line 66
    iput v1, v3, Lbq2;->w:I

    .line 67
    .line 68
    iput-object v5, v3, Lbq2;->Q:Ldq2;

    .line 69
    .line 70
    iput-object v5, v3, Lbq2;->S:Lbq2;

    .line 71
    .line 72
    iput-object v5, v3, Lbq2;->P:Lrq2;

    .line 73
    .line 74
    iget-boolean v1, v3, Lbq2;->H:Z

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {v3}, Lbq2;->v()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    iget-object p0, p0, Lwq2;->b:Lam6;

    .line 86
    .line 87
    iget-object p0, p0, Lam6;->A:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Ltq2;

    .line 90
    .line 91
    iget-object v1, p0, Ltq2;->b:Ljava/util/HashMap;

    .line 92
    .line 93
    iget-object v4, v3, Lbq2;->A:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_3

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    iget-boolean v1, p0, Ltq2;->e:Z

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    iget-boolean p0, p0, Ltq2;->f:Z

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 110
    :goto_1
    if-eqz p0, :cond_6

    .line 111
    .line 112
    :goto_2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_5

    .line 117
    .line 118
    new-instance p0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v0, "initState called for fragment: "

    .line 121
    .line 122
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_5
    invoke-virtual {v3}, Lbq2;->s()V

    .line 136
    .line 137
    .line 138
    :cond_6
    return-void

    .line 139
    :cond_7
    const-string p0, " did not call through to super.onDetach()"

    .line 140
    .line 141
    invoke-static {v3, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-void
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

.method public final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Lwq2;->c:Lbq2;

    .line 2
    .line 3
    iget-boolean v1, v0, Lbq2;->J:Z

    .line 4
    .line 5
    if-eqz v1, :cond_4

    .line 6
    .line 7
    iget-boolean v1, v0, Lbq2;->K:Z

    .line 8
    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    iget-boolean v1, v0, Lbq2;->N:Z

    .line 12
    .line 13
    if-nez v1, :cond_4

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, Lrq2;->L(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "moveto CREATE_VIEW: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "FragmentManager"

    .line 37
    .line 38
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v1, v0, Lbq2;->x:Landroid/os/Bundle;

    .line 42
    .line 43
    const-string v2, "savedInstanceState"

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v1, v3

    .line 54
    :goto_0
    invoke-virtual {v0, v1}, Lbq2;->E(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iput-object v4, v0, Lbq2;->h0:Landroid/view/LayoutInflater;

    .line 59
    .line 60
    invoke-virtual {v0, v4, v3, v1}, Lbq2;->K(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 64
    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-virtual {v1, v3}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 72
    .line 73
    const v4, 0x7f0900e5

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v4, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v1, v0, Lbq2;->W:Z

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 84
    .line 85
    const/16 v4, 0x8

    .line 86
    .line 87
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    :cond_2
    iget-object v1, v0, Lbq2;->x:Landroid/os/Bundle;

    .line 91
    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    :cond_3
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lbq2;->I(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v0, Lbq2;->R:Lrq2;

    .line 103
    .line 104
    const/4 v2, 0x2

    .line 105
    invoke-virtual {v1, v2}, Lrq2;->u(I)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 109
    .line 110
    iget-object v1, v0, Lbq2;->c0:Landroid/view/View;

    .line 111
    .line 112
    invoke-virtual {p0, v0, v1, v3}, Ljz0;->C(Lbq2;Landroid/view/View;Z)V

    .line 113
    .line 114
    .line 115
    iput v2, v0, Lbq2;->w:I

    .line 116
    .line 117
    :cond_4
    return-void
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

.method public final k()V
    .locals 11

    .line 1
    iget-object v0, p0, Lwq2;->b:Lam6;

    .line 2
    .line 3
    iget-boolean v1, p0, Lwq2;->d:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "FragmentManager"

    .line 7
    .line 8
    iget-object v4, p0, Lwq2;->c:Lbq2;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v2}, Lrq2;->L(I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    new-instance p0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Ignoring re-entrant call to moveToExpectedState() for "

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    const/4 v1, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    :try_start_0
    iput-boolean v1, p0, Lwq2;->d:Z

    .line 39
    .line 40
    move v6, v5

    .line 41
    :goto_0
    invoke-virtual {p0}, Lwq2;->d()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    iget v8, v4, Lbq2;->w:I

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    if-eq v7, v8, :cond_c

    .line 49
    .line 50
    if-le v7, v8, :cond_7

    .line 51
    .line 52
    add-int/lit8 v8, v8, 0x1

    .line 53
    .line 54
    packed-switch v8, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :pswitch_0
    invoke-virtual {p0}, Lwq2;->n()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :pswitch_1
    const/4 v6, 0x6

    .line 68
    iput v6, v4, Lbq2;->w:I

    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :pswitch_2
    invoke-virtual {p0}, Lwq2;->p()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_2

    .line 76
    .line 77
    :pswitch_3
    iget-object v6, v4, Lbq2;->c0:Landroid/view/View;

    .line 78
    .line 79
    const/4 v7, 0x4

    .line 80
    if-eqz v6, :cond_6

    .line 81
    .line 82
    iget-object v6, v4, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 83
    .line 84
    if-eqz v6, :cond_6

    .line 85
    .line 86
    invoke-virtual {v4}, Lbq2;->p()Lrq2;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-static {v6, v8}, Lun1;->i(Landroid/view/ViewGroup;Lrq2;)Lun1;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    iget-object v8, v4, Lbq2;->c0:Landroid/view/View;

    .line 95
    .line 96
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_4

    .line 101
    .line 102
    if-eq v8, v7, :cond_3

    .line 103
    .line 104
    const/16 v10, 0x8

    .line 105
    .line 106
    if-ne v8, v10, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v2, "Unknown visibility "

    .line 114
    .line 115
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_3
    move v9, v7

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    move v9, v2

    .line 132
    :goto_1
    invoke-static {v2}, Lrq2;->L(I)Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_5

    .line 137
    .line 138
    new-instance v8, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v10, "SpecialEffectsController: Enqueuing add operation for fragment "

    .line 141
    .line 142
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-static {v3, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_5
    invoke-virtual {v6, v9, v2, p0}, Lun1;->d(IILwq2;)V

    .line 156
    .line 157
    .line 158
    :cond_6
    iput v7, v4, Lbq2;->w:I

    .line 159
    .line 160
    goto/16 :goto_2

    .line 161
    .line 162
    :pswitch_4
    invoke-virtual {p0}, Lwq2;->a()V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_2

    .line 166
    .line 167
    :pswitch_5
    invoke-virtual {p0}, Lwq2;->j()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lwq2;->f()V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_2

    .line 174
    .line 175
    :pswitch_6
    invoke-virtual {p0}, Lwq2;->e()V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_2

    .line 179
    .line 180
    :pswitch_7
    invoke-virtual {p0}, Lwq2;->c()V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_7
    add-int/lit8 v8, v8, -0x1

    .line 186
    .line 187
    packed-switch v8, :pswitch_data_1

    .line 188
    .line 189
    .line 190
    goto/16 :goto_2

    .line 191
    .line 192
    :pswitch_8
    invoke-virtual {p0}, Lwq2;->l()V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_2

    .line 196
    .line 197
    :pswitch_9
    const/4 v6, 0x5

    .line 198
    iput v6, v4, Lbq2;->w:I

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :pswitch_a
    invoke-virtual {p0}, Lwq2;->q()V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :pswitch_b
    invoke-static {v9}, Lrq2;->L(I)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_8

    .line 210
    .line 211
    new-instance v6, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const-string v7, "movefrom ACTIVITY_CREATED: "

    .line 217
    .line 218
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    :cond_8
    iget-object v6, v4, Lbq2;->c0:Landroid/view/View;

    .line 232
    .line 233
    if-eqz v6, :cond_9

    .line 234
    .line 235
    iget-object v6, v4, Lbq2;->y:Landroid/util/SparseArray;

    .line 236
    .line 237
    if-nez v6, :cond_9

    .line 238
    .line 239
    invoke-virtual {p0}, Lwq2;->o()V

    .line 240
    .line 241
    .line 242
    :cond_9
    iget-object v6, v4, Lbq2;->c0:Landroid/view/View;

    .line 243
    .line 244
    if-eqz v6, :cond_b

    .line 245
    .line 246
    iget-object v6, v4, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 247
    .line 248
    if-eqz v6, :cond_b

    .line 249
    .line 250
    invoke-virtual {v4}, Lbq2;->p()Lrq2;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    invoke-static {v6, v7}, Lun1;->i(Landroid/view/ViewGroup;Lrq2;)Lun1;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-static {v2}, Lrq2;->L(I)Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    if-eqz v7, :cond_a

    .line 263
    .line 264
    new-instance v7, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string v8, "SpecialEffectsController: Enqueuing remove operation for fragment "

    .line 267
    .line 268
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-static {v3, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    :cond_a
    invoke-virtual {v6, v1, v9, p0}, Lun1;->d(IILwq2;)V

    .line 282
    .line 283
    .line 284
    :cond_b
    iput v9, v4, Lbq2;->w:I

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :pswitch_c
    iput-boolean v5, v4, Lbq2;->K:Z

    .line 288
    .line 289
    iput v2, v4, Lbq2;->w:I

    .line 290
    .line 291
    goto :goto_2

    .line 292
    :pswitch_d
    invoke-virtual {p0}, Lwq2;->h()V

    .line 293
    .line 294
    .line 295
    iput v1, v4, Lbq2;->w:I

    .line 296
    .line 297
    goto :goto_2

    .line 298
    :pswitch_e
    invoke-virtual {p0}, Lwq2;->g()V

    .line 299
    .line 300
    .line 301
    goto :goto_2

    .line 302
    :pswitch_f
    invoke-virtual {p0}, Lwq2;->i()V

    .line 303
    .line 304
    .line 305
    :goto_2
    move v6, v1

    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_c
    if-nez v6, :cond_f

    .line 309
    .line 310
    const/4 v6, -0x1

    .line 311
    if-ne v8, v6, :cond_f

    .line 312
    .line 313
    iget-boolean v6, v4, Lbq2;->H:Z

    .line 314
    .line 315
    if-eqz v6, :cond_f

    .line 316
    .line 317
    invoke-virtual {v4}, Lbq2;->v()Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    if-nez v6, :cond_f

    .line 322
    .line 323
    invoke-static {v9}, Lrq2;->L(I)Z

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    if-eqz v6, :cond_d

    .line 328
    .line 329
    new-instance v6, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string v7, "Cleaning up state of never attached fragment: "

    .line 335
    .line 336
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    :cond_d
    iget-object v6, v0, Lam6;->A:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v6, Ltq2;

    .line 352
    .line 353
    invoke-virtual {v6, v4, v1}, Ltq2;->e(Lbq2;Z)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, p0}, Lam6;->M(Lwq2;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v9}, Lrq2;->L(I)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_e

    .line 364
    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 368
    .line 369
    .line 370
    const-string v6, "initState called for fragment: "

    .line 371
    .line 372
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 383
    .line 384
    .line 385
    :cond_e
    invoke-virtual {v4}, Lbq2;->s()V

    .line 386
    .line 387
    .line 388
    :cond_f
    iget-boolean v0, v4, Lbq2;->g0:Z

    .line 389
    .line 390
    if-eqz v0, :cond_15

    .line 391
    .line 392
    iget-object v0, v4, Lbq2;->c0:Landroid/view/View;

    .line 393
    .line 394
    if-eqz v0, :cond_13

    .line 395
    .line 396
    iget-object v0, v4, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 397
    .line 398
    if-eqz v0, :cond_13

    .line 399
    .line 400
    invoke-virtual {v4}, Lbq2;->p()Lrq2;

    .line 401
    .line 402
    .line 403
    move-result-object v6

    .line 404
    invoke-static {v0, v6}, Lun1;->i(Landroid/view/ViewGroup;Lrq2;)Lun1;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    iget-boolean v6, v4, Lbq2;->W:Z

    .line 409
    .line 410
    if-eqz v6, :cond_11

    .line 411
    .line 412
    invoke-static {v2}, Lrq2;->L(I)Z

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    if-eqz v2, :cond_10

    .line 417
    .line 418
    new-instance v2, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    .line 421
    .line 422
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 433
    .line 434
    .line 435
    :cond_10
    invoke-virtual {v0, v9, v1, p0}, Lun1;->d(IILwq2;)V

    .line 436
    .line 437
    .line 438
    goto :goto_3

    .line 439
    :cond_11
    invoke-static {v2}, Lrq2;->L(I)Z

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    if-eqz v6, :cond_12

    .line 444
    .line 445
    new-instance v6, Ljava/lang/StringBuilder;

    .line 446
    .line 447
    const-string v7, "SpecialEffectsController: Enqueuing show operation for fragment "

    .line 448
    .line 449
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    invoke-static {v3, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 460
    .line 461
    .line 462
    :cond_12
    invoke-virtual {v0, v2, v1, p0}, Lun1;->d(IILwq2;)V

    .line 463
    .line 464
    .line 465
    :cond_13
    :goto_3
    iget-object v0, v4, Lbq2;->P:Lrq2;

    .line 466
    .line 467
    if-eqz v0, :cond_14

    .line 468
    .line 469
    iget-boolean v2, v4, Lbq2;->G:Z

    .line 470
    .line 471
    if-eqz v2, :cond_14

    .line 472
    .line 473
    invoke-static {v4}, Lrq2;->M(Lbq2;)Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-eqz v2, :cond_14

    .line 478
    .line 479
    iput-boolean v1, v0, Lrq2;->G:Z

    .line 480
    .line 481
    :cond_14
    iput-boolean v5, v4, Lbq2;->g0:Z

    .line 482
    .line 483
    iget-object v0, v4, Lbq2;->R:Lrq2;

    .line 484
    .line 485
    invoke-virtual {v0}, Lrq2;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 486
    .line 487
    .line 488
    :cond_15
    iput-boolean v5, p0, Lwq2;->d:Z

    .line 489
    .line 490
    return-void

    .line 491
    :goto_4
    iput-boolean v5, p0, Lwq2;->d:Z

    .line 492
    .line 493
    throw v0

    .line 494
    nop

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final l()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lwq2;->c:Lbq2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom RESUMED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lbq2;->R:Lrq2;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-virtual {v0, v2}, Lrq2;->u(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Lbq2;->c0:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v1, Lbq2;->m0:Lbr2;

    .line 40
    .line 41
    sget-object v2, Lj54;->ON_PAUSE:Lj54;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lbr2;->a(Lj54;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, v1, Lbq2;->l0:Lw54;

    .line 47
    .line 48
    sget-object v2, Lj54;->ON_PAUSE:Lj54;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Lw54;->f1(Lj54;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    iput v0, v1, Lbq2;->w:I

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    iput-boolean v0, v1, Lbq2;->a0:Z

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    iput-boolean v2, v1, Lbq2;->a0:Z

    .line 61
    .line 62
    iget-boolean v2, v1, Lbq2;->a0:Z

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 67
    .line 68
    invoke-virtual {p0, v1, v0}, Ljz0;->s(Lbq2;Z)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    const-string p0, " did not call through to super.onPause()"

    .line 73
    .line 74
    invoke-static {v1, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void
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

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lwq2;->c:Lbq2;

    .line 2
    .line 3
    iget-object v0, p0, Lbq2;->x:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lbq2;->x:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v0, "savedInstanceState"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lbq2;->x:Landroid/os/Bundle;

    .line 22
    .line 23
    new-instance v1, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :try_start_0
    iget-object p1, p0, Lbq2;->x:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v0, "viewState"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lbq2;->y:Landroid/util/SparseArray;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    iget-object p1, p0, Lbq2;->x:Landroid/os/Bundle;

    .line 42
    .line 43
    const-string v0, "viewRegistryState"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lbq2;->z:Landroid/os/Bundle;

    .line 50
    .line 51
    iget-object p1, p0, Lbq2;->x:Landroid/os/Bundle;

    .line 52
    .line 53
    const-string v0, "state"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lvq2;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    iget-object v0, p1, Lvq2;->I:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v0, p0, Lbq2;->D:Ljava/lang/String;

    .line 66
    .line 67
    iget v0, p1, Lvq2;->J:I

    .line 68
    .line 69
    iput v0, p0, Lbq2;->E:I

    .line 70
    .line 71
    iget-boolean p1, p1, Lvq2;->K:Z

    .line 72
    .line 73
    iput-boolean p1, p0, Lbq2;->e0:Z

    .line 74
    .line 75
    :cond_2
    iget-boolean p1, p0, Lbq2;->e0:Z

    .line 76
    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    iput-boolean p1, p0, Lbq2;->d0:Z

    .line 81
    .line 82
    :cond_3
    :goto_0
    return-void

    .line 83
    :catch_0
    move-exception p1

    .line 84
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "Failed to restore view hierarchy state for fragment "

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v0
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

.method public final n()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "FragmentManager"

    .line 7
    .line 8
    iget-object v2, p0, Lwq2;->c:Lbq2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "moveto RESUMED: "

    .line 15
    .line 16
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v2, Lbq2;->f0:Laq2;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move-object v0, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, Laq2;->k:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    if-eqz v0, :cond_5

    .line 39
    .line 40
    iget-object v4, v2, Lbq2;->c0:Landroid/view/View;

    .line 41
    .line 42
    if-ne v0, v4, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    :goto_1
    if-eqz v4, :cond_5

    .line 50
    .line 51
    iget-object v5, v2, Lbq2;->c0:Landroid/view/View;

    .line 52
    .line 53
    if-ne v4, v5, :cond_4

    .line 54
    .line 55
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x2

    .line 60
    invoke-static {v5}, Lrq2;->L(I)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v6, "requestFocus: Restoring focused view "

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, " "

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    const-string v0, "succeeded"

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    const-string v0, "failed"

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, " on Fragment "

    .line 92
    .line 93
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, " resulting in focused view "

    .line 100
    .line 101
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v0, v2, Lbq2;->c0:Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    :goto_4
    invoke-virtual {v2}, Lbq2;->j()Laq2;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v3, v0, Laq2;->k:Landroid/view/View;

    .line 131
    .line 132
    iget-object v0, v2, Lbq2;->R:Lrq2;

    .line 133
    .line 134
    invoke-virtual {v0}, Lrq2;->S()V

    .line 135
    .line 136
    .line 137
    iget-object v0, v2, Lbq2;->R:Lrq2;

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, Lrq2;->A(Z)Z

    .line 141
    .line 142
    .line 143
    const/4 v0, 0x7

    .line 144
    iput v0, v2, Lbq2;->w:I

    .line 145
    .line 146
    const/4 v4, 0x0

    .line 147
    iput-boolean v4, v2, Lbq2;->a0:Z

    .line 148
    .line 149
    iput-boolean v1, v2, Lbq2;->a0:Z

    .line 150
    .line 151
    iget-boolean v1, v2, Lbq2;->a0:Z

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    iget-object v1, v2, Lbq2;->l0:Lw54;

    .line 156
    .line 157
    sget-object v5, Lj54;->ON_RESUME:Lj54;

    .line 158
    .line 159
    invoke-virtual {v1, v5}, Lw54;->f1(Lj54;)V

    .line 160
    .line 161
    .line 162
    iget-object v1, v2, Lbq2;->c0:Landroid/view/View;

    .line 163
    .line 164
    if-eqz v1, :cond_6

    .line 165
    .line 166
    iget-object v1, v2, Lbq2;->m0:Lbr2;

    .line 167
    .line 168
    iget-object v1, v1, Lbr2;->A:Lw54;

    .line 169
    .line 170
    invoke-virtual {v1, v5}, Lw54;->f1(Lj54;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    iget-object v1, v2, Lbq2;->R:Lrq2;

    .line 174
    .line 175
    iput-boolean v4, v1, Lrq2;->H:Z

    .line 176
    .line 177
    iput-boolean v4, v1, Lrq2;->I:Z

    .line 178
    .line 179
    iget-object v5, v1, Lrq2;->O:Ltq2;

    .line 180
    .line 181
    iput-boolean v4, v5, Ltq2;->g:Z

    .line 182
    .line 183
    invoke-virtual {v1, v0}, Lrq2;->u(I)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lwq2;->a:Ljz0;

    .line 187
    .line 188
    invoke-virtual {v0, v2, v4}, Ljz0;->y(Lbq2;Z)V

    .line 189
    .line 190
    .line 191
    iget-object p0, p0, Lwq2;->b:Lam6;

    .line 192
    .line 193
    iget-object v0, v2, Lbq2;->A:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {p0, v0, v3}, Lam6;->R(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 196
    .line 197
    .line 198
    iput-object v3, v2, Lbq2;->x:Landroid/os/Bundle;

    .line 199
    .line 200
    iput-object v3, v2, Lbq2;->y:Landroid/util/SparseArray;

    .line 201
    .line 202
    iput-object v3, v2, Lbq2;->z:Landroid/os/Bundle;

    .line 203
    .line 204
    return-void

    .line 205
    :cond_7
    const-string p0, " did not call through to super.onResume()"

    .line 206
    .line 207
    invoke-static {v2, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
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
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object p0, p0, Lwq2;->c:Lbq2;

    .line 2
    .line 3
    iget-object v0, p0, Lbq2;->c0:Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "Saving view state for fragment "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " with view "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lbq2;->c0:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "FragmentManager"

    .line 40
    .line 41
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    :cond_1
    new-instance v0, Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lbq2;->c0:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-lez v1, :cond_2

    .line 59
    .line 60
    iput-object v0, p0, Lbq2;->y:Landroid/util/SparseArray;

    .line 61
    .line 62
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lbq2;->m0:Lbr2;

    .line 68
    .line 69
    iget-object v1, v1, Lbr2;->B:Lkg5;

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Lkg5;->H(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    iput-object v0, p0, Lbq2;->z:Landroid/os/Bundle;

    .line 81
    .line 82
    :cond_3
    :goto_0
    return-void
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

.method public final p()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lwq2;->c:Lbq2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lbq2;->R:Lrq2;

    .line 30
    .line 31
    invoke-virtual {v0}, Lrq2;->S()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Lbq2;->R:Lrq2;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v2}, Lrq2;->A(Z)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    iput v0, v1, Lbq2;->w:I

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iput-boolean v2, v1, Lbq2;->a0:Z

    .line 45
    .line 46
    invoke-virtual {v1}, Lbq2;->G()V

    .line 47
    .line 48
    .line 49
    iget-boolean v3, v1, Lbq2;->a0:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v3, v1, Lbq2;->l0:Lw54;

    .line 54
    .line 55
    sget-object v4, Lj54;->ON_START:Lj54;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Lw54;->f1(Lj54;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, v1, Lbq2;->c0:Landroid/view/View;

    .line 61
    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    iget-object v3, v1, Lbq2;->m0:Lbr2;

    .line 65
    .line 66
    iget-object v3, v3, Lbr2;->A:Lw54;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lw54;->f1(Lj54;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v3, v1, Lbq2;->R:Lrq2;

    .line 72
    .line 73
    iput-boolean v2, v3, Lrq2;->H:Z

    .line 74
    .line 75
    iput-boolean v2, v3, Lrq2;->I:Z

    .line 76
    .line 77
    iget-object v4, v3, Lrq2;->O:Ltq2;

    .line 78
    .line 79
    iput-boolean v2, v4, Ltq2;->g:Z

    .line 80
    .line 81
    invoke-virtual {v3, v0}, Lrq2;->u(I)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 85
    .line 86
    invoke-virtual {p0, v1, v2}, Ljz0;->A(Lbq2;Z)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    const-string p0, " did not call through to super.onStart()"

    .line 91
    .line 92
    invoke-static {v1, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void
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

.method public final q()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lwq2;->c:Lbq2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lbq2;->R:Lrq2;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v0, Lrq2;->I:Z

    .line 33
    .line 34
    iget-object v3, v0, Lrq2;->O:Ltq2;

    .line 35
    .line 36
    iput-boolean v2, v3, Ltq2;->g:Z

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    invoke-virtual {v0, v2}, Lrq2;->u(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Lbq2;->c0:Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, v1, Lbq2;->m0:Lbr2;

    .line 47
    .line 48
    sget-object v3, Lj54;->ON_STOP:Lj54;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lbr2;->a(Lj54;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, Lbq2;->l0:Lw54;

    .line 54
    .line 55
    sget-object v3, Lj54;->ON_STOP:Lj54;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Lw54;->f1(Lj54;)V

    .line 58
    .line 59
    .line 60
    iput v2, v1, Lbq2;->w:I

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-boolean v0, v1, Lbq2;->a0:Z

    .line 64
    .line 65
    invoke-virtual {v1}, Lbq2;->H()V

    .line 66
    .line 67
    .line 68
    iget-boolean v2, v1, Lbq2;->a0:Z

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    iget-object p0, p0, Lwq2;->a:Ljz0;

    .line 73
    .line 74
    invoke-virtual {p0, v1, v0}, Ljz0;->B(Lbq2;Z)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const-string p0, " did not call through to super.onStop()"

    .line 79
    .line 80
    invoke-static {v1, p0}, Lrf2;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void
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
