.class public final Liw0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# static fields
.field public static final A:Liw0;

.field public static final x:Liw0;

.field public static final y:Liw0;

.field public static final z:Liw0;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Liw0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Liw0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Liw0;->x:Liw0;

    .line 8
    .line 9
    new-instance v0, Liw0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Liw0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Liw0;->y:Liw0;

    .line 16
    .line 17
    new-instance v0, Liw0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Liw0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Liw0;->z:Liw0;

    .line 24
    .line 25
    new-instance v0, Liw0;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Liw0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Liw0;->A:Liw0;

    .line 32
    .line 33
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Liw0;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Liw0;->w:I

    .line 4
    .line 5
    const/high16 v1, 0x41900000    # 18.0f

    .line 6
    .line 7
    sget-object v2, Ljl4;->w:Ljl4;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/16 v4, 0x12

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x4

    .line 14
    const/4 v7, 0x0

    .line 15
    sget-object v8, Lvs7;->a:Lvs7;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v9, p1

    .line 21
    .line 22
    check-cast v9, Ltx5;

    .line 23
    .line 24
    move-object/from16 v0, p2

    .line 25
    .line 26
    check-cast v0, Lyt2;

    .line 27
    .line 28
    move-object/from16 v1, p3

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    and-int/lit8 v2, v1, 0xe

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v9}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    move v5, v6

    .line 47
    :cond_0
    or-int/2addr v1, v5

    .line 48
    :cond_1
    and-int/lit8 v2, v1, 0x5b

    .line 49
    .line 50
    if-ne v2, v4, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Lyt2;->F()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {v0}, Lyt2;->Y()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_3
    :goto_0
    iget-object v2, v9, Ltx5;->b:Lqt;

    .line 65
    .line 66
    iget-object v2, v2, Lqt;->M:Led5;

    .line 67
    .line 68
    invoke-virtual {v2}, Led5;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lmt;

    .line 73
    .line 74
    instance-of v3, v2, Lkt;

    .line 75
    .line 76
    if-eqz v3, :cond_4

    .line 77
    .line 78
    const v3, 0x67aed995

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v3}, Lyt2;->f0(I)V

    .line 82
    .line 83
    .line 84
    sget-object v3, Lie1;->k:Lfw0;

    .line 85
    .line 86
    and-int/lit8 v1, v1, 0xe

    .line 87
    .line 88
    or-int/lit8 v1, v1, 0x40

    .line 89
    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v3, v9, v2, v0, v1}, Lfw0;->C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v7}, Lyt2;->r(Z)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    instance-of v3, v2, Llt;

    .line 102
    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    const v2, 0x67b045d5

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Lyt2;->f0(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v7}, Lyt2;->r(Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    instance-of v3, v2, Ljt;

    .line 116
    .line 117
    if-eqz v3, :cond_6

    .line 118
    .line 119
    const v3, 0x67b1a9d9

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v3}, Lyt2;->f0(I)V

    .line 123
    .line 124
    .line 125
    sget-object v3, Lie1;->l:Lfw0;

    .line 126
    .line 127
    and-int/lit8 v1, v1, 0xe

    .line 128
    .line 129
    or-int/lit8 v1, v1, 0x40

    .line 130
    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v3, v9, v2, v0, v1}, Lfw0;->C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v7}, Lyt2;->r(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    instance-of v2, v2, Lht;

    .line 143
    .line 144
    if-eqz v2, :cond_7

    .line 145
    .line 146
    const v2, 0x67b2f8ac

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2}, Lyt2;->f0(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v7}, Lyt2;->r(Z)V

    .line 153
    .line 154
    .line 155
    :goto_1
    const/4 v15, 0x0

    .line 156
    and-int/lit8 v17, v1, 0xe

    .line 157
    .line 158
    const/4 v10, 0x0

    .line 159
    const/4 v11, 0x0

    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    const/4 v14, 0x0

    .line 163
    move-object/from16 v16, v0

    .line 164
    .line 165
    invoke-static/range {v9 .. v17}, Lk75;->c(Ltx5;Lml4;Lvb5;Ljb;Lj51;FZLyt2;I)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_7
    const v1, -0x4e9df77

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lyt2;->f0(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v7}, Lyt2;->r(Z)V

    .line 176
    .line 177
    .line 178
    invoke-static {}, Lh;->c()V

    .line 179
    .line 180
    .line 181
    const/4 v8, 0x0

    .line 182
    :goto_2
    :pswitch_0
    return-object v8

    .line 183
    :pswitch_1
    move-object/from16 v0, p1

    .line 184
    .line 185
    check-cast v0, Lzs4;

    .line 186
    .line 187
    move-object/from16 v0, p2

    .line 188
    .line 189
    check-cast v0, Lyt2;

    .line 190
    .line 191
    move-object/from16 v0, p3

    .line 192
    .line 193
    check-cast v0, Ljava/lang/Number;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 196
    .line 197
    .line 198
    return-object v8

    .line 199
    :pswitch_2
    move-object/from16 v0, p1

    .line 200
    .line 201
    check-cast v0, Ljt0;

    .line 202
    .line 203
    iget-wide v12, v0, Ljt0;->a:J

    .line 204
    .line 205
    move-object/from16 v14, p2

    .line 206
    .line 207
    check-cast v14, Lyt2;

    .line 208
    .line 209
    move-object/from16 v0, p3

    .line 210
    .line 211
    check-cast v0, Ljava/lang/Number;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    and-int/lit8 v9, v0, 0x6

    .line 218
    .line 219
    if-nez v9, :cond_9

    .line 220
    .line 221
    invoke-virtual {v14, v12, v13}, Lyt2;->f(J)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-eqz v9, :cond_8

    .line 226
    .line 227
    move v5, v6

    .line 228
    :cond_8
    or-int/2addr v0, v5

    .line 229
    :cond_9
    and-int/lit8 v5, v0, 0x13

    .line 230
    .line 231
    if-eq v5, v4, :cond_a

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_a
    move v3, v7

    .line 235
    :goto_3
    and-int/lit8 v4, v0, 0x1

    .line 236
    .line 237
    invoke-virtual {v14, v4, v3}, Lyt2;->V(IZ)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_b

    .line 242
    .line 243
    invoke-static {}, Lr16;->G()Lx83;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    invoke-static {v2, v1}, Lyu6;->l(Lml4;F)Lml4;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    shl-int/lit8 v0, v0, 0x9

    .line 252
    .line 253
    and-int/lit16 v0, v0, 0x1c00

    .line 254
    .line 255
    or-int/lit16 v15, v0, 0x1b0

    .line 256
    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    invoke-static/range {v9 .. v16}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_b
    invoke-virtual {v14}, Lyt2;->Y()V

    .line 265
    .line 266
    .line 267
    :goto_4
    return-object v8

    .line 268
    :pswitch_3
    move-object/from16 v0, p1

    .line 269
    .line 270
    check-cast v0, Ljt0;

    .line 271
    .line 272
    iget-wide v12, v0, Ljt0;->a:J

    .line 273
    .line 274
    move-object/from16 v14, p2

    .line 275
    .line 276
    check-cast v14, Lyt2;

    .line 277
    .line 278
    move-object/from16 v0, p3

    .line 279
    .line 280
    check-cast v0, Ljava/lang/Number;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    and-int/lit8 v9, v0, 0x6

    .line 287
    .line 288
    if-nez v9, :cond_d

    .line 289
    .line 290
    invoke-virtual {v14, v12, v13}, Lyt2;->f(J)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-eqz v9, :cond_c

    .line 295
    .line 296
    move v5, v6

    .line 297
    :cond_c
    or-int/2addr v0, v5

    .line 298
    :cond_d
    and-int/lit8 v5, v0, 0x13

    .line 299
    .line 300
    if-eq v5, v4, :cond_e

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_e
    move v3, v7

    .line 304
    :goto_5
    and-int/lit8 v4, v0, 0x1

    .line 305
    .line 306
    invoke-virtual {v14, v4, v3}, Lyt2;->V(IZ)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_f

    .line 311
    .line 312
    invoke-static {}, Lp25;->o()Lx83;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-static {v2, v1}, Lyu6;->l(Lml4;F)Lml4;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    shl-int/lit8 v0, v0, 0x9

    .line 321
    .line 322
    and-int/lit16 v0, v0, 0x1c00

    .line 323
    .line 324
    or-int/lit16 v15, v0, 0x1b0

    .line 325
    .line 326
    const/16 v16, 0x0

    .line 327
    .line 328
    const/4 v10, 0x0

    .line 329
    invoke-static/range {v9 .. v16}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 330
    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_f
    invoke-virtual {v14}, Lyt2;->Y()V

    .line 334
    .line 335
    .line 336
    :goto_6
    return-object v8

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
