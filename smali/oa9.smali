.class public final synthetic Loa9;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lvr2;

.field public final synthetic y:La37;


# direct methods
.method public synthetic constructor <init>(Lvr2;Laq4;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Loa9;->w:Z

    .line 5
    .line 6
    iput-object p1, p0, Loa9;->x:Lvr2;

    .line 7
    .line 8
    iput-object p2, p0, Loa9;->y:La37;

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


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lxb4;->C:Li80;

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    move-object/from16 v12, p2

    .line 14
    .line 15
    check-cast v12, Lyt2;

    .line 16
    .line 17
    move-object/from16 v3, p1

    .line 18
    .line 19
    check-cast v3, Lla5;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 v4, v2, 0x6

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {v12, v3}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eq v5, v4, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v4, 0x4

    .line 38
    :goto_0
    or-int/2addr v2, v4

    .line 39
    :cond_1
    and-int/lit8 v4, v2, 0x13

    .line 40
    .line 41
    const/16 v6, 0x12

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    move v4, v5

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v4, v7

    .line 49
    :goto_1
    and-int/2addr v2, v5

    .line 50
    invoke-virtual {v12, v2, v4}, Lyt2;->V(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_a

    .line 55
    .line 56
    sget-object v2, Ljl4;->w:Ljl4;

    .line 57
    .line 58
    invoke-static {v2, v3}, Lx91;->J(Lml4;Lla5;)Lml4;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    sget-object v4, Lyu6;->c:Lsd2;

    .line 63
    .line 64
    invoke-interface {v3, v4}, Lml4;->d(Lml4;)Lml4;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object v6, Lxb4;->y:Li80;

    .line 69
    .line 70
    invoke-static {v6, v7}, Lmb0;->d(Ljb;Z)Llh4;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    iget-wide v8, v12, Lyt2;->T:J

    .line 75
    .line 76
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    invoke-virtual {v12}, Lyt2;->m()Lvf5;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-static {v12, v3}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    sget-object v10, Lux0;->d:Ltx0;

    .line 89
    .line 90
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object v10, Ltx0;->b:Lvy0;

    .line 94
    .line 95
    invoke-virtual {v12}, Lyt2;->i0()V

    .line 96
    .line 97
    .line 98
    iget-boolean v11, v12, Lyt2;->S:Z

    .line 99
    .line 100
    if-eqz v11, :cond_3

    .line 101
    .line 102
    invoke-virtual {v12, v10}, Lyt2;->l(Lsr2;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    invoke-virtual {v12}, Lyt2;->r0()V

    .line 107
    .line 108
    .line 109
    :goto_2
    sget-object v10, Ltx0;->f:Lck;

    .line 110
    .line 111
    invoke-static {v10, v12, v6}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object v6, Ltx0;->e:Lck;

    .line 115
    .line 116
    invoke-static {v6, v12, v9}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    sget-object v8, Ltx0;->g:Lck;

    .line 124
    .line 125
    invoke-static {v8, v12, v6}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    sget-object v6, Ltx0;->h:Lce;

    .line 129
    .line 130
    invoke-static {v12, v6}, Lg75;->O(Lyt2;Lvr2;)V

    .line 131
    .line 132
    .line 133
    sget-object v6, Ltx0;->d:Lck;

    .line 134
    .line 135
    invoke-static {v6, v12, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-boolean v3, v0, Loa9;->w:Z

    .line 139
    .line 140
    sget-object v6, Lqb0;->a:Lqb0;

    .line 141
    .line 142
    if-nez v3, :cond_4

    .line 143
    .line 144
    const v0, 0x3e7395da

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Lyt2;->e0(I)V

    .line 148
    .line 149
    .line 150
    const v0, 0x7f1102d0

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v12}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v6, v2, v1}, Lqb0;->a(Lml4;Ljb;)Lml4;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    const/16 v24, 0x0

    .line 162
    .line 163
    const v25, 0x3fffc

    .line 164
    .line 165
    .line 166
    move v0, v5

    .line 167
    const-wide/16 v5, 0x0

    .line 168
    .line 169
    move v1, v7

    .line 170
    const-wide/16 v7, 0x0

    .line 171
    .line 172
    const/4 v9, 0x0

    .line 173
    const/4 v10, 0x0

    .line 174
    move-object/from16 v22, v12

    .line 175
    .line 176
    const-wide/16 v11, 0x0

    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    const-wide/16 v15, 0x0

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    const/16 v19, 0x0

    .line 187
    .line 188
    const/16 v20, 0x0

    .line 189
    .line 190
    const/16 v21, 0x0

    .line 191
    .line 192
    const/16 v23, 0x0

    .line 193
    .line 194
    invoke-static/range {v3 .. v25}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v12, v22

    .line 198
    .line 199
    invoke-virtual {v12, v1}, Lyt2;->r(Z)V

    .line 200
    .line 201
    .line 202
    move v1, v0

    .line 203
    goto/16 :goto_4

    .line 204
    .line 205
    :cond_4
    move v14, v5

    .line 206
    move v15, v7

    .line 207
    const v3, 0x3e769d37

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v3}, Lyt2;->e0(I)V

    .line 211
    .line 212
    .line 213
    iget-object v3, v0, Loa9;->y:La37;

    .line 214
    .line 215
    invoke-interface {v3}, La37;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    check-cast v3, Lvr8;

    .line 220
    .line 221
    instance-of v5, v3, Lsr8;

    .line 222
    .line 223
    if-eqz v5, :cond_5

    .line 224
    .line 225
    const v0, 0x3e7734d3

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0}, Lyt2;->e0(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v2, v1}, Lqb0;->a(Lml4;Ljb;)Lml4;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    move-object/from16 v22, v12

    .line 236
    .line 237
    const/4 v12, 0x0

    .line 238
    const/16 v13, 0x3e

    .line 239
    .line 240
    const-wide/16 v4, 0x0

    .line 241
    .line 242
    const/4 v6, 0x0

    .line 243
    const-wide/16 v7, 0x0

    .line 244
    .line 245
    const/4 v9, 0x0

    .line 246
    const/4 v10, 0x0

    .line 247
    move-object/from16 v11, v22

    .line 248
    .line 249
    invoke-static/range {v3 .. v13}, Lrq5;->a(Lml4;JFJIFLyt2;II)V

    .line 250
    .line 251
    .line 252
    move-object v12, v11

    .line 253
    invoke-virtual {v12, v15}, Lyt2;->r(Z)V

    .line 254
    .line 255
    .line 256
    move v1, v14

    .line 257
    move v2, v15

    .line 258
    goto/16 :goto_3

    .line 259
    .line 260
    :cond_5
    instance-of v5, v3, Lpr8;

    .line 261
    .line 262
    if-eqz v5, :cond_6

    .line 263
    .line 264
    const v0, 0x3e798aaa

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Lyt2;->e0(I)V

    .line 268
    .line 269
    .line 270
    check-cast v3, Lpr8;

    .line 271
    .line 272
    iget-object v3, v3, Lpr8;->a:Ljava/lang/String;

    .line 273
    .line 274
    sget-object v0, Lch4;->b:Lt37;

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, Lzg4;

    .line 281
    .line 282
    iget-object v0, v0, Lzg4;->a:Lqt0;

    .line 283
    .line 284
    iget-wide v4, v0, Lqt0;->w:J

    .line 285
    .line 286
    invoke-virtual {v6, v2, v1}, Lqb0;->a(Lml4;Ljb;)Lml4;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    const/16 v24, 0x0

    .line 291
    .line 292
    const v25, 0x3fff8

    .line 293
    .line 294
    .line 295
    const-wide/16 v7, 0x0

    .line 296
    .line 297
    const/4 v9, 0x0

    .line 298
    const/4 v10, 0x0

    .line 299
    move-object/from16 v22, v12

    .line 300
    .line 301
    const-wide/16 v11, 0x0

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    move v1, v14

    .line 305
    const/4 v14, 0x0

    .line 306
    move v2, v15

    .line 307
    const-wide/16 v15, 0x0

    .line 308
    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    const/16 v20, 0x0

    .line 316
    .line 317
    const/16 v21, 0x0

    .line 318
    .line 319
    const/16 v23, 0x0

    .line 320
    .line 321
    move-wide v5, v4

    .line 322
    move-object v4, v0

    .line 323
    invoke-static/range {v3 .. v25}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 324
    .line 325
    .line 326
    move-object/from16 v12, v22

    .line 327
    .line 328
    invoke-virtual {v12, v2}, Lyt2;->r(Z)V

    .line 329
    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_6
    move v1, v14

    .line 333
    move v2, v15

    .line 334
    instance-of v5, v3, Lrr8;

    .line 335
    .line 336
    if-eqz v5, :cond_9

    .line 337
    .line 338
    const v5, 0x3e7d2dc1

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v5}, Lyt2;->e0(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v3}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    iget-object v0, v0, Loa9;->x:Lvr2;

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    or-int/2addr v5, v6

    .line 355
    invoke-virtual {v12}, Lyt2;->Q()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    if-nez v5, :cond_7

    .line 360
    .line 361
    sget-object v5, Lay0;->a:Ld63;

    .line 362
    .line 363
    if-ne v6, v5, :cond_8

    .line 364
    .line 365
    :cond_7
    new-instance v6, Le3;

    .line 366
    .line 367
    check-cast v3, Lrr8;

    .line 368
    .line 369
    const/16 v5, 0x17

    .line 370
    .line 371
    invoke-direct {v6, v5, v3, v0}, Le3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v6}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    :cond_8
    move-object v11, v6

    .line 378
    check-cast v11, Lvr2;

    .line 379
    .line 380
    const/4 v13, 0x6

    .line 381
    const/16 v14, 0x1fe

    .line 382
    .line 383
    move-object v3, v4

    .line 384
    const/4 v4, 0x0

    .line 385
    const/4 v5, 0x0

    .line 386
    const/4 v6, 0x0

    .line 387
    const/4 v7, 0x0

    .line 388
    const/4 v8, 0x0

    .line 389
    const/4 v9, 0x0

    .line 390
    const/4 v10, 0x0

    .line 391
    invoke-static/range {v3 .. v14}, Lx91;->a(Lml4;Ls34;Lla5;Lvr;Lib;Leh2;ZLxf;Lvr2;Lyt2;II)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v2}, Lyt2;->r(Z)V

    .line 395
    .line 396
    .line 397
    :goto_3
    invoke-virtual {v12, v2}, Lyt2;->r(Z)V

    .line 398
    .line 399
    .line 400
    :goto_4
    invoke-virtual {v12, v1}, Lyt2;->r(Z)V

    .line 401
    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_9
    const v0, 0x4c56682b    # 5.6205484E7f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0}, Lyt2;->e0(I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v2}, Lyt2;->r(Z)V

    .line 411
    .line 412
    .line 413
    invoke-static {}, Lh;->c()V

    .line 414
    .line 415
    .line 416
    const/4 v0, 0x0

    .line 417
    return-object v0

    .line 418
    :cond_a
    invoke-virtual {v12}, Lyt2;->Y()V

    .line 419
    .line 420
    .line 421
    :goto_5
    sget-object v0, Lvs7;->a:Lvs7;

    .line 422
    .line 423
    return-object v0
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
