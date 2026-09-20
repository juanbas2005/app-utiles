.class public final synthetic Lgi;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic A:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JZLml4;Lx35;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgi;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lgi;->x:J

    .line 8
    .line 9
    iput-boolean p3, p0, Lgi;->y:Z

    .line 10
    .line 11
    iput-object p4, p0, Lgi;->z:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lgi;->A:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;ZI)V
    .locals 0

    .line 16
    const/4 p6, 0x1

    iput p6, p0, Lgi;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lgi;->x:J

    iput-object p4, p0, Lgi;->A:Ljava/lang/Object;

    iput-boolean p5, p0, Lgi;->y:Z

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lgi;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object v3, v0, Lgi;->A:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lgi;->z:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v6, v4

    .line 16
    check-cast v6, Ljava/lang/String;

    .line 17
    .line 18
    move-object v9, v3

    .line 19
    check-cast v9, Ljava/lang/String;

    .line 20
    .line 21
    move-object/from16 v11, p1

    .line 22
    .line 23
    check-cast v11, Lyt2;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v5}, Lb85;->v(I)I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    iget-wide v7, v0, Lgi;->x:J

    .line 37
    .line 38
    iget-boolean v10, v0, Lgi;->y:Z

    .line 39
    .line 40
    invoke-static/range {v6 .. v12}, Ld36;->a(Ljava/lang/String;JLjava/lang/String;ZLyt2;I)V

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :pswitch_0
    move-object v13, v4

    .line 45
    check-cast v13, Lml4;

    .line 46
    .line 47
    check-cast v3, Lx35;

    .line 48
    .line 49
    move-object/from16 v1, p1

    .line 50
    .line 51
    check-cast v1, Lyt2;

    .line 52
    .line 53
    move-object/from16 v4, p2

    .line 54
    .line 55
    check-cast v4, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    and-int/lit8 v6, v4, 0x3

    .line 62
    .line 63
    const/4 v7, 0x2

    .line 64
    const/4 v8, 0x0

    .line 65
    if-eq v6, v7, :cond_0

    .line 66
    .line 67
    move v6, v5

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move v6, v8

    .line 70
    :goto_0
    and-int/2addr v4, v5

    .line 71
    invoke-virtual {v1, v4, v6}, Lyt2;->V(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_8

    .line 76
    .line 77
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    iget-wide v9, v0, Lgi;->x:J

    .line 83
    .line 84
    cmp-long v4, v9, v6

    .line 85
    .line 86
    iget-boolean v0, v0, Lgi;->y:Z

    .line 87
    .line 88
    sget-object v6, Lay0;->a:Ld63;

    .line 89
    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    const v4, 0x34c4c6

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v4}, Lyt2;->e0(I)V

    .line 96
    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    sget-object v4, Lsg3;->b:Lrr;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    sget-object v4, Lsg3;->a:Lrr;

    .line 104
    .line 105
    :goto_1
    invoke-static {v9, v10}, Lpx1;->b(J)F

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    invoke-static {v9, v10}, Lpx1;->a(J)F

    .line 110
    .line 111
    .line 112
    move-result v15

    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/16 v18, 0xc

    .line 116
    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    invoke-static/range {v13 .. v18}, Lyu6;->j(Lml4;FFFFI)Lml4;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    sget-object v9, Lxb4;->H:Lh80;

    .line 124
    .line 125
    invoke-static {v4, v9, v1, v8}, Lca6;->a(Ltr;Lh80;Lyt2;I)Lea6;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    iget-wide v9, v1, Lyt2;->T:J

    .line 130
    .line 131
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    invoke-virtual {v1}, Lyt2;->m()Lvf5;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    invoke-static {v1, v7}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    sget-object v11, Lux0;->d:Ltx0;

    .line 144
    .line 145
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    sget-object v11, Ltx0;->b:Lvy0;

    .line 149
    .line 150
    invoke-virtual {v1}, Lyt2;->i0()V

    .line 151
    .line 152
    .line 153
    iget-boolean v12, v1, Lyt2;->S:Z

    .line 154
    .line 155
    if-eqz v12, :cond_2

    .line 156
    .line 157
    invoke-virtual {v1, v11}, Lyt2;->l(Lsr2;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_2
    invoke-virtual {v1}, Lyt2;->r0()V

    .line 162
    .line 163
    .line 164
    :goto_2
    sget-object v11, Ltx0;->f:Lck;

    .line 165
    .line 166
    invoke-static {v11, v1, v4}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    sget-object v4, Ltx0;->e:Lck;

    .line 170
    .line 171
    invoke-static {v4, v1, v10}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    sget-object v9, Ltx0;->g:Lck;

    .line 179
    .line 180
    invoke-static {v9, v1, v4}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v4, Ltx0;->h:Lce;

    .line 184
    .line 185
    invoke-static {v1, v4}, Lg75;->O(Lyt2;Lvr2;)V

    .line 186
    .line 187
    .line 188
    sget-object v4, Ltx0;->d:Lck;

    .line 189
    .line 190
    invoke-static {v4, v1, v7}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v3}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    if-nez v4, :cond_3

    .line 202
    .line 203
    if-ne v7, v6, :cond_4

    .line 204
    .line 205
    :cond_3
    new-instance v7, Lhi;

    .line 206
    .line 207
    invoke-direct {v7, v3, v8}, Lhi;-><init>(Lx35;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v7}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_4
    check-cast v7, Lsr2;

    .line 214
    .line 215
    const/4 v3, 0x6

    .line 216
    sget-object v4, Ljl4;->w:Ljl4;

    .line 217
    .line 218
    invoke-static {v4, v7, v0, v1, v3}, Lr16;->r(Lml4;Lsr2;ZLyt2;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v5}, Lyt2;->r(Z)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v8}, Lyt2;->r(Z)V

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_5
    const v4, 0x42f938

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v4}, Lyt2;->e0(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v3}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    if-nez v4, :cond_6

    .line 243
    .line 244
    if-ne v7, v6, :cond_7

    .line 245
    .line 246
    :cond_6
    new-instance v7, Lhi;

    .line 247
    .line 248
    invoke-direct {v7, v3, v5}, Lhi;-><init>(Lx35;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v7}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_7
    check-cast v7, Lsr2;

    .line 255
    .line 256
    invoke-static {v13, v7, v0, v1, v8}, Lr16;->r(Lml4;Lsr2;ZLyt2;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v8}, Lyt2;->r(Z)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_8
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 264
    .line 265
    .line 266
    :goto_3
    return-object v2

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
