.class public final synthetic Lzh;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lzh;->w:I

    iput-object p2, p0, Lzh;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm92;Lgy6;)V
    .locals 0

    .line 1
    const/16 p2, 0xe

    .line 2
    .line 3
    iput p2, p0, Lzh;->w:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lzh;->x:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lzh;->w:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Lnt4;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lnt4;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lzs4;

    .line 26
    .line 27
    iget-object v0, v0, Lzs4;->D:Lbt4;

    .line 28
    .line 29
    iget-boolean v1, v0, Lbt4;->i:Z

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, v0, Lbt4;->j:Lw54;

    .line 34
    .line 35
    iget-object v1, v1, Lw54;->E:Lk54;

    .line 36
    .line 37
    sget-object v2, Lk54;->w:Lk54;

    .line 38
    .line 39
    if-eq v1, v2, :cond_1

    .line 40
    .line 41
    iget-object v1, v0, Lbt4;->a:Lzs4;

    .line 42
    .line 43
    iget-object v0, v0, Lbt4;->m:Lz97;

    .line 44
    .line 45
    invoke-virtual {v0}, Lz97;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lw58;

    .line 50
    .line 51
    invoke-static {v1}, Lo85;->k(La68;)Lib1;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lzs4;->g()Lz58;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v3, Lno7;

    .line 66
    .line 67
    invoke-direct {v3, v1, v0, v2}, Lno7;-><init>(Lz58;Lw58;Lib1;)V

    .line 68
    .line 69
    .line 70
    const-class v0, Lat4;

    .line 71
    .line 72
    sget-object v1, Lb26;->a:Lc26;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Lgq3;->l()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v1, :cond_0

    .line 83
    .line 84
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v3, v0, v1}, Lno7;->b(Lgq3;Ljava/lang/String;)Lr58;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lat4;

    .line 95
    .line 96
    iget-object v6, v0, Lat4;->b:Lye6;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 100
    .line 101
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    const-string v0, "You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed."

    .line 106
    .line 107
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    const-string v0, "You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    .line 112
    .line 113
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    return-object v6

    .line 117
    :pswitch_1
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 120
    .line 121
    iget-object v0, v0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->J:Ld37;

    .line 122
    .line 123
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v6, v1}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    sget-object v0, Lvs7;->a:Lvs7;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_2
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lmw1;

    .line 137
    .line 138
    invoke-interface {v0}, Lmw1;->b()V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lvs7;->a:Lvs7;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_3
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Lv44;

    .line 147
    .line 148
    new-instance v1, Landroid/view/inputmethod/BaseInputConnection;

    .line 149
    .line 150
    iget-object v0, v0, Lv44;->a:Landroid/view/View;

    .line 151
    .line 152
    invoke-direct {v1, v0, v5}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 153
    .line 154
    .line 155
    return-object v1

    .line 156
    :pswitch_4
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lcs3;

    .line 159
    .line 160
    iget-object v0, v0, Lcs3;->w:Ljava/lang/Object;

    .line 161
    .line 162
    instance-of v1, v0, Lnv3;

    .line 163
    .line 164
    if-eqz v1, :cond_3

    .line 165
    .line 166
    check-cast v0, Lnv3;

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    move-object v0, v6

    .line 170
    :goto_1
    if-eqz v0, :cond_4

    .line 171
    .line 172
    invoke-interface {v0}, Lnv3;->s()Ljava/lang/reflect/GenericDeclaration;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    :cond_4
    return-object v6

    .line 177
    :pswitch_5
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Leh3;

    .line 180
    .line 181
    iget-object v0, v0, Leh3;->a:La96;

    .line 182
    .line 183
    invoke-virtual {v0}, La96;->k()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_6

    .line 188
    .line 189
    invoke-virtual {v0}, La96;->n()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_5
    move v4, v5

    .line 197
    :cond_6
    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :pswitch_6
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lqc3;

    .line 205
    .line 206
    iget-object v0, v0, Lqc3;->x:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Landroid/view/View;

    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    const-string v1, "input_method"

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_7
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lo81;

    .line 229
    .line 230
    invoke-interface {v0}, Lo81;->k()Le81;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, Li95;->p(Le81;)F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    return-object v0

    .line 243
    :pswitch_8
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 244
    .line 245
    move-object v1, v0

    .line 246
    check-cast v1, Lp33;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    :try_start_0
    iget-object v0, v1, Lp33;->S:Lx33;

    .line 252
    .line 253
    invoke-virtual {v0, v3, v5, v5}, Lx33;->v(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :catch_0
    move-exception v0

    .line 258
    sget-object v2, Lk62;->z:Lk62;

    .line 259
    .line 260
    invoke-virtual {v1, v2, v2, v0}, Lp33;->a(Lk62;Lk62;Ljava/io/IOException;)V

    .line 261
    .line 262
    .line 263
    :goto_3
    sget-object v0, Lvs7;->a:Lvs7;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_9
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Lyd;

    .line 269
    .line 270
    invoke-virtual {v0}, Lyd;->b()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    sget-object v0, Lvs7;->a:Lvs7;

    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_a
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, Lyd;

    .line 279
    .line 280
    invoke-virtual {v0}, Lyd;->b()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    sget-object v0, Lvs7;->a:Lvs7;

    .line 284
    .line 285
    return-object v0

    .line 286
    :pswitch_b
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Lnr2;

    .line 289
    .line 290
    iget-object v1, v0, Lnr2;->x:Ljava/lang/String;

    .line 291
    .line 292
    const/16 v2, 0x18

    .line 293
    .line 294
    if-eqz v1, :cond_7

    .line 295
    .line 296
    iget-boolean v3, v0, Lnr2;->z:Z

    .line 297
    .line 298
    if-eqz v3, :cond_7

    .line 299
    .line 300
    new-instance v3, Ljava/io/File;

    .line 301
    .line 302
    iget-object v4, v0, Lnr2;->w:Landroid/content/Context;

    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-direct {v3, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    new-instance v5, Lmr2;

    .line 318
    .line 319
    iget-object v6, v0, Lnr2;->w:Landroid/content/Context;

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    new-instance v8, Lji8;

    .line 326
    .line 327
    invoke-direct {v8, v2}, Lji8;-><init>(I)V

    .line 328
    .line 329
    .line 330
    iget-object v9, v0, Lnr2;->y:Lqa;

    .line 331
    .line 332
    iget-boolean v10, v0, Lnr2;->A:Z

    .line 333
    .line 334
    invoke-direct/range {v5 .. v10}, Lmr2;-><init>(Landroid/content/Context;Ljava/lang/String;Lji8;Lqa;Z)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_7
    new-instance v6, Lmr2;

    .line 339
    .line 340
    iget-object v7, v0, Lnr2;->w:Landroid/content/Context;

    .line 341
    .line 342
    iget-object v8, v0, Lnr2;->x:Ljava/lang/String;

    .line 343
    .line 344
    new-instance v9, Lji8;

    .line 345
    .line 346
    invoke-direct {v9, v2}, Lji8;-><init>(I)V

    .line 347
    .line 348
    .line 349
    iget-object v10, v0, Lnr2;->y:Lqa;

    .line 350
    .line 351
    iget-boolean v11, v0, Lnr2;->A:Z

    .line 352
    .line 353
    invoke-direct/range {v6 .. v11}, Lmr2;-><init>(Landroid/content/Context;Ljava/lang/String;Lji8;Lqa;Z)V

    .line 354
    .line 355
    .line 356
    move-object v5, v6

    .line 357
    :goto_4
    iget-boolean v0, v0, Lnr2;->C:Z

    .line 358
    .line 359
    invoke-virtual {v5, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 360
    .line 361
    .line 362
    return-object v5

    .line 363
    :pswitch_c
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v0, Lxf2;

    .line 366
    .line 367
    iget-object v0, v0, Lxf2;->a:Ljava/util/concurrent/CountDownLatch;

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 370
    .line 371
    .line 372
    sget-object v0, Lvs7;->a:Lvs7;

    .line 373
    .line 374
    return-object v0

    .line 375
    :pswitch_d
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Ljava/io/File;

    .line 378
    .line 379
    sget-object v1, Lgd2;->e:Ljava/lang/Object;

    .line 380
    .line 381
    monitor-enter v1

    .line 382
    :try_start_1
    sget-object v2, Lgd2;->d:Ljava/util/LinkedHashSet;

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 389
    .line 390
    .line 391
    monitor-exit v1

    .line 392
    sget-object v0, Lvs7;->a:Lvs7;

    .line 393
    .line 394
    return-object v0

    .line 395
    :catchall_0
    move-exception v0

    .line 396
    monitor-exit v1

    .line 397
    throw v0

    .line 398
    :pswitch_e
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, Lm92;

    .line 401
    .line 402
    invoke-virtual {v0}, Lm92;->b()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 406
    .line 407
    return-object v0

    .line 408
    :pswitch_f
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Lp92;

    .line 411
    .line 412
    iget-object v0, v0, Lp92;->A:Led5;

    .line 413
    .line 414
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, Lql7;

    .line 419
    .line 420
    iget-wide v0, v0, Lql7;->a:J

    .line 421
    .line 422
    new-instance v2, Lql7;

    .line 423
    .line 424
    invoke-direct {v2, v0, v1}, Lql7;-><init>(J)V

    .line 425
    .line 426
    .line 427
    return-object v2

    .line 428
    :pswitch_10
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v0, Lxz1;

    .line 431
    .line 432
    iget-object v1, v0, Lxz1;->c:Led5;

    .line 433
    .line 434
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    check-cast v1, Ltp1;

    .line 439
    .line 440
    if-eqz v1, :cond_8

    .line 441
    .line 442
    sget-object v0, Lpv4;->a:Ljo7;

    .line 443
    .line 444
    const/high16 v0, 0x43c80000    # 400.0f

    .line 445
    .line 446
    invoke-interface {v1, v0}, Ltp1;->e0(F)F

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    goto :goto_5

    .line 455
    :cond_8
    const-string v1, "The density on DrawerState ("

    .line 456
    .line 457
    const-string v2, ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?"

    .line 458
    .line 459
    invoke-static {v0, v2, v1}, Lku4;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    :goto_5
    return-object v6

    .line 463
    :pswitch_11
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v0, Lmd7;

    .line 466
    .line 467
    invoke-interface {v0}, Lmd7;->close()V

    .line 468
    .line 469
    .line 470
    sget-object v0, Lvs7;->a:Lvs7;

    .line 471
    .line 472
    return-object v0

    .line 473
    :pswitch_12
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v0, Lz75;

    .line 476
    .line 477
    new-instance v1, Lse7;

    .line 478
    .line 479
    invoke-direct {v1, v0, v2}, Lse7;-><init>(Lz75;F)V

    .line 480
    .line 481
    .line 482
    return-object v1

    .line 483
    :pswitch_13
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v0, Lu44;

    .line 486
    .line 487
    invoke-virtual {v0}, Lu44;->d()Lcg7;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    return-object v0

    .line 492
    :pswitch_14
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Lqc3;

    .line 495
    .line 496
    const-string v1, ":memory:"

    .line 497
    .line 498
    invoke-virtual {v0, v1}, Lqc3;->n(Ljava/lang/String;)Lua6;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    return-object v0

    .line 503
    :pswitch_15
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Ljava/lang/Iterable;

    .line 506
    .line 507
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    return-object v0

    .line 512
    :pswitch_16
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v0, Lly5;

    .line 515
    .line 516
    return-object v0

    .line 517
    :pswitch_17
    const-string v1, "Orientation"

    .line 518
    .line 519
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, Lq90;

    .line 522
    .line 523
    new-instance v7, Landroid/graphics/BitmapFactory$Options;

    .line 524
    .line 525
    invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 526
    .line 527
    .line 528
    iget-object v8, v0, Lq90;->b:Lv75;

    .line 529
    .line 530
    new-instance v9, Ln90;

    .line 531
    .line 532
    iget-object v10, v0, Lq90;->a:Lu83;

    .line 533
    .line 534
    invoke-virtual {v10}, Lu83;->k()Led0;

    .line 535
    .line 536
    .line 537
    move-result-object v11

    .line 538
    invoke-direct {v9, v11}, Lsp2;-><init>(Loy6;)V

    .line 539
    .line 540
    .line 541
    new-instance v11, Lzw5;

    .line 542
    .line 543
    invoke-direct {v11, v9}, Lzw5;-><init>(Loy6;)V

    .line 544
    .line 545
    .line 546
    iput-boolean v4, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 547
    .line 548
    invoke-virtual {v11}, Lzw5;->a()Lzw5;

    .line 549
    .line 550
    .line 551
    move-result-object v12

    .line 552
    new-instance v13, Laa0;

    .line 553
    .line 554
    const/4 v14, 0x3

    .line 555
    invoke-direct {v13, v14, v12}, Laa0;-><init>(ILjava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    invoke-static {v13, v6, v7}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 559
    .line 560
    .line 561
    iget-object v12, v9, Ln90;->x:Ljava/lang/Exception;

    .line 562
    .line 563
    if-nez v12, :cond_35

    .line 564
    .line 565
    iput-boolean v5, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 566
    .line 567
    sget-object v12, Lu82;->a:Landroid/graphics/Paint;

    .line 568
    .line 569
    iget-object v12, v7, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 570
    .line 571
    iget-object v0, v0, Lq90;->d:Lt82;

    .line 572
    .line 573
    sget-object v13, Lv82;->a:Ljava/util/Set;

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    const/16 v15, 0x5a

    .line 580
    .line 581
    if-eqz v0, :cond_e

    .line 582
    .line 583
    if-eq v0, v4, :cond_a

    .line 584
    .line 585
    if-ne v0, v3, :cond_9

    .line 586
    .line 587
    goto :goto_6

    .line 588
    :cond_9
    invoke-static {}, Lh;->c()V

    .line 589
    .line 590
    .line 591
    goto/16 :goto_1e

    .line 592
    .line 593
    :cond_a
    if-eqz v12, :cond_e

    .line 594
    .line 595
    sget-object v0, Lv82;->a:Ljava/util/Set;

    .line 596
    .line 597
    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_e

    .line 602
    .line 603
    :goto_6
    new-instance v0, Lp82;

    .line 604
    .line 605
    new-instance v12, Lq82;

    .line 606
    .line 607
    invoke-virtual {v11}, Lzw5;->a()Lzw5;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    new-instance v6, Laa0;

    .line 612
    .line 613
    invoke-direct {v6, v14, v2}, Laa0;-><init>(ILjava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    invoke-direct {v12, v6}, Lq82;-><init>(Ljava/io/InputStream;)V

    .line 617
    .line 618
    .line 619
    invoke-direct {v0, v12}, Lp82;-><init>(Lq82;)V

    .line 620
    .line 621
    .line 622
    new-instance v2, Li82;

    .line 623
    .line 624
    invoke-virtual {v0, v1}, Lp82;->c(Ljava/lang/String;)Ll82;

    .line 625
    .line 626
    .line 627
    move-result-object v6

    .line 628
    if-nez v6, :cond_b

    .line 629
    .line 630
    goto :goto_7

    .line 631
    :cond_b
    :try_start_2
    iget-object v12, v0, Lp82;->e:Ljava/nio/ByteOrder;

    .line 632
    .line 633
    invoke-virtual {v6, v12}, Ll82;->e(Ljava/nio/ByteOrder;)I

    .line 634
    .line 635
    .line 636
    move-result v6
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 637
    goto :goto_8

    .line 638
    :catch_1
    :goto_7
    move v6, v4

    .line 639
    :goto_8
    if-eq v6, v3, :cond_c

    .line 640
    .line 641
    const/4 v3, 0x7

    .line 642
    if-eq v6, v3, :cond_c

    .line 643
    .line 644
    const/4 v3, 0x4

    .line 645
    if-eq v6, v3, :cond_c

    .line 646
    .line 647
    const/4 v3, 0x5

    .line 648
    if-eq v6, v3, :cond_c

    .line 649
    .line 650
    move v3, v5

    .line 651
    goto :goto_9

    .line 652
    :cond_c
    move v3, v4

    .line 653
    :goto_9
    invoke-virtual {v0, v1}, Lp82;->c(Ljava/lang/String;)Ll82;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    if-nez v1, :cond_d

    .line 658
    .line 659
    goto :goto_a

    .line 660
    :cond_d
    :try_start_3
    iget-object v0, v0, Lp82;->e:Ljava/nio/ByteOrder;

    .line 661
    .line 662
    invoke-virtual {v1, v0}, Ll82;->e(Ljava/nio/ByteOrder;)I

    .line 663
    .line 664
    .line 665
    move-result v0
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 666
    goto :goto_b

    .line 667
    :catch_2
    :goto_a
    move v0, v4

    .line 668
    :goto_b
    packed-switch v0, :pswitch_data_1

    .line 669
    .line 670
    .line 671
    move v0, v5

    .line 672
    goto :goto_c

    .line 673
    :pswitch_18
    move v0, v15

    .line 674
    goto :goto_c

    .line 675
    :pswitch_19
    const/16 v0, 0x10e

    .line 676
    .line 677
    goto :goto_c

    .line 678
    :pswitch_1a
    const/16 v0, 0xb4

    .line 679
    .line 680
    :goto_c
    invoke-direct {v2, v3, v0}, Li82;-><init>(ZI)V

    .line 681
    .line 682
    .line 683
    goto :goto_d

    .line 684
    :cond_e
    sget-object v2, Li82;->c:Li82;

    .line 685
    .line 686
    :goto_d
    iget v0, v2, Li82;->b:I

    .line 687
    .line 688
    iget-boolean v1, v2, Li82;->a:Z

    .line 689
    .line 690
    iget-object v2, v9, Ln90;->x:Ljava/lang/Exception;

    .line 691
    .line 692
    if-nez v2, :cond_34

    .line 693
    .line 694
    iput-boolean v5, v7, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 695
    .line 696
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 697
    .line 698
    const/16 v3, 0x1a

    .line 699
    .line 700
    if-lt v2, v3, :cond_f

    .line 701
    .line 702
    iget-object v6, v8, Lv75;->c:Landroid/graphics/ColorSpace;

    .line 703
    .line 704
    if-eqz v6, :cond_f

    .line 705
    .line 706
    invoke-static {v7, v6}, Lz10;->x(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 707
    .line 708
    .line 709
    :cond_f
    iget-boolean v6, v8, Lv75;->h:Z

    .line 710
    .line 711
    iget-object v12, v8, Lv75;->a:Landroid/content/Context;

    .line 712
    .line 713
    iget-object v14, v8, Lv75;->d:Luu6;

    .line 714
    .line 715
    iput-boolean v6, v7, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 716
    .line 717
    iget-object v6, v8, Lv75;->b:Landroid/graphics/Bitmap$Config;

    .line 718
    .line 719
    if-nez v1, :cond_10

    .line 720
    .line 721
    if-lez v0, :cond_12

    .line 722
    .line 723
    :cond_10
    if-eqz v6, :cond_11

    .line 724
    .line 725
    invoke-static {v6}, Lkl8;->A(Landroid/graphics/Bitmap$Config;)Z

    .line 726
    .line 727
    .line 728
    move-result v16

    .line 729
    if-eqz v16, :cond_12

    .line 730
    .line 731
    :cond_11
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 732
    .line 733
    :cond_12
    iget-boolean v5, v8, Lv75;->g:Z

    .line 734
    .line 735
    if-eqz v5, :cond_13

    .line 736
    .line 737
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 738
    .line 739
    if-ne v6, v5, :cond_13

    .line 740
    .line 741
    iget-object v5, v7, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 742
    .line 743
    const-string v13, "image/jpeg"

    .line 744
    .line 745
    invoke-static {v5, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    if-eqz v5, :cond_13

    .line 750
    .line 751
    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 752
    .line 753
    :cond_13
    if-lt v2, v3, :cond_14

    .line 754
    .line 755
    invoke-static {v7}, Lz10;->b(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    invoke-static {}, Lr4;->b()Landroid/graphics/Bitmap$Config;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    if-ne v2, v3, :cond_14

    .line 764
    .line 765
    invoke-static {}, Lr4;->y()Landroid/graphics/Bitmap$Config;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    if-eq v6, v2, :cond_14

    .line 770
    .line 771
    invoke-static {}, Lr4;->b()Landroid/graphics/Bitmap$Config;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    :cond_14
    iput-object v6, v7, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 776
    .line 777
    invoke-virtual {v10}, Lu83;->a()Lie1;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    instance-of v3, v2, Lu56;

    .line 782
    .line 783
    if-eqz v3, :cond_16

    .line 784
    .line 785
    sget-object v3, Luu6;->c:Luu6;

    .line 786
    .line 787
    invoke-static {v14, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    if-eqz v3, :cond_16

    .line 792
    .line 793
    iput v4, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 794
    .line 795
    iput-boolean v4, v7, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 796
    .line 797
    check-cast v2, Lu56;

    .line 798
    .line 799
    iget v2, v2, Lu56;->i0:I

    .line 800
    .line 801
    iput v2, v7, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 802
    .line 803
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 804
    .line 805
    .line 806
    move-result-object v2

    .line 807
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 812
    .line 813
    iput v2, v7, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 814
    .line 815
    move v10, v1

    .line 816
    move-object v13, v7

    .line 817
    :cond_15
    :goto_e
    const/4 v1, 0x0

    .line 818
    goto/16 :goto_19

    .line 819
    .line 820
    :cond_16
    iget v2, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 821
    .line 822
    if-lez v2, :cond_26

    .line 823
    .line 824
    iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 825
    .line 826
    if-gtz v3, :cond_17

    .line 827
    .line 828
    move v10, v1

    .line 829
    move v6, v4

    .line 830
    move-object v13, v7

    .line 831
    goto/16 :goto_18

    .line 832
    .line 833
    :cond_17
    const/16 v5, 0x10e

    .line 834
    .line 835
    if-eq v0, v15, :cond_19

    .line 836
    .line 837
    if-ne v0, v5, :cond_18

    .line 838
    .line 839
    goto :goto_f

    .line 840
    :cond_18
    move v6, v2

    .line 841
    goto :goto_10

    .line 842
    :cond_19
    :goto_f
    move v6, v3

    .line 843
    :goto_10
    if-eq v0, v15, :cond_1b

    .line 844
    .line 845
    if-ne v0, v5, :cond_1a

    .line 846
    .line 847
    goto :goto_11

    .line 848
    :cond_1a
    move v2, v3

    .line 849
    :cond_1b
    :goto_11
    iget-object v3, v8, Lv75;->e:Lwf6;

    .line 850
    .line 851
    sget-object v5, Luu6;->c:Luu6;

    .line 852
    .line 853
    invoke-static {v14, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v10

    .line 857
    if-eqz v10, :cond_1c

    .line 858
    .line 859
    move v10, v6

    .line 860
    goto :goto_12

    .line 861
    :cond_1c
    iget-object v10, v14, Luu6;->a:Lmp7;

    .line 862
    .line 863
    invoke-static {v10, v3}, Li;->d(Lmp7;Lwf6;)I

    .line 864
    .line 865
    .line 866
    move-result v10

    .line 867
    :goto_12
    invoke-static {v14, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v5

    .line 871
    if-eqz v5, :cond_1d

    .line 872
    .line 873
    move v5, v2

    .line 874
    goto :goto_13

    .line 875
    :cond_1d
    iget-object v5, v14, Luu6;->b:Lmp7;

    .line 876
    .line 877
    invoke-static {v5, v3}, Li;->d(Lmp7;Lwf6;)I

    .line 878
    .line 879
    .line 880
    move-result v5

    .line 881
    :goto_13
    div-int v13, v6, v10

    .line 882
    .line 883
    invoke-static {v13}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 884
    .line 885
    .line 886
    move-result v13

    .line 887
    div-int v14, v2, v5

    .line 888
    .line 889
    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 890
    .line 891
    .line 892
    move-result v14

    .line 893
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 894
    .line 895
    .line 896
    move-result v15

    .line 897
    if-eqz v15, :cond_1f

    .line 898
    .line 899
    if-ne v15, v4, :cond_1e

    .line 900
    .line 901
    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    .line 902
    .line 903
    .line 904
    move-result v13

    .line 905
    goto :goto_15

    .line 906
    :cond_1e
    invoke-static {}, Lh;->c()V

    .line 907
    .line 908
    .line 909
    :goto_14
    const/4 v6, 0x0

    .line 910
    goto/16 :goto_1e

    .line 911
    .line 912
    :cond_1f
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 913
    .line 914
    .line 915
    move-result v13

    .line 916
    :goto_15
    if-ge v13, v4, :cond_20

    .line 917
    .line 918
    move v13, v4

    .line 919
    :cond_20
    iput v13, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 920
    .line 921
    int-to-double v14, v6

    .line 922
    move/from16 v17, v5

    .line 923
    .line 924
    int-to-double v4, v13

    .line 925
    div-double/2addr v14, v4

    .line 926
    move-object v13, v7

    .line 927
    int-to-double v6, v2

    .line 928
    div-double/2addr v6, v4

    .line 929
    int-to-double v4, v10

    .line 930
    move v10, v1

    .line 931
    move/from16 v2, v17

    .line 932
    .line 933
    int-to-double v1, v2

    .line 934
    div-double/2addr v4, v14

    .line 935
    div-double/2addr v1, v6

    .line 936
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    if-eqz v3, :cond_22

    .line 941
    .line 942
    const/4 v6, 0x1

    .line 943
    if-ne v3, v6, :cond_21

    .line 944
    .line 945
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->min(DD)D

    .line 946
    .line 947
    .line 948
    move-result-wide v1

    .line 949
    goto :goto_16

    .line 950
    :cond_21
    invoke-static {}, Lh;->c()V

    .line 951
    .line 952
    .line 953
    goto :goto_14

    .line 954
    :cond_22
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(DD)D

    .line 955
    .line 956
    .line 957
    move-result-wide v1

    .line 958
    :goto_16
    iget-boolean v3, v8, Lv75;->f:Z

    .line 959
    .line 960
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 961
    .line 962
    if-eqz v3, :cond_23

    .line 963
    .line 964
    cmpl-double v3, v1, v4

    .line 965
    .line 966
    if-lez v3, :cond_23

    .line 967
    .line 968
    move-wide v1, v4

    .line 969
    :cond_23
    cmpg-double v3, v1, v4

    .line 970
    .line 971
    if-nez v3, :cond_24

    .line 972
    .line 973
    const/4 v3, 0x1

    .line 974
    goto :goto_17

    .line 975
    :cond_24
    const/4 v3, 0x0

    .line 976
    :goto_17
    xor-int/lit8 v7, v3, 0x1

    .line 977
    .line 978
    iput-boolean v7, v13, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 979
    .line 980
    if-nez v3, :cond_15

    .line 981
    .line 982
    cmpl-double v3, v1, v4

    .line 983
    .line 984
    const v4, 0x7fffffff

    .line 985
    .line 986
    .line 987
    const-wide v7, 0x41dfffffffc00000L    # 2.147483647E9

    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    if-lez v3, :cond_25

    .line 993
    .line 994
    div-double/2addr v7, v1

    .line 995
    invoke-static {v7, v8}, Ldh4;->B(D)I

    .line 996
    .line 997
    .line 998
    move-result v1

    .line 999
    iput v1, v13, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1000
    .line 1001
    iput v4, v13, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1002
    .line 1003
    goto/16 :goto_e

    .line 1004
    .line 1005
    :cond_25
    iput v4, v13, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1006
    .line 1007
    mul-double/2addr v7, v1

    .line 1008
    invoke-static {v7, v8}, Ldh4;->B(D)I

    .line 1009
    .line 1010
    .line 1011
    move-result v1

    .line 1012
    iput v1, v13, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1013
    .line 1014
    goto/16 :goto_e

    .line 1015
    .line 1016
    :cond_26
    move v10, v1

    .line 1017
    move-object v13, v7

    .line 1018
    move v6, v4

    .line 1019
    :goto_18
    iput v6, v13, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1020
    .line 1021
    const/4 v1, 0x0

    .line 1022
    iput-boolean v1, v13, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1023
    .line 1024
    :goto_19
    :try_start_4
    new-instance v2, Laa0;

    .line 1025
    .line 1026
    const/4 v3, 0x3

    .line 1027
    invoke-direct {v2, v3, v11}, Laa0;-><init>(ILjava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    const/4 v3, 0x0

    .line 1031
    invoke-static {v2, v3, v13}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1035
    invoke-virtual {v11}, Lzw5;->close()V

    .line 1036
    .line 1037
    .line 1038
    iget-object v4, v9, Ln90;->x:Ljava/lang/Exception;

    .line 1039
    .line 1040
    if-nez v4, :cond_33

    .line 1041
    .line 1042
    if-eqz v2, :cond_32

    .line 1043
    .line 1044
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1053
    .line 1054
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 1055
    .line 1056
    .line 1057
    if-nez v10, :cond_27

    .line 1058
    .line 1059
    if-lez v0, :cond_2f

    .line 1060
    .line 1061
    :cond_27
    new-instance v3, Landroid/graphics/Matrix;

    .line 1062
    .line 1063
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1067
    .line 1068
    .line 1069
    move-result v4

    .line 1070
    int-to-float v4, v4

    .line 1071
    const/high16 v5, 0x40000000    # 2.0f

    .line 1072
    .line 1073
    div-float/2addr v4, v5

    .line 1074
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1075
    .line 1076
    .line 1077
    move-result v7

    .line 1078
    int-to-float v7, v7

    .line 1079
    div-float/2addr v7, v5

    .line 1080
    if-eqz v10, :cond_28

    .line 1081
    .line 1082
    const/high16 v5, -0x40800000    # -1.0f

    .line 1083
    .line 1084
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1085
    .line 1086
    invoke-virtual {v3, v5, v8, v4, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1087
    .line 1088
    .line 1089
    :cond_28
    if-lez v0, :cond_29

    .line 1090
    .line 1091
    int-to-float v5, v0

    .line 1092
    invoke-virtual {v3, v5, v4, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 1093
    .line 1094
    .line 1095
    :cond_29
    new-instance v4, Landroid/graphics/RectF;

    .line 1096
    .line 1097
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1098
    .line 1099
    .line 1100
    move-result v5

    .line 1101
    int-to-float v5, v5

    .line 1102
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1103
    .line 1104
    .line 1105
    move-result v7

    .line 1106
    int-to-float v7, v7

    .line 1107
    const/4 v8, 0x0

    .line 1108
    invoke-direct {v4, v8, v8, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1112
    .line 1113
    .line 1114
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 1115
    .line 1116
    cmpg-float v7, v5, v8

    .line 1117
    .line 1118
    if-nez v7, :cond_2a

    .line 1119
    .line 1120
    iget v7, v4, Landroid/graphics/RectF;->top:F

    .line 1121
    .line 1122
    cmpg-float v7, v7, v8

    .line 1123
    .line 1124
    if-nez v7, :cond_2a

    .line 1125
    .line 1126
    :goto_1a
    const/16 v4, 0x5a

    .line 1127
    .line 1128
    goto :goto_1b

    .line 1129
    :cond_2a
    neg-float v5, v5

    .line 1130
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 1131
    .line 1132
    neg-float v4, v4

    .line 1133
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1134
    .line 1135
    .line 1136
    goto :goto_1a

    .line 1137
    :goto_1b
    if-eq v0, v4, :cond_2d

    .line 1138
    .line 1139
    const/16 v5, 0x10e

    .line 1140
    .line 1141
    if-ne v0, v5, :cond_2b

    .line 1142
    .line 1143
    goto :goto_1c

    .line 1144
    :cond_2b
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1149
    .line 1150
    .line 1151
    move-result v4

    .line 1152
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v5

    .line 1156
    if-nez v5, :cond_2c

    .line 1157
    .line 1158
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1159
    .line 1160
    :cond_2c
    invoke-static {v0, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    goto :goto_1d

    .line 1165
    :cond_2d
    :goto_1c
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1166
    .line 1167
    .line 1168
    move-result v0

    .line 1169
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1170
    .line 1171
    .line 1172
    move-result v4

    .line 1173
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v5

    .line 1177
    if-nez v5, :cond_2e

    .line 1178
    .line 1179
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1180
    .line 1181
    :cond_2e
    invoke-static {v0, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    :goto_1d
    new-instance v4, Landroid/graphics/Canvas;

    .line 1186
    .line 1187
    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1188
    .line 1189
    .line 1190
    sget-object v5, Lu82;->a:Landroid/graphics/Paint;

    .line 1191
    .line 1192
    invoke-virtual {v4, v2, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 1196
    .line 1197
    .line 1198
    move-object v2, v0

    .line 1199
    :cond_2f
    new-instance v0, Lgk1;

    .line 1200
    .line 1201
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 1206
    .line 1207
    invoke-direct {v4, v3, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 1208
    .line 1209
    .line 1210
    iget v2, v13, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1211
    .line 1212
    const/4 v6, 0x1

    .line 1213
    if-gt v2, v6, :cond_30

    .line 1214
    .line 1215
    iget-boolean v2, v13, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1216
    .line 1217
    if-eqz v2, :cond_31

    .line 1218
    .line 1219
    :cond_30
    move v1, v6

    .line 1220
    :cond_31
    invoke-direct {v0, v4, v1}, Lgk1;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    .line 1221
    .line 1222
    .line 1223
    move-object v6, v0

    .line 1224
    goto :goto_1e

    .line 1225
    :cond_32
    const-string v0, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 1226
    .line 1227
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 1228
    .line 1229
    .line 1230
    move-object v6, v3

    .line 1231
    :goto_1e
    return-object v6

    .line 1232
    :cond_33
    throw v4

    .line 1233
    :catchall_1
    move-exception v0

    .line 1234
    move-object v1, v0

    .line 1235
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1236
    :catchall_2
    move-exception v0

    .line 1237
    invoke-static {v11, v1}, Led1;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1238
    .line 1239
    .line 1240
    throw v0

    .line 1241
    :cond_34
    throw v2

    .line 1242
    :cond_35
    throw v12

    .line 1243
    :pswitch_1b
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v0, Lvl;

    .line 1246
    .line 1247
    return-object v0

    .line 1248
    :pswitch_1c
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 1249
    .line 1250
    check-cast v0, Lqt;

    .line 1251
    .line 1252
    iget-object v0, v0, Lqt;->N:Led5;

    .line 1253
    .line 1254
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0

    .line 1258
    check-cast v0, Ls83;

    .line 1259
    .line 1260
    return-object v0

    .line 1261
    :pswitch_1d
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 1262
    .line 1263
    check-cast v0, [Ljava/lang/Object;

    .line 1264
    .line 1265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1266
    .line 1267
    .line 1268
    new-instance v1, Le2;

    .line 1269
    .line 1270
    invoke-direct {v1, v0}, Le2;-><init>([Ljava/lang/Object;)V

    .line 1271
    .line 1272
    .line 1273
    return-object v1

    .line 1274
    :pswitch_1e
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 1275
    .line 1276
    check-cast v0, Lzc7;

    .line 1277
    .line 1278
    invoke-interface {v0}, Lzc7;->Q()Lyc7;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v0

    .line 1282
    return-object v0

    .line 1283
    :pswitch_1f
    iget-object v0, v0, Lzh;->x:Ljava/lang/Object;

    .line 1284
    .line 1285
    check-cast v0, Lai;

    .line 1286
    .line 1287
    invoke-static {v0}, Lrc9;->e0(Lgz1;)V

    .line 1288
    .line 1289
    .line 1290
    sget-object v0, Lvs7;->a:Lvs7;

    .line 1291
    .line 1292
    return-object v0

    .line 1293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_1a
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_18
        :pswitch_19
    .end packed-switch
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
