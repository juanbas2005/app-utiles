.class public final synthetic Lqg7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsg7;


# direct methods
.method public synthetic constructor <init>(Lsg7;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqg7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lqg7;->x:Lsg7;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lqg7;->w:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, Lqg7;->x:Lsg7;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v4, v0, Lsg7;->U:Lrg7;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-boolean v1, v4, Lrg7;->c:Z

    .line 27
    .line 28
    invoke-static {v0}, Lg75;->D(Ldk6;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lsu0;->B(Lmy3;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lrc9;->e0(Lgz1;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, Lvl;

    .line 45
    .line 46
    iget-object v3, v1, Lvl;->x:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, v0, Lsg7;->U:Lrg7;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget-object v2, v1, Lrg7;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v3, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iput-object v3, v1, Lrg7;->b:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, v1, Lrg7;->d:Lmc5;

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    iget-object v2, v0, Lsg7;->L:Ltg7;

    .line 68
    .line 69
    iget-object v4, v0, Lsg7;->M:Ldl2;

    .line 70
    .line 71
    iget v5, v0, Lsg7;->N:I

    .line 72
    .line 73
    iget-boolean v6, v0, Lsg7;->O:Z

    .line 74
    .line 75
    iget v7, v0, Lsg7;->P:I

    .line 76
    .line 77
    iget v8, v0, Lsg7;->Q:I

    .line 78
    .line 79
    iput-object v3, v1, Lmc5;->a:Ljava/lang/String;

    .line 80
    .line 81
    iput-object v2, v1, Lmc5;->b:Ltg7;

    .line 82
    .line 83
    iput-object v4, v1, Lmc5;->c:Ldl2;

    .line 84
    .line 85
    iput v5, v1, Lmc5;->d:I

    .line 86
    .line 87
    iput-boolean v6, v1, Lmc5;->e:Z

    .line 88
    .line 89
    iput v7, v1, Lmc5;->f:I

    .line 90
    .line 91
    iput v8, v1, Lmc5;->g:I

    .line 92
    .line 93
    iget-wide v2, v1, Lmc5;->s:J

    .line 94
    .line 95
    const/4 v4, 0x2

    .line 96
    shl-long/2addr v2, v4

    .line 97
    const-wide/16 v4, 0x2

    .line 98
    .line 99
    or-long/2addr v2, v4

    .line 100
    iput-wide v2, v1, Lmc5;->s:J

    .line 101
    .line 102
    invoke-virtual {v1}, Lmc5;->c()V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance v1, Lrg7;

    .line 107
    .line 108
    iget-object v2, v0, Lsg7;->K:Ljava/lang/String;

    .line 109
    .line 110
    invoke-direct {v1, v2, v3}, Lrg7;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v2, Lmc5;

    .line 114
    .line 115
    iget-object v4, v0, Lsg7;->L:Ltg7;

    .line 116
    .line 117
    iget-object v5, v0, Lsg7;->M:Ldl2;

    .line 118
    .line 119
    iget v6, v0, Lsg7;->N:I

    .line 120
    .line 121
    iget-boolean v7, v0, Lsg7;->O:Z

    .line 122
    .line 123
    iget v8, v0, Lsg7;->P:I

    .line 124
    .line 125
    iget v9, v0, Lsg7;->Q:I

    .line 126
    .line 127
    invoke-direct/range {v2 .. v9}, Lmc5;-><init>(Ljava/lang/String;Ltg7;Ldl2;IZII)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lsg7;->V0()Lmc5;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-object v3, v3, Lmc5;->i:Ltp1;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Lmc5;->d(Ltp1;)V

    .line 137
    .line 138
    .line 139
    iput-object v2, v1, Lrg7;->d:Lmc5;

    .line 140
    .line 141
    iput-object v1, v0, Lsg7;->U:Lrg7;

    .line 142
    .line 143
    :cond_3
    :goto_1
    invoke-static {v0}, Lg75;->D(Ldk6;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Lsu0;->B(Lmy3;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v0}, Lrc9;->e0(Lgz1;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_1
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v0}, Lsg7;->V0()Lmc5;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    iget-object v5, v0, Lsg7;->L:Ltg7;

    .line 164
    .line 165
    sget-wide v6, Ljt0;->g:J

    .line 166
    .line 167
    const-wide/16 v16, 0x0

    .line 168
    .line 169
    const v18, 0xfffffe

    .line 170
    .line 171
    .line 172
    const-wide/16 v8, 0x0

    .line 173
    .line 174
    const/4 v10, 0x0

    .line 175
    const/4 v11, 0x0

    .line 176
    const-wide/16 v12, 0x0

    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const/4 v15, 0x0

    .line 180
    invoke-static/range {v5 .. v18}, Ltg7;->e(Ltg7;JJLam2;Lea7;JLrd7;IJI)Ltg7;

    .line 181
    .line 182
    .line 183
    move-result-object v21

    .line 184
    iget-object v0, v4, Lmc5;->o:Ley3;

    .line 185
    .line 186
    const/4 v5, 0x0

    .line 187
    if-nez v0, :cond_4

    .line 188
    .line 189
    :goto_2
    move-object v8, v5

    .line 190
    goto :goto_3

    .line 191
    :cond_4
    iget-object v6, v4, Lmc5;->i:Ltp1;

    .line 192
    .line 193
    if-nez v6, :cond_5

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_5
    new-instance v7, Lvl;

    .line 197
    .line 198
    iget-object v8, v4, Lmc5;->a:Ljava/lang/String;

    .line 199
    .line 200
    invoke-direct {v7, v8}, Lvl;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-object v8, v4, Lmc5;->j:Lzg;

    .line 204
    .line 205
    if-nez v8, :cond_6

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_6
    iget-object v8, v4, Lmc5;->n:Llc5;

    .line 209
    .line 210
    if-nez v8, :cond_7

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_7
    iget-wide v8, v4, Lmc5;->p:J

    .line 214
    .line 215
    const-wide v10, -0x1fffffffdL

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    and-long v14, v8, v10

    .line 221
    .line 222
    new-instance v8, Lbg7;

    .line 223
    .line 224
    new-instance v19, Lag7;

    .line 225
    .line 226
    iget v9, v4, Lmc5;->f:I

    .line 227
    .line 228
    iget-boolean v10, v4, Lmc5;->e:Z

    .line 229
    .line 230
    iget v11, v4, Lmc5;->d:I

    .line 231
    .line 232
    iget-object v12, v4, Lmc5;->c:Ldl2;

    .line 233
    .line 234
    sget-object v22, La42;->w:La42;

    .line 235
    .line 236
    move-object/from16 v27, v0

    .line 237
    .line 238
    move-object/from16 v26, v6

    .line 239
    .line 240
    move-object/from16 v20, v7

    .line 241
    .line 242
    move/from16 v23, v9

    .line 243
    .line 244
    move/from16 v24, v10

    .line 245
    .line 246
    move/from16 v25, v11

    .line 247
    .line 248
    move-object/from16 v28, v12

    .line 249
    .line 250
    move-wide/from16 v29, v14

    .line 251
    .line 252
    invoke-direct/range {v19 .. v30}, Lag7;-><init>(Lvl;Ltg7;Ljava/util/List;IZILtp1;Ley3;Ldl2;J)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v0, v19

    .line 256
    .line 257
    move-object/from16 v23, v26

    .line 258
    .line 259
    move-object/from16 v24, v28

    .line 260
    .line 261
    new-instance v12, Lpn4;

    .line 262
    .line 263
    new-instance v19, Lo9;

    .line 264
    .line 265
    invoke-direct/range {v19 .. v24}, Lo9;-><init>(Lvl;Ltg7;Ljava/util/List;Ltp1;Ldl2;)V

    .line 266
    .line 267
    .line 268
    iget v6, v4, Lmc5;->f:I

    .line 269
    .line 270
    iget v7, v4, Lmc5;->d:I

    .line 271
    .line 272
    move/from16 v16, v6

    .line 273
    .line 274
    move/from16 v17, v7

    .line 275
    .line 276
    move-object/from16 v13, v19

    .line 277
    .line 278
    invoke-direct/range {v12 .. v17}, Lpn4;-><init>(Lo9;JII)V

    .line 279
    .line 280
    .line 281
    iget-wide v6, v4, Lmc5;->l:J

    .line 282
    .line 283
    invoke-direct {v8, v0, v12, v6, v7}, Lbg7;-><init>(Lag7;Lpn4;J)V

    .line 284
    .line 285
    .line 286
    :goto_3
    if-eqz v8, :cond_8

    .line 287
    .line 288
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-object v5, v8

    .line 292
    :cond_8
    if-eqz v5, :cond_9

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_9
    move v2, v3

    .line 296
    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    return-object v0

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
