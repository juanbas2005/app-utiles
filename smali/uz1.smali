.class public final synthetic Luz1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Luz1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 8
    iput p2, p0, Luz1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld63;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput p1, p0, Luz1;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget p0, p0, Luz1;->w:I

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lvs7;->a:Lvs7;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lne6;

    .line 13
    .line 14
    check-cast p2, Laq4;

    .line 15
    .line 16
    instance-of p0, p2, Lsx6;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    check-cast p2, Lsx6;

    .line 21
    .line 22
    invoke-interface {p2}, La37;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v0, Lhf7;->d:Lkg5;

    .line 27
    .line 28
    iget-object v0, v0, Lkg5;->x:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lgs2;

    .line 31
    .line 32
    invoke-interface {v0, p1, p0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-interface {p2}, Lsx6;->a()Lux6;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v1, Led5;

    .line 46
    .line 47
    invoke-direct {v1, p0, p1}, Led5;-><init>(Ljava/lang/Object;Lux6;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string p0, "If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()"

    .line 52
    .line 53
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    return-object v1

    .line 57
    :pswitch_0
    check-cast p1, Lyt2;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v3}, Lb85;->v(I)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-static {p0, p1}, Lxz5;->n(ILyt2;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :pswitch_1
    check-cast p1, Lyt2;

    .line 73
    .line 74
    check-cast p2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v3}, Lb85;->v(I)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {p0, p1}, Lxz5;->e(ILyt2;)V

    .line 84
    .line 85
    .line 86
    return-object v2

    .line 87
    :pswitch_2
    check-cast p1, Lyt2;

    .line 88
    .line 89
    check-cast p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Lb85;->v(I)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-static {p0, p1}, Lxz5;->q(ILyt2;)V

    .line 99
    .line 100
    .line 101
    return-object v2

    .line 102
    :pswitch_3
    check-cast p1, Lyt2;

    .line 103
    .line 104
    check-cast p2, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, Lb85;->v(I)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p0, p1}, Lxz5;->b(ILyt2;)V

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :pswitch_4
    check-cast p1, Lgh4;

    .line 118
    .line 119
    check-cast p2, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-interface {p1, p0}, Lgh4;->c(I)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :pswitch_5
    check-cast p1, Lgh4;

    .line 135
    .line 136
    check-cast p2, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    invoke-interface {p1, p0}, Lgh4;->W(I)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_6
    check-cast p1, Lgh4;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    invoke-interface {p1, p0}, Lgh4;->v(I)I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :pswitch_7
    check-cast p1, Lgh4;

    .line 169
    .line 170
    check-cast p2, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    invoke-interface {p1, p0}, Lgh4;->l(I)I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :pswitch_8
    check-cast p1, Lne6;

    .line 186
    .line 187
    check-cast p2, Lix4;

    .line 188
    .line 189
    iget-object p0, p2, Lix4;->a:Luj;

    .line 190
    .line 191
    iget-object p0, p0, Luj;->e:Led5;

    .line 192
    .line 193
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    check-cast p0, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    cmpg-float p0, p0, v0

    .line 204
    .line 205
    if-nez p0, :cond_2

    .line 206
    .line 207
    sget-object p0, Ljx4;->w:Ljx4;

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_2
    sget-object p0, Ljx4;->x:Ljx4;

    .line 211
    .line 212
    :goto_1
    return-object p0

    .line 213
    :pswitch_9
    check-cast p1, Lne6;

    .line 214
    .line 215
    check-cast p2, Liu4;

    .line 216
    .line 217
    iget-object p0, p2, Liu4;->b:Lht4;

    .line 218
    .line 219
    iget-object p1, p0, Lht4;->m:Ljava/util/LinkedHashMap;

    .line 220
    .line 221
    iget-object v0, p0, Lht4;->f:Las;

    .line 222
    .line 223
    iget-object v2, p0, Lht4;->l:Ljava/util/LinkedHashMap;

    .line 224
    .line 225
    new-instance v3, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 228
    .line 229
    .line 230
    const/4 v4, 0x0

    .line 231
    new-array v5, v4, [Lyb5;

    .line 232
    .line 233
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    check-cast v5, [Lyb5;

    .line 238
    .line 239
    invoke-static {v5}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    iget-object p0, p0, Lht4;->s:Lox4;

    .line 244
    .line 245
    iget-object p0, p0, Lox4;->a:Ljava/util/LinkedHashMap;

    .line 246
    .line 247
    invoke-static {p0}, Lsf4;->b0(Ljava/util/Map;)Ljava/util/Map;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-eqz v6, :cond_3

    .line 264
    .line 265
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    check-cast v6, Ljava/util/Map$Entry;

    .line 270
    .line 271
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    check-cast v7, Ljava/lang/String;

    .line 276
    .line 277
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    check-cast v6, Lnx4;

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    if-nez p0, :cond_4

    .line 292
    .line 293
    new-array p0, v4, [Lyb5;

    .line 294
    .line 295
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    check-cast p0, [Lyb5;

    .line 300
    .line 301
    invoke-static {p0}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    const-string p0, "android-support-nav:controller:navigatorState:names"

    .line 306
    .line 307
    invoke-static {v5, p0, v3}, Lw95;->i(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    const-string p0, "android-support-nav:controller:navigatorState"

    .line 311
    .line 312
    invoke-virtual {v1, p0, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 313
    .line 314
    .line 315
    :cond_4
    invoke-virtual {v0}, Las;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    const-string v3, "nav-entry-state:saved-state"

    .line 320
    .line 321
    const-string v5, "nav-entry-state:args"

    .line 322
    .line 323
    const-string v6, "nav-entry-state:destination-id"

    .line 324
    .line 325
    const-string v7, "nav-entry-state:id"

    .line 326
    .line 327
    if-nez p0, :cond_8

    .line 328
    .line 329
    if-nez v1, :cond_5

    .line 330
    .line 331
    new-array p0, v4, [Lyb5;

    .line 332
    .line 333
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, [Lyb5;

    .line 338
    .line 339
    invoke-static {p0}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    move-object v1, p0

    .line 344
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v8

    .line 357
    if-eqz v8, :cond_7

    .line 358
    .line 359
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    check-cast v8, Lzs4;

    .line 364
    .line 365
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    iget-object v9, v8, Lzs4;->x:Lqt4;

    .line 369
    .line 370
    iget-object v9, v9, Lqt4;->x:Lao;

    .line 371
    .line 372
    iget v9, v9, Lao;->a:I

    .line 373
    .line 374
    iget-object v10, v8, Lzs4;->B:Ljava/lang/String;

    .line 375
    .line 376
    iget-object v8, v8, Lzs4;->D:Lbt4;

    .line 377
    .line 378
    invoke-virtual {v8}, Lbt4;->a()Landroid/os/Bundle;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    new-array v12, v4, [Lyb5;

    .line 383
    .line 384
    invoke-static {v12, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v12

    .line 388
    check-cast v12, [Lyb5;

    .line 389
    .line 390
    invoke-static {v12}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 391
    .line 392
    .line 393
    move-result-object v12

    .line 394
    iget-object v8, v8, Lbt4;->h:Lkg5;

    .line 395
    .line 396
    invoke-virtual {v8, v12}, Lkg5;->H(Landroid/os/Bundle;)V

    .line 397
    .line 398
    .line 399
    new-array v8, v4, [Lyb5;

    .line 400
    .line 401
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    check-cast v8, [Lyb5;

    .line 406
    .line 407
    invoke-static {v8}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v8, v7, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8, v6, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 418
    .line 419
    .line 420
    if-nez v11, :cond_6

    .line 421
    .line 422
    new-array v9, v4, [Lyb5;

    .line 423
    .line 424
    invoke-static {v9, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    check-cast v9, [Lyb5;

    .line 429
    .line 430
    invoke-static {v9}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    :cond_6
    invoke-virtual {v8, v5, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v8, v3, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_7
    const-string v0, "android-support-nav:controller:backStack"

    .line 445
    .line 446
    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 447
    .line 448
    .line 449
    :cond_8
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 450
    .line 451
    .line 452
    move-result p0

    .line 453
    if-nez p0, :cond_c

    .line 454
    .line 455
    if-nez v1, :cond_9

    .line 456
    .line 457
    new-array p0, v4, [Lyb5;

    .line 458
    .line 459
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    check-cast p0, [Lyb5;

    .line 464
    .line 465
    invoke-static {p0}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    move-object v1, p0

    .line 470
    :cond_9
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 471
    .line 472
    .line 473
    move-result p0

    .line 474
    new-array p0, p0, [I

    .line 475
    .line 476
    new-instance v0, Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    move v8, v4

    .line 490
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    if-eqz v9, :cond_b

    .line 495
    .line 496
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    check-cast v9, Ljava/util/Map$Entry;

    .line 501
    .line 502
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v10

    .line 506
    check-cast v10, Ljava/lang/Number;

    .line 507
    .line 508
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 509
    .line 510
    .line 511
    move-result v10

    .line 512
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    check-cast v9, Ljava/lang/String;

    .line 517
    .line 518
    add-int/lit8 v11, v8, 0x1

    .line 519
    .line 520
    aput v10, p0, v8

    .line 521
    .line 522
    if-nez v9, :cond_a

    .line 523
    .line 524
    const-string v9, ""

    .line 525
    .line 526
    :cond_a
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move v8, v11

    .line 530
    goto :goto_4

    .line 531
    :cond_b
    const-string v2, "android-support-nav:controller:backStackDestIds"

    .line 532
    .line 533
    invoke-virtual {v1, v2, p0}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 534
    .line 535
    .line 536
    const-string p0, "android-support-nav:controller:backStackIds"

    .line 537
    .line 538
    invoke-static {v1, p0, v0}, Lw95;->i(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 539
    .line 540
    .line 541
    :cond_c
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 542
    .line 543
    .line 544
    move-result p0

    .line 545
    if-nez p0, :cond_11

    .line 546
    .line 547
    if-nez v1, :cond_d

    .line 548
    .line 549
    new-array p0, v4, [Lyb5;

    .line 550
    .line 551
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object p0

    .line 555
    check-cast p0, [Lyb5;

    .line 556
    .line 557
    invoke-static {p0}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    move-object v1, p0

    .line 562
    :cond_d
    new-instance p0, Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 565
    .line 566
    .line 567
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    if-eqz v0, :cond_10

    .line 580
    .line 581
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    check-cast v0, Ljava/util/Map$Entry;

    .line 586
    .line 587
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    check-cast v2, Ljava/lang/String;

    .line 592
    .line 593
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    check-cast v0, Las;

    .line 598
    .line 599
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    new-instance v8, Ljava/util/ArrayList;

    .line 603
    .line 604
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v9

    .line 615
    if-eqz v9, :cond_f

    .line 616
    .line 617
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v9

    .line 621
    check-cast v9, Lct4;

    .line 622
    .line 623
    iget-object v9, v9, Lct4;->a:Lkb9;

    .line 624
    .line 625
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    new-array v10, v4, [Lyb5;

    .line 629
    .line 630
    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v10

    .line 634
    check-cast v10, [Lyb5;

    .line 635
    .line 636
    invoke-static {v10}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 637
    .line 638
    .line 639
    move-result-object v10

    .line 640
    iget-object v11, v9, Lkb9;->y:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v11, Ljava/lang/String;

    .line 643
    .line 644
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v10, v7, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    iget v11, v9, Lkb9;->x:I

    .line 651
    .line 652
    invoke-virtual {v10, v6, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 653
    .line 654
    .line 655
    iget-object v11, v9, Lkb9;->z:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v11, Landroid/os/Bundle;

    .line 658
    .line 659
    if-nez v11, :cond_e

    .line 660
    .line 661
    new-array v11, v4, [Lyb5;

    .line 662
    .line 663
    invoke-static {v11, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v11

    .line 667
    check-cast v11, [Lyb5;

    .line 668
    .line 669
    invoke-static {v11}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 670
    .line 671
    .line 672
    move-result-object v11

    .line 673
    :cond_e
    invoke-virtual {v10, v5, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 674
    .line 675
    .line 676
    iget-object v9, v9, Lkb9;->A:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v9, Landroid/os/Bundle;

    .line 679
    .line 680
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v10, v3, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    goto :goto_6

    .line 690
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 691
    .line 692
    const-string v9, "android-support-nav:controller:backStackStates:"

    .line 693
    .line 694
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-virtual {v1, v0, v8}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_5

    .line 708
    .line 709
    :cond_10
    const-string p1, "android-support-nav:controller:backStackStates"

    .line 710
    .line 711
    invoke-static {v1, p1, p0}, Lw95;->i(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 712
    .line 713
    .line 714
    :cond_11
    iget-boolean p0, p2, Liu4;->e:Z

    .line 715
    .line 716
    if-eqz p0, :cond_13

    .line 717
    .line 718
    if-nez v1, :cond_12

    .line 719
    .line 720
    new-array p0, v4, [Lyb5;

    .line 721
    .line 722
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object p0

    .line 726
    check-cast p0, [Lyb5;

    .line 727
    .line 728
    invoke-static {p0}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 729
    .line 730
    .line 731
    move-result-object p0

    .line 732
    move-object v1, p0

    .line 733
    :cond_12
    const-string p0, "android-support-nav:controller:deepLinkHandled"

    .line 734
    .line 735
    iget-boolean p1, p2, Liu4;->e:Z

    .line 736
    .line 737
    invoke-virtual {v1, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 738
    .line 739
    .line 740
    :cond_13
    return-object v1

    .line 741
    :pswitch_a
    check-cast p1, Lgk;

    .line 742
    .line 743
    check-cast p2, Ljava/lang/Integer;

    .line 744
    .line 745
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    new-instance p0, Lk51;

    .line 749
    .line 750
    const/high16 p1, 0x44c80000    # 1600.0f

    .line 751
    .line 752
    const/4 p2, 0x4

    .line 753
    invoke-static {v0, p1, v1, p2}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 754
    .line 755
    .line 756
    move-result-object p1

    .line 757
    const/4 p2, 0x2

    .line 758
    invoke-static {p1, p2}, Li52;->e(Lje2;I)Ln52;

    .line 759
    .line 760
    .line 761
    move-result-object p1

    .line 762
    const/high16 p2, 0x43c80000    # 400.0f

    .line 763
    .line 764
    const/4 v0, 0x5

    .line 765
    const/4 v2, 0x0

    .line 766
    invoke-static {v2, p2, v1, v0}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 767
    .line 768
    .line 769
    move-result-object p2

    .line 770
    sget-wide v0, Lql7;->b:J

    .line 771
    .line 772
    new-instance v2, Lx82;

    .line 773
    .line 774
    new-instance v3, Lnm7;

    .line 775
    .line 776
    new-instance v7, Lxf6;

    .line 777
    .line 778
    const v4, 0x3f333333    # 0.7f

    .line 779
    .line 780
    .line 781
    invoke-direct {v7, v4, v0, v1, p2}, Lxf6;-><init>(FJLje2;)V

    .line 782
    .line 783
    .line 784
    const/4 v8, 0x0

    .line 785
    const/16 v9, 0x77

    .line 786
    .line 787
    const/4 v4, 0x0

    .line 788
    const/4 v5, 0x0

    .line 789
    const/4 v6, 0x0

    .line 790
    invoke-direct/range {v3 .. v9}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 791
    .line 792
    .line 793
    invoke-direct {v2, v3}, Lx82;-><init>(Lnm7;)V

    .line 794
    .line 795
    .line 796
    invoke-direct {p0, p1, v2}, Lk51;-><init>(Ln52;Lx82;)V

    .line 797
    .line 798
    .line 799
    return-object p0

    .line 800
    :pswitch_b
    check-cast p1, Lne6;

    .line 801
    .line 802
    check-cast p2, Lx34;

    .line 803
    .line 804
    invoke-virtual {p2}, Lx34;->d()Ljava/util/Map;

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 809
    .line 810
    .line 811
    move-result p1

    .line 812
    if-eqz p1, :cond_14

    .line 813
    .line 814
    goto :goto_7

    .line 815
    :cond_14
    move-object v1, p0

    .line 816
    :goto_7
    return-object v1

    .line 817
    :pswitch_c
    check-cast p1, Lne6;

    .line 818
    .line 819
    check-cast p2, Ls34;

    .line 820
    .line 821
    invoke-virtual {p2}, Ls34;->h()I

    .line 822
    .line 823
    .line 824
    move-result p0

    .line 825
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 826
    .line 827
    .line 828
    move-result-object p0

    .line 829
    invoke-virtual {p2}, Ls34;->i()I

    .line 830
    .line 831
    .line 832
    move-result p1

    .line 833
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 834
    .line 835
    .line 836
    move-result-object p1

    .line 837
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 838
    .line 839
    .line 840
    move-result-object p0

    .line 841
    invoke-static {p0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 842
    .line 843
    .line 844
    move-result-object p0

    .line 845
    return-object p0

    .line 846
    :pswitch_d
    check-cast p1, Lne6;

    .line 847
    .line 848
    check-cast p2, Ln04;

    .line 849
    .line 850
    iget-object p0, p2, Ln04;->d:Lg04;

    .line 851
    .line 852
    iget-object p0, p0, Lg04;->b:Lbd5;

    .line 853
    .line 854
    invoke-virtual {p0}, Lbd5;->d()I

    .line 855
    .line 856
    .line 857
    move-result p0

    .line 858
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 859
    .line 860
    .line 861
    move-result-object p0

    .line 862
    iget-object p1, p2, Ln04;->d:Lg04;

    .line 863
    .line 864
    iget-object p1, p1, Lg04;->c:Lbd5;

    .line 865
    .line 866
    invoke-virtual {p1}, Lbd5;->d()I

    .line 867
    .line 868
    .line 869
    move-result p1

    .line 870
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 871
    .line 872
    .line 873
    move-result-object p1

    .line 874
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 875
    .line 876
    .line 877
    move-result-object p0

    .line 878
    invoke-static {p0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 879
    .line 880
    .line 881
    move-result-object p0

    .line 882
    return-object p0

    .line 883
    :pswitch_e
    check-cast p1, Li04;

    .line 884
    .line 885
    check-cast p2, Ljava/lang/Integer;

    .line 886
    .line 887
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 888
    .line 889
    .line 890
    invoke-static {v3}, Lrj1;->g(I)J

    .line 891
    .line 892
    .line 893
    move-result-wide p0

    .line 894
    new-instance p2, Lpx2;

    .line 895
    .line 896
    invoke-direct {p2, p0, p1}, Lpx2;-><init>(J)V

    .line 897
    .line 898
    .line 899
    return-object p2

    .line 900
    :pswitch_f
    check-cast p1, Lyt2;

    .line 901
    .line 902
    check-cast p2, Ljava/lang/Integer;

    .line 903
    .line 904
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    invoke-static {v3}, Lb85;->v(I)I

    .line 908
    .line 909
    .line 910
    move-result p0

    .line 911
    invoke-static {p0, p1}, Lpk3;->a(ILyt2;)V

    .line 912
    .line 913
    .line 914
    return-object v2

    .line 915
    :pswitch_10
    check-cast p1, Lyt2;

    .line 916
    .line 917
    check-cast p2, Ljava/lang/Integer;

    .line 918
    .line 919
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-static {v3}, Lb85;->v(I)I

    .line 923
    .line 924
    .line 925
    move-result p0

    .line 926
    invoke-static {p0, p1}, Lgr8;->g(ILyt2;)V

    .line 927
    .line 928
    .line 929
    return-object v2

    .line 930
    :pswitch_11
    check-cast p1, Lyt2;

    .line 931
    .line 932
    check-cast p2, Ljava/lang/Integer;

    .line 933
    .line 934
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    invoke-static {v3}, Lb85;->v(I)I

    .line 938
    .line 939
    .line 940
    move-result p0

    .line 941
    invoke-static {p0, p1}, Lgr8;->o(ILyt2;)V

    .line 942
    .line 943
    .line 944
    return-object v2

    .line 945
    :pswitch_12
    check-cast p1, Lyt2;

    .line 946
    .line 947
    check-cast p2, Ljava/lang/Integer;

    .line 948
    .line 949
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-static {v3}, Lb85;->v(I)I

    .line 953
    .line 954
    .line 955
    move-result p0

    .line 956
    invoke-static {p0, p1}, Lgr8;->p(ILyt2;)V

    .line 957
    .line 958
    .line 959
    return-object v2

    .line 960
    :pswitch_13
    check-cast p1, Lyt2;

    .line 961
    .line 962
    check-cast p2, Ljava/lang/Integer;

    .line 963
    .line 964
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    invoke-static {v3}, Lb85;->v(I)I

    .line 968
    .line 969
    .line 970
    move-result p0

    .line 971
    invoke-static {p0, p1}, Lgr8;->m(ILyt2;)V

    .line 972
    .line 973
    .line 974
    return-object v2

    .line 975
    :pswitch_14
    check-cast p1, Lyt2;

    .line 976
    .line 977
    check-cast p2, Ljava/lang/Integer;

    .line 978
    .line 979
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    invoke-static {v3}, Lb85;->v(I)I

    .line 983
    .line 984
    .line 985
    move-result p0

    .line 986
    invoke-static {p0, p1}, Lgr8;->f(ILyt2;)V

    .line 987
    .line 988
    .line 989
    return-object v2

    .line 990
    :pswitch_15
    check-cast p1, Lyt2;

    .line 991
    .line 992
    check-cast p2, Ljava/lang/Integer;

    .line 993
    .line 994
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 995
    .line 996
    .line 997
    invoke-static {v3}, Lb85;->v(I)I

    .line 998
    .line 999
    .line 1000
    move-result p0

    .line 1001
    invoke-static {p0, p1}, Lgr8;->b(ILyt2;)V

    .line 1002
    .line 1003
    .line 1004
    return-object v2

    .line 1005
    :pswitch_16
    check-cast p1, Lyt2;

    .line 1006
    .line 1007
    check-cast p2, Ljava/lang/Integer;

    .line 1008
    .line 1009
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    invoke-static {v3}, Lb85;->v(I)I

    .line 1013
    .line 1014
    .line 1015
    move-result p0

    .line 1016
    invoke-static {p0, p1}, Lgr8;->n(ILyt2;)V

    .line 1017
    .line 1018
    .line 1019
    return-object v2

    .line 1020
    :pswitch_17
    check-cast p1, Lyt2;

    .line 1021
    .line 1022
    check-cast p2, Ljava/lang/Integer;

    .line 1023
    .line 1024
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    invoke-static {v3}, Lb85;->v(I)I

    .line 1028
    .line 1029
    .line 1030
    move-result p0

    .line 1031
    invoke-static {p0, p1}, Lgr8;->h(ILyt2;)V

    .line 1032
    .line 1033
    .line 1034
    return-object v2

    .line 1035
    :pswitch_18
    check-cast p1, Ll63;

    .line 1036
    .line 1037
    check-cast p2, Ly53;

    .line 1038
    .line 1039
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    return-object v2

    .line 1046
    :pswitch_19
    check-cast p1, Lk63;

    .line 1047
    .line 1048
    check-cast p2, Ljava/lang/Integer;

    .line 1049
    .line 1050
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1051
    .line 1052
    .line 1053
    move-result p0

    .line 1054
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1055
    .line 1056
    .line 1057
    sub-int/2addr p0, v3

    .line 1058
    int-to-double p0, p0

    .line 1059
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 1060
    .line 1061
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    .line 1062
    .line 1063
    .line 1064
    move-result-wide p0

    .line 1065
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    mul-double/2addr p0, v0

    .line 1071
    double-to-long p0, p0

    .line 1072
    const-wide/32 v0, 0xea60

    .line 1073
    .line 1074
    .line 1075
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 1076
    .line 1077
    .line 1078
    move-result-wide p0

    .line 1079
    sget-object p2, Lwv5;->a:Lp2;

    .line 1080
    .line 1081
    invoke-virtual {p2}, Lwv5;->d()J

    .line 1082
    .line 1083
    .line 1084
    move-result-wide v0

    .line 1085
    add-long/2addr v0, p0

    .line 1086
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1087
    .line 1088
    .line 1089
    move-result-object p0

    .line 1090
    return-object p0

    .line 1091
    :pswitch_1a
    check-cast p1, Lyt2;

    .line 1092
    .line 1093
    check-cast p2, Ljava/lang/Integer;

    .line 1094
    .line 1095
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    .line 1097
    .line 1098
    invoke-static {v3}, Lb85;->v(I)I

    .line 1099
    .line 1100
    .line 1101
    move-result p0

    .line 1102
    invoke-static {p0, p1}, Lt13;->A(ILyt2;)V

    .line 1103
    .line 1104
    .line 1105
    return-object v2

    .line 1106
    :pswitch_1b
    check-cast p1, Lse3;

    .line 1107
    .line 1108
    check-cast p2, Lse3;

    .line 1109
    .line 1110
    return-object v2

    .line 1111
    :pswitch_1c
    check-cast p1, Lne6;

    .line 1112
    .line 1113
    check-cast p2, Lxz1;

    .line 1114
    .line 1115
    iget-object p0, p2, Lxz1;->b:Lbd;

    .line 1116
    .line 1117
    iget-object p0, p0, Lbd;->h:Led5;

    .line 1118
    .line 1119
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object p0

    .line 1123
    check-cast p0, Lyz1;

    .line 1124
    .line 1125
    return-object p0

    .line 1126
    nop

    .line 1127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
