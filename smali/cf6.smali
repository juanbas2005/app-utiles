.class public abstract Lcf6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ls63;

.field public static final b:Lhr2;

.field public static final c:Lor2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls63;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ls63;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcf6;->a:Ls63;

    .line 9
    .line 10
    new-instance v0, Lhr2;

    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lhr2;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcf6;->b:Lhr2;

    .line 18
    .line 19
    new-instance v0, Lor2;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lor2;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcf6;->c:Lor2;

    .line 25
    .line 26
    return-void
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

.method public static final a(Lib1;)Lye6;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcf6;->a:Ls63;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lib1;->a(Lhb1;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lif6;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_c

    .line 14
    .line 15
    sget-object v2, Lcf6;->b:Lhr2;

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lib1;->a(Lhb1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La68;

    .line 22
    .line 23
    if-eqz v2, :cond_b

    .line 24
    .line 25
    sget-object v3, Lcf6;->c:Lor2;

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lib1;->a(Lhb1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroid/os/Bundle;

    .line 32
    .line 33
    sget-object v4, Ly58;->a:Lts2;

    .line 34
    .line 35
    invoke-virtual {p0, v4}, Lib1;->a(Lhb1;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p0, :cond_a

    .line 42
    .line 43
    invoke-interface {v0}, Lif6;->h()Lkg5;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v4, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 48
    .line 49
    invoke-virtual {v0, v4}, Lkg5;->x(Ljava/lang/String;)Lgf6;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    instance-of v4, v0, Ldf6;

    .line 54
    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    check-cast v0, Ldf6;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v0, v1

    .line 61
    :goto_0
    if-eqz v0, :cond_9

    .line 62
    .line 63
    invoke-static {v2}, Lcf6;->c(La68;)Lef6;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget-object v2, v2, Lef6;->b:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lye6;

    .line 74
    .line 75
    if-nez v4, :cond_8

    .line 76
    .line 77
    invoke-virtual {v0}, Ldf6;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v4, v0, Ldf6;->c:Landroid/os/Bundle;

    .line 81
    .line 82
    if-nez v4, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v4, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    invoke-virtual {v4, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-nez v5, :cond_3

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    new-array v6, v5, [Lyb5;

    .line 100
    .line 101
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, [Lyb5;

    .line 106
    .line 107
    invoke-static {v5}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :cond_3
    invoke-virtual {v4, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_4

    .line 119
    .line 120
    iput-object v1, v0, Ldf6;->c:Landroid/os/Bundle;

    .line 121
    .line 122
    :cond_4
    move-object v1, v5

    .line 123
    :goto_1
    if-nez v1, :cond_5

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    move-object v3, v1

    .line 127
    :goto_2
    if-nez v3, :cond_6

    .line 128
    .line 129
    new-instance v0, Lye6;

    .line 130
    .line 131
    invoke-direct {v0}, Lye6;-><init>()V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    const-class v0, Lye6;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    new-instance v1, Lze4;

    .line 152
    .line 153
    invoke-direct {v1, v0}, Lze4;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_7

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-virtual {v1, v4, v5}, Lze4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    invoke-virtual {v1}, Lze4;->b()Lze4;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v1, Lye6;

    .line 192
    .line 193
    invoke-direct {v1, v0}, Lye6;-><init>(Lze4;)V

    .line 194
    .line 195
    .line 196
    move-object v0, v1

    .line 197
    :goto_4
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    return-object v0

    .line 201
    :cond_8
    return-object v4

    .line 202
    :cond_9
    const-string p0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 203
    .line 204
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :cond_a
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 209
    .line 210
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-object v1

    .line 214
    :cond_b
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 215
    .line 216
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-object v1

    .line 220
    :cond_c
    const-string p0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 221
    .line 222
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object v1
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
.end method

.method public static final b(Lif6;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Lt54;->k()Lin8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lin8;->G0()Lk54;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lk54;->x:Lk54;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Lk54;->y:Lk54;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v1, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `"

    .line 19
    .line 20
    const-string v2, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."

    .line 21
    .line 22
    const-string v3, "Failed to enable `SavedStateHandle` for `"

    .line 23
    .line 24
    invoke-static {v3, p0, v1, v0, v2}, Lku4;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p0}, Lif6;->h()Lkg5;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lkg5;->x(Ljava/lang/String;)Lgf6;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    new-instance v0, Ldf6;

    .line 41
    .line 42
    invoke-interface {p0}, Lif6;->h()Lkg5;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    move-object v3, p0

    .line 47
    check-cast v3, La68;

    .line 48
    .line 49
    invoke-direct {v0, v2, v3}, Ldf6;-><init>(Lkg5;La68;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0}, Lif6;->h()Lkg5;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2, v1, v0}, Lkg5;->K(Ljava/lang/String;Lgf6;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Lt54;->k()Lin8;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance v1, Lky5;

    .line 64
    .line 65
    const/4 v2, 0x4

    .line 66
    invoke-direct {v1, v2, v0}, Lky5;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1}, Lin8;->x0(Ls54;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static final c(La68;)Lef6;
    .locals 3

    .line 1
    new-instance v0, Lbf6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lo85;->k(La68;)Lib1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, La68;->g()Lz58;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lno7;

    .line 21
    .line 22
    invoke-direct {v2, p0, v0, v1}, Lno7;-><init>(Lz58;Lw58;Lib1;)V

    .line 23
    .line 24
    .line 25
    const-class p0, Lef6;

    .line 26
    .line 27
    sget-object v0, Lb26;->a:Lc26;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 34
    .line 35
    invoke-virtual {v2, p0, v0}, Lno7;->b(Lgq3;Ljava/lang/String;)Lr58;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lef6;

    .line 40
    .line 41
    return-object p0
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
