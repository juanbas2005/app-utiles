.class public final synthetic Lz26;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lz26;->w:I

    .line 2
    .line 3
    iput p1, p0, Lz26;->x:I

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
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lz26;->w:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    sget-object v4, Lvs7;->a:Lvs7;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget v0, v0, Lz26;->x:I

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, Lfa6;

    .line 20
    .line 21
    move-object/from16 v2, p2

    .line 22
    .line 23
    check-cast v2, Lyt2;

    .line 24
    .line 25
    move-object/from16 v7, p3

    .line 26
    .line 27
    check-cast v7, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit8 v1, v7, 0x11

    .line 37
    .line 38
    if-eq v1, v3, :cond_0

    .line 39
    .line 40
    move v6, v5

    .line 41
    :cond_0
    and-int/lit8 v1, v7, 0x1

    .line 42
    .line 43
    invoke-virtual {v2, v1, v6}, Lyt2;->V(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    add-int/2addr v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const/16 v28, 0x0

    .line 55
    .line 56
    const v29, 0x3fffe

    .line 57
    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const-wide/16 v9, 0x0

    .line 61
    .line 62
    const-wide/16 v11, 0x0

    .line 63
    .line 64
    const/4 v13, 0x0

    .line 65
    const/4 v14, 0x0

    .line 66
    const-wide/16 v15, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    const-wide/16 v19, 0x0

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const/16 v22, 0x0

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    const/16 v24, 0x0

    .line 81
    .line 82
    const/16 v25, 0x0

    .line 83
    .line 84
    const/16 v27, 0x0

    .line 85
    .line 86
    move-object/from16 v26, v2

    .line 87
    .line 88
    invoke-static/range {v7 .. v29}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move-object/from16 v26, v2

    .line 93
    .line 94
    invoke-virtual/range {v26 .. v26}, Lyt2;->Y()V

    .line 95
    .line 96
    .line 97
    :goto_0
    return-object v4

    .line 98
    :pswitch_0
    move-object/from16 v1, p1

    .line 99
    .line 100
    check-cast v1, Lpb0;

    .line 101
    .line 102
    move-object/from16 v13, p2

    .line 103
    .line 104
    check-cast v13, Lyt2;

    .line 105
    .line 106
    move-object/from16 v7, p3

    .line 107
    .line 108
    check-cast v7, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    and-int/lit8 v1, v7, 0x11

    .line 118
    .line 119
    if-eq v1, v3, :cond_2

    .line 120
    .line 121
    move v1, v5

    .line 122
    goto :goto_1

    .line 123
    :cond_2
    move v1, v6

    .line 124
    :goto_1
    and-int/lit8 v3, v7, 0x1

    .line 125
    .line 126
    invoke-virtual {v13, v3, v1}, Lyt2;->V(IZ)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    if-eq v0, v5, :cond_3

    .line 135
    .line 136
    const v0, 0x104bc2b5

    .line 137
    .line 138
    .line 139
    invoke-virtual {v13, v0}, Lyt2;->e0(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v13, v6}, Lyt2;->r(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_3
    const v1, 0x10499721

    .line 147
    .line 148
    .line 149
    invoke-virtual {v13, v1}, Lyt2;->e0(I)V

    .line 150
    .line 151
    .line 152
    sget-object v1, Lch4;->b:Lt37;

    .line 153
    .line 154
    invoke-virtual {v13, v1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Lzg4;

    .line 159
    .line 160
    iget-object v1, v1, Lzg4;->a:Lqt0;

    .line 161
    .line 162
    iget-wide v8, v1, Lqt0;->b:J

    .line 163
    .line 164
    new-instance v1, Lz26;

    .line 165
    .line 166
    invoke-direct {v1, v0, v2}, Lz26;-><init>(II)V

    .line 167
    .line 168
    .line 169
    const v0, 0x65a15015

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1, v13}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    const/16 v14, 0xc00

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const-wide/16 v10, 0x0

    .line 180
    .line 181
    invoke-static/range {v7 .. v14}, Lmp7;->f(Lml4;JJLhs2;Lyt2;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v13, v6}, Lyt2;->r(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    invoke-virtual {v13}, Lyt2;->Y()V

    .line 189
    .line 190
    .line 191
    :goto_2
    return-object v4

    .line 192
    :pswitch_1
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, Ljava/util/List;

    .line 195
    .line 196
    move-object/from16 v12, p2

    .line 197
    .line 198
    check-cast v12, Lyt2;

    .line 199
    .line 200
    move-object/from16 v3, p3

    .line 201
    .line 202
    check-cast v3, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    and-int/lit8 v7, v3, 0x6

    .line 212
    .line 213
    if-nez v7, :cond_7

    .line 214
    .line 215
    and-int/lit8 v7, v3, 0x8

    .line 216
    .line 217
    if-nez v7, :cond_5

    .line 218
    .line 219
    invoke-virtual {v12, v1}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    goto :goto_3

    .line 224
    :cond_5
    invoke-virtual {v12, v1}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    :goto_3
    if-eqz v7, :cond_6

    .line 229
    .line 230
    const/4 v2, 0x4

    .line 231
    :cond_6
    or-int/2addr v3, v2

    .line 232
    :cond_7
    and-int/lit8 v2, v3, 0x13

    .line 233
    .line 234
    const/16 v7, 0x12

    .line 235
    .line 236
    if-eq v2, v7, :cond_8

    .line 237
    .line 238
    move v2, v5

    .line 239
    goto :goto_4

    .line 240
    :cond_8
    move v2, v6

    .line 241
    :goto_4
    and-int/2addr v3, v5

    .line 242
    invoke-virtual {v12, v3, v2}, Lyt2;->V(IZ)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_9

    .line 247
    .line 248
    sget-object v7, Ld63;->Q:Ld63;

    .line 249
    .line 250
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    check-cast v0, Lwa7;

    .line 255
    .line 256
    new-instance v1, Lxa7;

    .line 257
    .line 258
    invoke-direct {v1, v6, v0}, Lxa7;-><init>(ILjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    new-instance v8, Lzx0;

    .line 262
    .line 263
    invoke-direct {v8, v1}, Lzx0;-><init>(Lhs2;)V

    .line 264
    .line 265
    .line 266
    sget v0, Lx08;->b:I

    .line 267
    .line 268
    const-wide v0, 0xff122c40L

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    invoke-static {v0, v1}, Luq3;->d(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v0

    .line 277
    const-wide v2, 0xffe3eef7L

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    invoke-static {v2, v3}, Luq3;->d(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v2

    .line 286
    invoke-static {v0, v1, v2, v3}, Lx08;->f(JJ)J

    .line 287
    .line 288
    .line 289
    move-result-wide v10

    .line 290
    const/16 v13, 0xc30

    .line 291
    .line 292
    const/4 v14, 0x0

    .line 293
    const/high16 v9, 0x40400000    # 3.0f

    .line 294
    .line 295
    invoke-virtual/range {v7 .. v14}, Ld63;->j(Lml4;FJLyt2;II)V

    .line 296
    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_9
    invoke-virtual {v12}, Lyt2;->Y()V

    .line 300
    .line 301
    .line 302
    :goto_5
    return-object v4

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
