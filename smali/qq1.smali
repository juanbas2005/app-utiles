.class public final Lqq1;
.super Ljava/lang/Object;

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lqq1;->w:I

    iput-object p2, p0, Lqq1;->x:Ljava/lang/Object;

    iput-object p3, p0, Lqq1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lml4;I)V
    .locals 0

    .line 1
    const/4 p3, 0x4

    .line 2
    iput p3, p0, Lqq1;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqq1;->x:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lqq1;->y:Ljava/lang/Object;

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lqq1;->w:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Lvs7;->a:Lvs7;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x3

    .line 10
    iget-object v6, v0, Lqq1;->y:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, Lqq1;->x:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    and-int/lit8 v8, v1, 0x1

    .line 27
    .line 28
    and-int/2addr v1, v5

    .line 29
    if-eq v1, v4, :cond_0

    .line 30
    .line 31
    move v7, v2

    .line 32
    :cond_0
    move-object/from16 v1, p1

    .line 33
    .line 34
    check-cast v1, Lyt2;

    .line 35
    .line 36
    invoke-virtual {v1, v8, v7}, Lyt2;->V(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    check-cast v6, Lsr2;

    .line 45
    .line 46
    new-instance v4, Lzi8;

    .line 47
    .line 48
    invoke-direct {v4, v5, v0}, Lzi8;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const v0, 0x609c9c86

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v4, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    new-instance v0, Lm49;

    .line 59
    .line 60
    invoke-direct {v0, v2, v6}, Lm49;-><init>(ILsr2;)V

    .line 61
    .line 62
    .line 63
    const v2, -0x1b026f3c

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    const/16 v18, 0x186

    .line 71
    .line 72
    const/16 v19, 0x1fa

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v14, 0x0

    .line 78
    const/4 v15, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    move-object/from16 v17, v1

    .line 82
    .line 83
    invoke-static/range {v9 .. v19}, Lvn;->c(Lfw0;Lml4;Lfw0;Lhs2;FLaa8;Lfk7;Lla5;Lyt2;II)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move-object/from16 v17, v1

    .line 88
    .line 89
    invoke-virtual/range {v17 .. v17}, Lyt2;->Y()V

    .line 90
    .line 91
    .line 92
    :goto_0
    return-object v3

    .line 93
    :pswitch_0
    move-object/from16 v1, p2

    .line 94
    .line 95
    check-cast v1, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    and-int/lit8 v8, v1, 0x1

    .line 102
    .line 103
    and-int/2addr v1, v5

    .line 104
    if-eq v1, v4, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move v2, v7

    .line 108
    :goto_1
    move-object/from16 v1, p1

    .line 109
    .line 110
    check-cast v1, Lyt2;

    .line 111
    .line 112
    invoke-virtual {v1, v8, v2}, Lyt2;->V(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    check-cast v0, Ljb9;

    .line 119
    .line 120
    check-cast v6, Lsr2;

    .line 121
    .line 122
    new-instance v2, Lzi8;

    .line 123
    .line 124
    invoke-direct {v2, v4, v0}, Lzi8;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    const v0, 0x7d7108f3

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v2, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    new-instance v0, Lm49;

    .line 135
    .line 136
    invoke-direct {v0, v7, v6}, Lm49;-><init>(ILsr2;)V

    .line 137
    .line 138
    .line 139
    const v2, 0x16dd8f5

    .line 140
    .line 141
    .line 142
    invoke-static {v2, v0, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    const/16 v18, 0x186

    .line 147
    .line 148
    const/16 v19, 0x1fa

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    const/4 v12, 0x0

    .line 152
    const/4 v13, 0x0

    .line 153
    const/4 v14, 0x0

    .line 154
    const/4 v15, 0x0

    .line 155
    const/16 v16, 0x0

    .line 156
    .line 157
    move-object/from16 v17, v1

    .line 158
    .line 159
    invoke-static/range {v9 .. v19}, Lvn;->c(Lfw0;Lml4;Lfw0;Lhs2;FLaa8;Lfk7;Lla5;Lyt2;II)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_3
    move-object/from16 v17, v1

    .line 164
    .line 165
    invoke-virtual/range {v17 .. v17}, Lyt2;->Y()V

    .line 166
    .line 167
    .line 168
    :goto_2
    return-object v3

    .line 169
    :pswitch_1
    move-object/from16 v1, p2

    .line 170
    .line 171
    check-cast v1, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    check-cast v0, Ljava/lang/String;

    .line 177
    .line 178
    check-cast v6, Lml4;

    .line 179
    .line 180
    move-object/from16 v1, p1

    .line 181
    .line 182
    check-cast v1, Lyt2;

    .line 183
    .line 184
    invoke-static {v2}, Lb85;->v(I)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v0, v6, v1, v2}, Li35;->t(Ljava/lang/String;Lml4;Lyt2;I)V

    .line 189
    .line 190
    .line 191
    return-object v3

    .line 192
    :pswitch_2
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, Lyt2;

    .line 195
    .line 196
    move-object/from16 v2, p2

    .line 197
    .line 198
    check-cast v2, Ljava/lang/Number;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    check-cast v0, Lzs4;

    .line 205
    .line 206
    and-int/2addr v2, v5

    .line 207
    if-ne v2, v4, :cond_5

    .line 208
    .line 209
    invoke-virtual {v1}, Lyt2;->F()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-nez v2, :cond_4

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_4
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_5
    :goto_3
    iget-object v2, v0, Lzs4;->x:Lqt4;

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    check-cast v2, Lgx0;

    .line 226
    .line 227
    iget-object v2, v2, Lgx0;->B:Lis2;

    .line 228
    .line 229
    check-cast v6, Lfk;

    .line 230
    .line 231
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-interface {v2, v6, v0, v1, v4}, Lis2;->C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    :goto_4
    return-object v3

    .line 239
    :pswitch_3
    move-object/from16 v1, p1

    .line 240
    .line 241
    check-cast v1, Lyt2;

    .line 242
    .line 243
    move-object/from16 v2, p2

    .line 244
    .line 245
    check-cast v2, Ljava/lang/Number;

    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    and-int/2addr v2, v5

    .line 252
    if-ne v2, v4, :cond_7

    .line 253
    .line 254
    invoke-virtual {v1}, Lyt2;->F()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-nez v2, :cond_6

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_6
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 262
    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_7
    :goto_5
    check-cast v0, Loe6;

    .line 266
    .line 267
    check-cast v6, Lfw0;

    .line 268
    .line 269
    invoke-static {v0, v6, v1, v7}, Lx91;->h(Loe6;Lfw0;Lyt2;I)V

    .line 270
    .line 271
    .line 272
    :goto_6
    return-object v3

    .line 273
    :pswitch_4
    move-object/from16 v1, p1

    .line 274
    .line 275
    check-cast v1, Lyt2;

    .line 276
    .line 277
    move-object/from16 v2, p2

    .line 278
    .line 279
    check-cast v2, Ljava/lang/Number;

    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    and-int/2addr v2, v5

    .line 286
    if-ne v2, v4, :cond_9

    .line 287
    .line 288
    invoke-virtual {v1}, Lyt2;->F()Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-nez v2, :cond_8

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_8
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 296
    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_9
    :goto_7
    check-cast v0, Luu1;

    .line 300
    .line 301
    iget-object v0, v0, Luu1;->C:Lfw0;

    .line 302
    .line 303
    check-cast v6, Lzs4;

    .line 304
    .line 305
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v0, v6, v1, v2}, Lfw0;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :goto_8
    return-object v3

    .line 313
    :pswitch_5
    check-cast v0, Lpi0;

    .line 314
    .line 315
    check-cast v6, Lpi0;

    .line 316
    .line 317
    move-object/from16 v1, p1

    .line 318
    .line 319
    check-cast v1, Lvj1;

    .line 320
    .line 321
    move-object/from16 v3, p2

    .line 322
    .line 323
    check-cast v3, Lvj1;

    .line 324
    .line 325
    invoke-static {v1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-eqz v0, :cond_a

    .line 330
    .line 331
    invoke-static {v3, v6}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_a

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_a
    move v2, v7

    .line 339
    :goto_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    return-object v0

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
