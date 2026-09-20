.class public final synthetic Lsz6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/WindowManager$LayoutParams;

.field public final synthetic y:Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;

.field public final synthetic z:Landroid/view/WindowManager;


# direct methods
.method public synthetic constructor <init>(Landroid/view/WindowManager$LayoutParams;Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;Landroid/view/WindowManager;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lsz6;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsz6;->x:Landroid/view/WindowManager$LayoutParams;

    .line 8
    .line 9
    iput-object p2, p0, Lsz6;->y:Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;

    .line 10
    .line 11
    iput-object p3, p0, Lsz6;->z:Landroid/view/WindowManager;

    .line 12
    .line 13
    return-void
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

.method public synthetic constructor <init>(Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lsz6;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz6;->y:Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;

    iput-object p2, p0, Lsz6;->x:Landroid/view/WindowManager$LayoutParams;

    iput-object p3, p0, Lsz6;->z:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lsz6;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object v3, v0, Lsz6;->z:Landroid/view/WindowManager;

    .line 8
    .line 9
    iget-object v4, v0, Lsz6;->y:Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;

    .line 10
    .line 11
    iget-object v0, v0, Lsz6;->x:Landroid/view/WindowManager$LayoutParams;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Float;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    move-object/from16 v5, p2

    .line 25
    .line 26
    check-cast v5, Ljava/lang/Float;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    sget-object v6, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->K:Ld37;

    .line 33
    .line 34
    iget v6, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 35
    .line 36
    invoke-static {v1}, Ldh4;->C(F)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v6

    .line 41
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 42
    .line 43
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 44
    .line 45
    invoke-static {v5}, Ldh4;->C(F)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/2addr v5, v1

    .line 50
    iput v5, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 51
    .line 52
    iget-object v1, v4, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->B:Lvx0;

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-interface {v3, v1, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-object v2

    .line 60
    :pswitch_0
    move-object/from16 v13, p1

    .line 61
    .line 62
    check-cast v13, Lyt2;

    .line 63
    .line 64
    move-object/from16 v1, p2

    .line 65
    .line 66
    check-cast v1, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    sget-object v5, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->K:Ld37;

    .line 73
    .line 74
    and-int/lit8 v5, v1, 0x3

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v7, 0x1

    .line 78
    if-eq v5, v6, :cond_1

    .line 79
    .line 80
    move v5, v7

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/4 v5, 0x0

    .line 83
    :goto_0
    and-int/2addr v1, v7

    .line 84
    invoke-virtual {v13, v1, v5}, Lyt2;->V(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_8

    .line 89
    .line 90
    iget-object v1, v4, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->G:Ld37;

    .line 91
    .line 92
    invoke-static {v1, v13}, Lu55;->f(Lb37;Lyt2;)Laq4;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v5, v4, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->H:Ld37;

    .line 97
    .line 98
    invoke-static {v5, v13}, Lu55;->f(Lb37;Lyt2;)Laq4;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    iget-object v6, v4, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->I:Ld37;

    .line 103
    .line 104
    invoke-static {v6, v13}, Lu55;->f(Lb37;Lyt2;)Laq4;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-interface {v1}, La37;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    invoke-interface {v5}, La37;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v9

    .line 128
    invoke-interface {v6}, La37;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v5

    .line 138
    invoke-virtual {v13, v4}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    sget-object v12, Lay0;->a:Ld63;

    .line 147
    .line 148
    if-nez v1, :cond_2

    .line 149
    .line 150
    if-ne v11, v12, :cond_3

    .line 151
    .line 152
    :cond_2
    new-instance v11, Lhx4;

    .line 153
    .line 154
    const/16 v1, 0x1a

    .line 155
    .line 156
    invoke-direct {v11, v1, v4}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v13, v11}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_3
    check-cast v11, Lsr2;

    .line 163
    .line 164
    invoke-virtual {v13, v0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-virtual {v13, v4}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    or-int/2addr v1, v14

    .line 173
    invoke-virtual {v13, v3}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    or-int/2addr v1, v14

    .line 178
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    if-nez v1, :cond_4

    .line 183
    .line 184
    if-ne v14, v12, :cond_5

    .line 185
    .line 186
    :cond_4
    new-instance v14, Lsz6;

    .line 187
    .line 188
    invoke-direct {v14, v0, v4, v3}, Lsz6;-><init>(Landroid/view/WindowManager$LayoutParams;Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;Landroid/view/WindowManager;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v13, v14}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_5
    check-cast v14, Lgs2;

    .line 195
    .line 196
    invoke-virtual {v13, v4}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-virtual {v13, v0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    or-int/2addr v1, v3

    .line 205
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    if-nez v1, :cond_6

    .line 210
    .line 211
    if-ne v3, v12, :cond_7

    .line 212
    .line 213
    :cond_6
    new-instance v3, Lqm3;

    .line 214
    .line 215
    const/16 v1, 0x1b

    .line 216
    .line 217
    invoke-direct {v3, v1, v4, v0}, Lqm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v13, v3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_7
    move-object v12, v3

    .line 224
    check-cast v12, Lsr2;

    .line 225
    .line 226
    move-wide v15, v9

    .line 227
    move-object v10, v11

    .line 228
    move-object v11, v14

    .line 229
    move-wide/from16 v17, v7

    .line 230
    .line 231
    move-wide v8, v5

    .line 232
    move-wide/from16 v4, v17

    .line 233
    .line 234
    move-wide v6, v15

    .line 235
    const/4 v14, 0x0

    .line 236
    invoke-static/range {v4 .. v14}, Lw95;->b(JJJLsr2;Lgs2;Lsr2;Lyt2;I)V

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_8
    invoke-virtual {v13}, Lyt2;->Y()V

    .line 241
    .line 242
    .line 243
    :goto_1
    return-object v2

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
