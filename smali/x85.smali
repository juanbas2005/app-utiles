.class public final synthetic Lx85;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic A:Ljava/lang/String;

.field public final synthetic B:Lvr2;

.field public final synthetic C:Z

.field public final synthetic D:Z

.field public final synthetic E:Ltg7;

.field public final synthetic F:Lbt3;

.field public final synthetic G:Lzs3;

.field public final synthetic H:Z

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic K:Lm78;

.field public final synthetic L:Lap4;

.field public final synthetic M:Lgs2;

.field public final synthetic N:Lgs2;

.field public final synthetic O:Lgs2;

.field public final synthetic P:Lgs2;

.field public final synthetic Q:Lpq6;

.field public final synthetic w:Lml4;

.field public final synthetic x:Lgs2;

.field public final synthetic y:Z

.field public final synthetic z:Lyd7;


# direct methods
.method public synthetic constructor <init>(Lml4;Lgs2;ZLyd7;Ljava/lang/String;Lvr2;ZZLtg7;Lbt3;Lzs3;ZIILm78;Lap4;Lgs2;Lgs2;Lgs2;Lgs2;Lpq6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx85;->w:Lml4;

    .line 5
    .line 6
    iput-object p2, p0, Lx85;->x:Lgs2;

    .line 7
    .line 8
    iput-boolean p3, p0, Lx85;->y:Z

    .line 9
    .line 10
    iput-object p4, p0, Lx85;->z:Lyd7;

    .line 11
    .line 12
    iput-object p5, p0, Lx85;->A:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lx85;->B:Lvr2;

    .line 15
    .line 16
    iput-boolean p7, p0, Lx85;->C:Z

    .line 17
    .line 18
    iput-boolean p8, p0, Lx85;->D:Z

    .line 19
    .line 20
    iput-object p9, p0, Lx85;->E:Ltg7;

    .line 21
    .line 22
    iput-object p10, p0, Lx85;->F:Lbt3;

    .line 23
    .line 24
    iput-object p11, p0, Lx85;->G:Lzs3;

    .line 25
    .line 26
    iput-boolean p12, p0, Lx85;->H:Z

    .line 27
    .line 28
    iput p13, p0, Lx85;->I:I

    .line 29
    .line 30
    iput p14, p0, Lx85;->J:I

    .line 31
    .line 32
    iput-object p15, p0, Lx85;->K:Lm78;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lx85;->L:Lap4;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lx85;->M:Lgs2;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lx85;->N:Lgs2;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Lx85;->O:Lgs2;

    .line 49
    .line 50
    move-object/from16 p1, p20

    .line 51
    .line 52
    iput-object p1, p0, Lx85;->P:Lgs2;

    .line 53
    .line 54
    move-object/from16 p1, p21

    .line 55
    .line 56
    iput-object p1, p0, Lx85;->Q:Lpq6;

    .line 57
    .line 58
    return-void
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
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lyt2;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    move v3, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v5

    .line 25
    :goto_0
    and-int/2addr v2, v6

    .line 26
    invoke-virtual {v1, v2, v3}, Lyt2;->V(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_5

    .line 31
    .line 32
    iget-object v14, v0, Lx85;->x:Lgs2;

    .line 33
    .line 34
    sget-object v2, Ljl4;->w:Ljl4;

    .line 35
    .line 36
    if-eqz v14, :cond_2

    .line 37
    .line 38
    const v3, -0x7e57e1c1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, Lyt2;->e0(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    sget-object v4, Lay0;->a:Ld63;

    .line 49
    .line 50
    if-ne v3, v4, :cond_1

    .line 51
    .line 52
    new-instance v3, Lj5;

    .line 53
    .line 54
    const/16 v4, 0x14

    .line 55
    .line 56
    invoke-direct {v3, v4}, Lj5;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    check-cast v3, Lvr2;

    .line 63
    .line 64
    invoke-static {v2, v6, v3}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-static {v1}, Lg75;->F(Lyt2;)F

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    const/4 v11, 0x0

    .line 73
    const/16 v12, 0xd

    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    invoke-static/range {v7 .. v12}, Lx91;->O(Lml4;FFFFI)Lml4;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v5}, Lyt2;->r(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const v3, -0x7e53733a

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v3}, Lyt2;->e0(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v5}, Lyt2;->r(Z)V

    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object v3, v0, Lx85;->w:Lml4;

    .line 95
    .line 96
    invoke-interface {v3, v2}, Lml4;->d(Lml4;)Lml4;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const v3, 0x7f1100d2

    .line 101
    .line 102
    .line 103
    invoke-static {v3, v1}, Lh75;->i(ILyt2;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-boolean v13, v0, Lx85;->y:Z

    .line 108
    .line 109
    if-eqz v13, :cond_3

    .line 110
    .line 111
    new-instance v4, Lcb;

    .line 112
    .line 113
    const/16 v6, 0x18

    .line 114
    .line 115
    invoke-direct {v4, v3, v6}, Lcb;-><init>(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v5, v4}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :cond_3
    const/high16 v3, 0x438c0000    # 280.0f

    .line 123
    .line 124
    const/high16 v4, 0x42600000    # 56.0f

    .line 125
    .line 126
    invoke-static {v2, v3, v4}, Lyu6;->a(Lml4;FF)Lml4;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    new-instance v3, Lky6;

    .line 131
    .line 132
    iget-object v4, v0, Lx85;->z:Lyd7;

    .line 133
    .line 134
    if-eqz v13, :cond_4

    .line 135
    .line 136
    iget-wide v5, v4, Lyd7;->j:J

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    iget-wide v5, v4, Lyd7;->i:J

    .line 140
    .line 141
    :goto_2
    invoke-direct {v3, v5, v6}, Lky6;-><init>(J)V

    .line 142
    .line 143
    .line 144
    new-instance v7, Ls85;

    .line 145
    .line 146
    iget-object v8, v0, Lx85;->A:Ljava/lang/String;

    .line 147
    .line 148
    iget-boolean v9, v0, Lx85;->C:Z

    .line 149
    .line 150
    iget-boolean v10, v0, Lx85;->H:Z

    .line 151
    .line 152
    iget-object v11, v0, Lx85;->K:Lm78;

    .line 153
    .line 154
    iget-object v12, v0, Lx85;->L:Lap4;

    .line 155
    .line 156
    iget-object v15, v0, Lx85;->M:Lgs2;

    .line 157
    .line 158
    iget-object v5, v0, Lx85;->N:Lgs2;

    .line 159
    .line 160
    iget-object v6, v0, Lx85;->O:Lgs2;

    .line 161
    .line 162
    move-object/from16 p1, v2

    .line 163
    .line 164
    iget-object v2, v0, Lx85;->P:Lgs2;

    .line 165
    .line 166
    move-object/from16 v18, v2

    .line 167
    .line 168
    iget-object v2, v0, Lx85;->Q:Lpq6;

    .line 169
    .line 170
    move-object/from16 v20, v2

    .line 171
    .line 172
    move-object/from16 v19, v4

    .line 173
    .line 174
    move-object/from16 v16, v5

    .line 175
    .line 176
    move-object/from16 v17, v6

    .line 177
    .line 178
    invoke-direct/range {v7 .. v20}, Ls85;-><init>(Ljava/lang/String;ZZLm78;Lap4;ZLgs2;Lgs2;Lgs2;Lgs2;Lgs2;Lyd7;Lpq6;)V

    .line 179
    .line 180
    .line 181
    move-object v13, v12

    .line 182
    const v2, -0x46e2e35b

    .line 183
    .line 184
    .line 185
    invoke-static {v2, v7, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    move-object/from16 v16, v1

    .line 192
    .line 193
    iget-object v1, v0, Lx85;->B:Lvr2;

    .line 194
    .line 195
    iget-boolean v4, v0, Lx85;->D:Z

    .line 196
    .line 197
    iget-object v5, v0, Lx85;->E:Ltg7;

    .line 198
    .line 199
    iget-object v6, v0, Lx85;->F:Lbt3;

    .line 200
    .line 201
    iget-object v7, v0, Lx85;->G:Lzs3;

    .line 202
    .line 203
    move-object v14, v3

    .line 204
    move v3, v9

    .line 205
    iget v9, v0, Lx85;->I:I

    .line 206
    .line 207
    iget v0, v0, Lx85;->J:I

    .line 208
    .line 209
    const/4 v12, 0x0

    .line 210
    move v2, v10

    .line 211
    move v10, v0

    .line 212
    move-object v0, v8

    .line 213
    move v8, v2

    .line 214
    move-object/from16 v2, p1

    .line 215
    .line 216
    invoke-static/range {v0 .. v17}, Lt60;->b(Ljava/lang/String;Lvr2;Lml4;ZZLtg7;Lbt3;Lzs3;ZIILm78;Lvr2;Lap4;Lky6;Lfw0;Lyt2;I)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_5
    move-object/from16 v16, v1

    .line 221
    .line 222
    invoke-virtual/range {v16 .. v16}, Lyt2;->Y()V

    .line 223
    .line 224
    .line 225
    :goto_3
    sget-object v0, Lvs7;->a:Lvs7;

    .line 226
    .line 227
    return-object v0
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
