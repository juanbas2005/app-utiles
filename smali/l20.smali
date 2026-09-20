.class public final synthetic Ll20;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvr2;


# direct methods
.method public synthetic constructor <init>(ILvr2;)V
    .locals 0

    .line 1
    iput p1, p0, Ll20;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Ll20;->x:Lvr2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ll20;->w:I

    .line 6
    .line 7
    sget-object v3, Lvs7;->a:Lvs7;

    .line 8
    .line 9
    iget-object v0, v0, Ll20;->x:Lvr2;

    .line 10
    .line 11
    packed-switch v2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v2, p2

    .line 15
    .line 16
    check-cast v2, Lvs7;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v3

    .line 22
    :pswitch_0
    check-cast v1, Li04;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lpx2;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    check-cast v1, Lqk5;

    .line 39
    .line 40
    move-object/from16 v2, p2

    .line 41
    .line 42
    check-cast v2, Ll35;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lqk5;->a()V

    .line 48
    .line 49
    .line 50
    iget-wide v1, v2, Ll35;->a:J

    .line 51
    .line 52
    const-wide v4, 0xffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v1, v4

    .line 58
    long-to-int v1, v1

    .line 59
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v0, v1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :pswitch_2
    check-cast v1, Lyt2;

    .line 72
    .line 73
    move-object/from16 v2, p2

    .line 74
    .line 75
    check-cast v2, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    and-int/lit8 v4, v2, 0x3

    .line 82
    .line 83
    const/4 v5, 0x2

    .line 84
    const/4 v6, 0x1

    .line 85
    const/4 v7, 0x0

    .line 86
    if-eq v4, v5, :cond_0

    .line 87
    .line 88
    move v4, v6

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move v4, v7

    .line 91
    :goto_0
    and-int/2addr v2, v6

    .line 92
    invoke-virtual {v1, v2, v4}, Lyt2;->V(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    sget-object v2, Lwr;->c:Lsr;

    .line 99
    .line 100
    sget-object v4, Lxb4;->K:Lg80;

    .line 101
    .line 102
    invoke-static {v2, v4, v1, v7}, Lzt0;->a(Lvr;Lg80;Lyt2;I)Lau0;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-wide v4, v1, Lyt2;->T:J

    .line 107
    .line 108
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-virtual {v1}, Lyt2;->m()Lvf5;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    sget-object v8, Ljl4;->w:Ljl4;

    .line 117
    .line 118
    invoke-static {v1, v8}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    sget-object v10, Lux0;->d:Ltx0;

    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v10, Ltx0;->b:Lvy0;

    .line 128
    .line 129
    invoke-virtual {v1}, Lyt2;->i0()V

    .line 130
    .line 131
    .line 132
    iget-boolean v11, v1, Lyt2;->S:Z

    .line 133
    .line 134
    if-eqz v11, :cond_1

    .line 135
    .line 136
    invoke-virtual {v1, v10}, Lyt2;->l(Lsr2;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    invoke-virtual {v1}, Lyt2;->r0()V

    .line 141
    .line 142
    .line 143
    :goto_1
    sget-object v10, Ltx0;->f:Lck;

    .line 144
    .line 145
    invoke-static {v10, v1, v2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object v2, Ltx0;->e:Lck;

    .line 149
    .line 150
    invoke-static {v2, v1, v5}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    sget-object v4, Ltx0;->g:Lck;

    .line 158
    .line 159
    invoke-static {v4, v1, v2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object v2, Ltx0;->h:Lce;

    .line 163
    .line 164
    invoke-static {v1, v2}, Lg75;->O(Lyt2;Lvr2;)V

    .line 165
    .line 166
    .line 167
    sget-object v2, Ltx0;->d:Lck;

    .line 168
    .line 169
    invoke-static {v2, v1, v9}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    const v2, 0x7f1100e6

    .line 173
    .line 174
    .line 175
    invoke-static {v2, v1}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    move v2, v6

    .line 180
    move v5, v7

    .line 181
    invoke-static {}, Lb30;->n()J

    .line 182
    .line 183
    .line 184
    move-result-wide v6

    .line 185
    const/16 v9, 0xe

    .line 186
    .line 187
    invoke-static {v9}, Lya5;->k(I)J

    .line 188
    .line 189
    .line 190
    move-result-wide v9

    .line 191
    const/16 v11, 0x14

    .line 192
    .line 193
    invoke-static {v11}, Lya5;->k(I)J

    .line 194
    .line 195
    .line 196
    move-result-wide v16

    .line 197
    const/16 v25, 0x30

    .line 198
    .line 199
    const v26, 0x3f7ea

    .line 200
    .line 201
    .line 202
    move v11, v5

    .line 203
    const/4 v5, 0x0

    .line 204
    move-object v12, v8

    .line 205
    move-wide v8, v9

    .line 206
    const/4 v10, 0x0

    .line 207
    move v13, v11

    .line 208
    const/4 v11, 0x0

    .line 209
    move-object v15, v12

    .line 210
    move v14, v13

    .line 211
    const-wide/16 v12, 0x0

    .line 212
    .line 213
    move/from16 v18, v14

    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    move-object/from16 v19, v15

    .line 217
    .line 218
    const/4 v15, 0x0

    .line 219
    move/from16 v20, v18

    .line 220
    .line 221
    const/16 v18, 0x0

    .line 222
    .line 223
    move-object/from16 v21, v19

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    move/from16 v22, v20

    .line 228
    .line 229
    const/16 v20, 0x0

    .line 230
    .line 231
    move-object/from16 v23, v21

    .line 232
    .line 233
    const/16 v21, 0x0

    .line 234
    .line 235
    move/from16 v24, v22

    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    move/from16 v27, v24

    .line 240
    .line 241
    const/16 v24, 0x6000

    .line 242
    .line 243
    move-object/from16 v2, v23

    .line 244
    .line 245
    move-object/from16 v23, v1

    .line 246
    .line 247
    move/from16 v1, v27

    .line 248
    .line 249
    invoke-static/range {v4 .. v26}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v4, v23

    .line 253
    .line 254
    const/high16 v5, 0x41800000    # 16.0f

    .line 255
    .line 256
    const v6, 0x7f1100e2

    .line 257
    .line 258
    .line 259
    invoke-static {v2, v5, v4, v6, v4}, Lpb4;->j(Ljl4;FLyt2;ILyt2;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    const v6, 0x7f1100e3

    .line 264
    .line 265
    .line 266
    invoke-static {v6, v4}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-static {v1, v0, v4, v5, v6}, Lb30;->d(ILvr2;Lyt2;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    const/high16 v5, 0x41400000    # 12.0f

    .line 274
    .line 275
    const v6, 0x7f1100e8

    .line 276
    .line 277
    .line 278
    invoke-static {v2, v5, v4, v6, v4}, Lpb4;->j(Ljl4;FLyt2;ILyt2;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const v5, 0x7f1100e9

    .line 283
    .line 284
    .line 285
    invoke-static {v5, v4}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-static {v1, v0, v4, v2, v5}, Lb30;->d(ILvr2;Lyt2;Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const/4 v2, 0x1

    .line 293
    invoke-virtual {v4, v2}, Lyt2;->r(Z)V

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_2
    move-object v4, v1

    .line 298
    invoke-virtual {v4}, Lyt2;->Y()V

    .line 299
    .line 300
    .line 301
    :goto_2
    return-object v3

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
