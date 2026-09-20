.class public final Lcu/lestebang/utiletecsa/MainActivity;
.super Lyn;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\t\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0012\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/MainActivity;",
        "Lyn;",
        "<init>",
        "()V",
        "Ldh7;",
        "themeSettings",
        "Lis7;",
        "Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;",
        "uiState",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic g0:I


# instance fields
.field public volatile X:Lk8;

.field public final Y:Ljava/lang/Object;

.field public Z:Z

.field public final a0:Ljava/util/ArrayList;

.field public b0:Laz4;

.field public c0:Lf91;

.field public final d0:Lo9;

.field public final e0:La9;

.field public final f0:Led5;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lyn;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcu/lestebang/utiletecsa/MainActivity;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/MainActivity;->Z:Z

    .line 13
    .line 14
    new-instance v1, Lxn;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, p0, v2}, Lxn;-><init>(Lrv0;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lrv0;->m(Lb55;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcu/lestebang/utiletecsa/MainActivity;->a0:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Lbe4;

    .line 31
    .line 32
    invoke-direct {v1, p0, v0}, Lbe4;-><init>(Lcu/lestebang/utiletecsa/MainActivity;I)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lo9;

    .line 36
    .line 37
    const-class v4, Lne4;

    .line 38
    .line 39
    sget-object v5, Lb26;->a:Lc26;

    .line 40
    .line 41
    invoke-virtual {v5, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v5, Lbe4;

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    invoke-direct {v5, p0, v6}, Lbe4;-><init>(Lcu/lestebang/utiletecsa/MainActivity;I)V

    .line 49
    .line 50
    .line 51
    new-instance v6, Lbe4;

    .line 52
    .line 53
    invoke-direct {v6, p0, v2}, Lbe4;-><init>(Lcu/lestebang/utiletecsa/MainActivity;I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v3, v4, v5, v1, v6}, Lo9;-><init>(Lgq3;Lbe4;Lbe4;Lbe4;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Lcu/lestebang/utiletecsa/MainActivity;->d0:Lo9;

    .line 60
    .line 61
    new-instance v1, Ls8;

    .line 62
    .line 63
    invoke-direct {v1, v0, v2}, Ls8;-><init>(ZI)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Ltd4;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Ltd4;-><init>(Lcu/lestebang/utiletecsa/MainActivity;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0, v1}, Lrv0;->o(Lr8;Lhj8;)La9;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcu/lestebang/utiletecsa/MainActivity;->e0:La9;

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcu/lestebang/utiletecsa/MainActivity;->f0:Led5;

    .line 83
    .line 84
    return-void
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

.method public static final t(Lcu/lestebang/utiletecsa/MainActivity;)V
    .locals 12

    .line 1
    const v0, 0x7f11002b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x7f11002a

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_20

    .line 20
    .line 21
    const v2, 0x80ff

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Luq3;->D(I)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1f

    .line 29
    .line 30
    invoke-static {v2}, Luq3;->A(I)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const-string p0, "Negative text must be set and non-empty."

    .line 45
    .line 46
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_3

    .line 55
    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const-string p0, "Negative text must not be set if device credential authentication is allowed."

    .line 60
    .line 61
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    :goto_1
    new-instance v2, Lqc3;

    .line 66
    .line 67
    const/16 v4, 0x13

    .line 68
    .line 69
    invoke-direct {v2, v4, v0, v1}, Lqc3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lc90;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-direct {v0, v1}, Lc90;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, Lag8;->v(Landroid/content/ContextWrapper;)Ljava/util/concurrent/Executor;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_1e

    .line 83
    .line 84
    invoke-virtual {p0}, Leq2;->p()Lrq2;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {p0}, Lrv0;->g()Lz58;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {p0}, Lo85;->l(La68;)Lw58;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {p0}, Lo85;->k(La68;)Lib1;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v8, Lno7;

    .line 107
    .line 108
    invoke-direct {v8, v6, v7, p0}, Lno7;-><init>(Lz58;Lw58;Lib1;)V

    .line 109
    .line 110
    .line 111
    const-class p0, Lf90;

    .line 112
    .line 113
    sget-object v6, Lb26;->a:Lc26;

    .line 114
    .line 115
    invoke-virtual {v6, p0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-interface {p0}, Lgq3;->l()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    if-eqz v6, :cond_1d

    .line 124
    .line 125
    const-string v7, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 126
    .line 127
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v8, p0, v6}, Lno7;->b(Lgq3;Ljava/lang/String;)Lr58;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lf90;

    .line 136
    .line 137
    iput-object v4, p0, Lf90;->b:Ljava/util/concurrent/Executor;

    .line 138
    .line 139
    iput-object v0, p0, Lf90;->c:Lx91;

    .line 140
    .line 141
    const-string p0, "BiometricPromptCompat"

    .line 142
    .line 143
    if-nez v5, :cond_4

    .line 144
    .line 145
    const-string v0, "Unable to start authentication. Client fragment manager was null."

    .line 146
    .line 147
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_4
    invoke-virtual {v5}, Lrq2;->Q()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_5

    .line 156
    .line 157
    const-string v0, "Unable to start authentication. Called after onSaveInstanceState()."

    .line 158
    .line 159
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_5
    const-string p0, "androidx.biometric.BiometricFragment"

    .line 164
    .line 165
    invoke-virtual {v5, p0}, Lrq2;->E(Ljava/lang/String;)Lbq2;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Ly80;

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    if-nez v0, :cond_6

    .line 173
    .line 174
    new-instance v0, Ly80;

    .line 175
    .line 176
    invoke-direct {v0}, Ly80;-><init>()V

    .line 177
    .line 178
    .line 179
    new-instance v6, Landroid/os/Bundle;

    .line 180
    .line 181
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v7, "host_activity"

    .line 185
    .line 186
    invoke-virtual {v6, v7, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v6}, Lbq2;->O(Landroid/os/Bundle;)V

    .line 190
    .line 191
    .line 192
    new-instance v6, Lq30;

    .line 193
    .line 194
    invoke-direct {v6, v5}, Lq30;-><init>(Lrq2;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v4, v0, p0, v1}, Lq30;->f(ILbq2;Ljava/lang/String;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v1, v1}, Lq30;->e(ZZ)I

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v1}, Lrq2;->A(Z)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5}, Lrq2;->F()V

    .line 207
    .line 208
    .line 209
    :cond_6
    iget-object p0, v0, Ly80;->t0:Lf90;

    .line 210
    .line 211
    iput-object v2, p0, Lf90;->d:Lqc3;

    .line 212
    .line 213
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 214
    .line 215
    invoke-virtual {v0}, Ly80;->S()Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    iget-object v5, v0, Ly80;->t0:Lf90;

    .line 220
    .line 221
    if-eqz v2, :cond_7

    .line 222
    .line 223
    const v2, 0x7f1100ba

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v2}, Lbq2;->q(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    iput-object v2, v5, Lf90;->h:Ljava/lang/String;

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_7
    iput-object v3, v5, Lf90;->h:Ljava/lang/String;

    .line 234
    .line 235
    :goto_2
    invoke-virtual {v0}, Lbq2;->n()Landroid/content/Context;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    const/16 v5, 0x1d

    .line 240
    .line 241
    if-ne p0, v5, :cond_b

    .line 242
    .line 243
    iget-object v6, v0, Lbq2;->B:Landroid/os/Bundle;

    .line 244
    .line 245
    invoke-virtual {v0}, Lbq2;->n()Landroid/content/Context;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    if-eqz v7, :cond_8

    .line 250
    .line 251
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    if-eqz v8, :cond_8

    .line 256
    .line 257
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-static {v7}, Lea5;->a(Landroid/content/pm/PackageManager;)Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_8

    .line 266
    .line 267
    move v7, v1

    .line 268
    goto :goto_3

    .line 269
    :cond_8
    move v7, v4

    .line 270
    :goto_3
    const-string v8, "has_fingerprint"

    .line 271
    .line 272
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    if-nez v6, :cond_b

    .line 277
    .line 278
    iget-object v6, v0, Lbq2;->B:Landroid/os/Bundle;

    .line 279
    .line 280
    invoke-virtual {v0}, Lbq2;->n()Landroid/content/Context;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    if-lt p0, v5, :cond_9

    .line 285
    .line 286
    if-eqz v7, :cond_9

    .line 287
    .line 288
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    if-eqz v8, :cond_9

    .line 293
    .line 294
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    invoke-static {v7}, Lfa5;->a(Landroid/content/pm/PackageManager;)Z

    .line 299
    .line 300
    .line 301
    move-result v7

    .line 302
    if-eqz v7, :cond_9

    .line 303
    .line 304
    move v7, v1

    .line 305
    goto :goto_4

    .line 306
    :cond_9
    move v7, v4

    .line 307
    :goto_4
    const-string v8, "has_face"

    .line 308
    .line 309
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    if-nez v6, :cond_b

    .line 314
    .line 315
    iget-object v6, v0, Lbq2;->B:Landroid/os/Bundle;

    .line 316
    .line 317
    invoke-virtual {v0}, Lbq2;->n()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    if-lt p0, v5, :cond_a

    .line 322
    .line 323
    if-eqz v7, :cond_a

    .line 324
    .line 325
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    if-eqz v8, :cond_a

    .line 330
    .line 331
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    invoke-static {v7}, Lfa5;->b(Landroid/content/pm/PackageManager;)Z

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-eqz v7, :cond_a

    .line 340
    .line 341
    move v7, v1

    .line 342
    goto :goto_5

    .line 343
    :cond_a
    move v7, v4

    .line 344
    :goto_5
    const-string v8, "has_iris"

    .line 345
    .line 346
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    if-nez v6, :cond_b

    .line 351
    .line 352
    goto/16 :goto_d

    .line 353
    .line 354
    :cond_b
    invoke-virtual {v0}, Ly80;->S()Z

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-eqz v6, :cond_1b

    .line 359
    .line 360
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 365
    .line 366
    if-lt v6, v5, :cond_c

    .line 367
    .line 368
    invoke-static {v2}, Lz80;->b(Landroid/content/Context;)Landroid/hardware/biometrics/BiometricManager;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    goto :goto_6

    .line 373
    :cond_c
    move-object v7, v3

    .line 374
    :goto_6
    if-gt v6, v5, :cond_d

    .line 375
    .line 376
    new-instance v3, Lg22;

    .line 377
    .line 378
    invoke-direct {v3, v5}, Lg22;-><init>(I)V

    .line 379
    .line 380
    .line 381
    :cond_d
    const-string v6, "Failure in canAuthenticate(). BiometricManager was null."

    .line 382
    .line 383
    const-string v8, "BiometricManager"

    .line 384
    .line 385
    const/16 v9, 0xff

    .line 386
    .line 387
    const/16 v10, 0x1e

    .line 388
    .line 389
    if-lt p0, v10, :cond_f

    .line 390
    .line 391
    if-nez v7, :cond_e

    .line 392
    .line 393
    invoke-static {v8, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 394
    .line 395
    .line 396
    :goto_7
    move v4, v1

    .line 397
    goto/16 :goto_c

    .line 398
    .line 399
    :cond_e
    invoke-static {v7, v9}, La90;->a(Landroid/hardware/biometrics/BiometricManager;I)I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    goto/16 :goto_c

    .line 404
    .line 405
    :cond_f
    invoke-static {v9}, Luq3;->D(I)Z

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    if-nez v10, :cond_10

    .line 410
    .line 411
    const/4 v4, -0x2

    .line 412
    goto/16 :goto_c

    .line 413
    .line 414
    :cond_10
    invoke-static {v2}, Lht3;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    const/16 v11, 0xc

    .line 419
    .line 420
    if-eqz v10, :cond_1a

    .line 421
    .line 422
    invoke-static {v9}, Luq3;->A(I)Z

    .line 423
    .line 424
    .line 425
    move-result v9

    .line 426
    if-eqz v9, :cond_13

    .line 427
    .line 428
    invoke-static {v2}, Lht3;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    if-nez p0, :cond_11

    .line 433
    .line 434
    move p0, v4

    .line 435
    goto :goto_8

    .line 436
    :cond_11
    invoke-static {p0}, Lht3;->b(Landroid/app/KeyguardManager;)Z

    .line 437
    .line 438
    .line 439
    move-result p0

    .line 440
    :goto_8
    if-eqz p0, :cond_12

    .line 441
    .line 442
    goto :goto_c

    .line 443
    :cond_12
    const/16 v4, 0xb

    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_13
    if-ne p0, v5, :cond_15

    .line 447
    .line 448
    if-nez v7, :cond_14

    .line 449
    .line 450
    invoke-static {v8, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 451
    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_14
    invoke-static {v7}, Lz80;->a(Landroid/hardware/biometrics/BiometricManager;)I

    .line 455
    .line 456
    .line 457
    move-result p0

    .line 458
    :goto_9
    move v4, p0

    .line 459
    goto :goto_c

    .line 460
    :cond_15
    const/16 v5, 0x1c

    .line 461
    .line 462
    const-string v6, "Failure in canAuthenticate(). FingerprintManager was null."

    .line 463
    .line 464
    if-ne p0, v5, :cond_19

    .line 465
    .line 466
    if-eqz v2, :cond_1a

    .line 467
    .line 468
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    if-eqz p0, :cond_1a

    .line 473
    .line 474
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    invoke-static {p0}, Lea5;->a(Landroid/content/pm/PackageManager;)Z

    .line 479
    .line 480
    .line 481
    move-result p0

    .line 482
    if-eqz p0, :cond_1a

    .line 483
    .line 484
    invoke-static {v2}, Lht3;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    if-nez p0, :cond_16

    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_16
    invoke-static {p0}, Lht3;->b(Landroid/app/KeyguardManager;)Z

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    :goto_a
    if-nez v4, :cond_17

    .line 496
    .line 497
    if-nez v3, :cond_1a

    .line 498
    .line 499
    invoke-static {v8, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 500
    .line 501
    .line 502
    move v11, v1

    .line 503
    goto :goto_b

    .line 504
    :cond_17
    if-nez v3, :cond_18

    .line 505
    .line 506
    invoke-static {v8, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 507
    .line 508
    .line 509
    :cond_18
    const/4 p0, -0x1

    .line 510
    goto :goto_9

    .line 511
    :cond_19
    if-nez v3, :cond_1a

    .line 512
    .line 513
    invoke-static {v8, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 514
    .line 515
    .line 516
    goto :goto_7

    .line 517
    :cond_1a
    :goto_b
    move v4, v11

    .line 518
    :goto_c
    if-eqz v4, :cond_1b

    .line 519
    .line 520
    :goto_d
    iget-object p0, v0, Ly80;->t0:Lf90;

    .line 521
    .line 522
    iput-boolean v1, p0, Lf90;->k:Z

    .line 523
    .line 524
    invoke-virtual {v0}, Ly80;->U()V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :cond_1b
    iget-object p0, v0, Ly80;->t0:Lf90;

    .line 529
    .line 530
    iget-boolean p0, p0, Lf90;->m:Z

    .line 531
    .line 532
    if-eqz p0, :cond_1c

    .line 533
    .line 534
    iget-object p0, v0, Ly80;->u0:Landroid/os/Handler;

    .line 535
    .line 536
    new-instance v1, Lx80;

    .line 537
    .line 538
    invoke-direct {v1, v0}, Lx80;-><init>(Ly80;)V

    .line 539
    .line 540
    .line 541
    const-wide/16 v2, 0x258

    .line 542
    .line 543
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_1c
    invoke-virtual {v0}, Ly80;->Z()V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :cond_1d
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 552
    .line 553
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :cond_1e
    const-string p0, "Executor must not be null."

    .line 558
    .line 559
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :cond_1f
    new-instance p0, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    const-string v0, "Authenticator combination is unsupported on API "

    .line 566
    .line 567
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 571
    .line 572
    const-string v1, ": BIOMETRIC_WEAK | DEVICE_CREDENTIAL"

    .line 573
    .line 574
    invoke-static {p0, v0, v1}, Lhl6;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    return-void

    .line 582
    :cond_20
    const-string p0, "Title must be set and non-empty."

    .line 583
    .line 584
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    return-void
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
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/MainActivity;->u()Lk8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lk8;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
.end method

.method public final c()Lw58;
    .locals 1

    .line 1
    invoke-super {p0}, Lrv0;->c()Lw58;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lh49;->x(Lrv0;Lw58;)Lxz2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    new-instance v2, Lh07;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lh07;-><init>(Lcu/lestebang/utiletecsa/MainActivity;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v2, Lkg5;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lkg5;-><init>(Lcu/lestebang/utiletecsa/MainActivity;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v2}, Lkg5;->z()V

    .line 21
    .line 22
    .line 23
    invoke-virtual/range {p0 .. p1}, Lcu/lestebang/utiletecsa/MainActivity;->w(Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x0

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const-string v7, "cu.lestebang.utiletecsa.extra.OPEN_NAUTA"

    .line 36
    .line 37
    invoke-virtual {v3, v7, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ne v3, v5, :cond_1

    .line 42
    .line 43
    sget-object v3, Llk7;->D:Llk7;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v3, v6

    .line 47
    :goto_1
    iget-object v7, v0, Lcu/lestebang/utiletecsa/MainActivity;->f0:Led5;

    .line 48
    .line 49
    invoke-virtual {v7, v3}, Led5;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Ldh7;

    .line 53
    .line 54
    invoke-direct {v3, v4, v4}, Ldh7;-><init>(ZZ)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v0}, Lt49;->O(Lrv0;)Ll54;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    new-instance v7, Lyd4;

    .line 66
    .line 67
    invoke-direct {v7, v0, v3, v6, v5}, Lyd4;-><init>(Lcu/lestebang/utiletecsa/MainActivity;Led5;Lf61;I)V

    .line 68
    .line 69
    .line 70
    const/4 v8, 0x3

    .line 71
    invoke-static {v4, v6, v6, v7, v8}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 72
    .line 73
    .line 74
    new-instance v4, Ltd4;

    .line 75
    .line 76
    invoke-direct {v4, v0}, Ltd4;-><init>(Lcu/lestebang/utiletecsa/MainActivity;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v4}, Lkg5;->P(Ltd4;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Lp13;

    .line 83
    .line 84
    const/16 v4, 0x19

    .line 85
    .line 86
    invoke-direct {v2, v4, v0, v3}, Lp13;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v3, Lfw0;

    .line 90
    .line 91
    const v4, 0x53b2c5b4

    .line 92
    .line 93
    .line 94
    invoke-direct {v3, v4, v2, v5}, Lfw0;-><init>(ILjava/lang/Object;Z)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v3}, Lsv0;->a(Lrv0;Lfw0;)V

    .line 98
    .line 99
    .line 100
    const-string v15, "android.permission.READ_CALL_LOG"

    .line 101
    .line 102
    const-string v16, "android.permission.READ_SMS"

    .line 103
    .line 104
    const-string v9, "android.permission.CALL_PHONE"

    .line 105
    .line 106
    const-string v10, "android.permission.READ_PHONE_STATE"

    .line 107
    .line 108
    const-string v11, "android.permission.ACCESS_FINE_LOCATION"

    .line 109
    .line 110
    const-string v12, "android.permission.ACCESS_COARSE_LOCATION"

    .line 111
    .line 112
    const-string v13, "android.permission.READ_CONTACTS"

    .line 113
    .line 114
    const-string v14, "android.permission.SEND_SMS"

    .line 115
    .line 116
    filled-new-array/range {v9 .. v16}, [Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {v2}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v3, v0, Lcu/lestebang/utiletecsa/MainActivity;->a0:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 127
    .line 128
    .line 129
    const/16 v2, 0x21

    .line 130
    .line 131
    if-lt v1, v2, :cond_2

    .line 132
    .line 133
    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 134
    .line 135
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-static {v0}, Lt49;->O(Lrv0;)Ll54;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v2, Lot;

    .line 143
    .line 144
    const/16 v3, 0x10

    .line 145
    .line 146
    invoke-direct {v2, v0, v6, v3}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 147
    .line 148
    .line 149
    invoke-static {v1, v6, v6, v2, v8}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 150
    .line 151
    .line 152
    return-void
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

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lyn;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/MainActivity;->u()Lk8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, Lk8;->A:Lv70;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lv70;->y:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lrv0;->onNewIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "cu.lestebang.utiletecsa.extra.OPEN_NAUTA"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x1

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    sget-object p1, Llk7;->D:Llk7;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lcu/lestebang/utiletecsa/MainActivity;->f0:Led5;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
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
.end method

.method public final u()Lk8;
    .locals 2

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/MainActivity;->X:Lk8;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/MainActivity;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcu/lestebang/utiletecsa/MainActivity;->X:Lk8;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lk8;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lk8;-><init>(Lrv0;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcu/lestebang/utiletecsa/MainActivity;->X:Lk8;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    iget-object p0, p0, Lcu/lestebang/utiletecsa/MainActivity;->X:Lk8;

    .line 27
    .line 28
    return-object p0
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

.method public final v()Lne4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcu/lestebang/utiletecsa/MainActivity;->d0:Lo9;

    .line 2
    .line 3
    invoke-virtual {p0}, Lo9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lne4;

    .line 8
    .line 9
    return-object p0
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
.end method

.method public final w(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Leq2;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/MainActivity;->u()Lk8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lk8;->c()V

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
