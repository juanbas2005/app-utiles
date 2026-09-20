.class public final synthetic Lwf1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, Lwf1;->w:I

    .line 2
    .line 3
    iput-object p3, p0, Lwf1;->x:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lwf1;->y:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
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

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 11
    iput p3, p0, Lwf1;->w:I

    iput-object p1, p0, Lwf1;->x:Ljava/lang/String;

    iput-object p2, p0, Lwf1;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwf1;->w:I

    .line 4
    .line 5
    iget-object v2, v0, Lwf1;->x:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    sget-object v4, Ljl4;->w:Ljl4;

    .line 9
    .line 10
    iget-object v5, v0, Lwf1;->y:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    sget-object v7, Lvs7;->a:Lvs7;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v14, p1

    .line 20
    .line 21
    check-cast v14, Lyt2;

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    and-int/lit8 v2, v1, 0x3

    .line 32
    .line 33
    if-eq v2, v3, :cond_0

    .line 34
    .line 35
    move v2, v8

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v2, v6

    .line 38
    :goto_0
    and-int/2addr v1, v8

    .line 39
    invoke-virtual {v14, v1, v2}, Lyt2;->V(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iget-object v9, v0, Lwf1;->x:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v10, v0, Lwf1;->y:Ljava/lang/String;

    .line 48
    .line 49
    const/high16 v0, 0x41c80000    # 25.0f

    .line 50
    .line 51
    if-eqz v9, :cond_2

    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const v1, -0x4954cf06

    .line 61
    .line 62
    .line 63
    invoke-virtual {v14, v1}, Lyt2;->e0(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Ljb5;->q()Lx83;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v1, v14}, Lo55;->q(Lx83;Lyt2;)Lk38;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-static {}, Ljb5;->q()Lx83;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1, v14}, Lo55;->q(Lx83;Lyt2;)Lk38;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    invoke-static {v4, v0}, Lyu6;->l(Lml4;F)Lml4;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v1, Lq96;->a:Lo96;

    .line 87
    .line 88
    invoke-static {v0, v1}, Lwe;->f(Lml4;Lpq6;)Lml4;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-static/range {v9 .. v14}, Lwn6;->a(Ljava/lang/Object;Ljava/lang/String;Lml4;Lvb5;Lvb5;Lyt2;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v14, v6}, Lyt2;->r(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    :goto_1
    const v1, -0x4959e544

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14, v1}, Lyt2;->e0(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {}, Ljb5;->q()Lx83;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    sget-object v1, Lch4;->b:Lt37;

    .line 110
    .line 111
    invoke-virtual {v14, v1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Lzg4;

    .line 116
    .line 117
    iget-object v1, v1, Lzg4;->a:Lqt0;

    .line 118
    .line 119
    iget-wide v12, v1, Lqt0;->q:J

    .line 120
    .line 121
    invoke-static {v4, v0}, Lyu6;->l(Lml4;F)Lml4;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    const/16 v15, 0x180

    .line 126
    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    invoke-static/range {v9 .. v16}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v14, v6}, Lyt2;->r(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    invoke-virtual {v14}, Lyt2;->Y()V

    .line 137
    .line 138
    .line 139
    :goto_2
    return-object v7

    .line 140
    :pswitch_0
    move-object/from16 v0, p1

    .line 141
    .line 142
    check-cast v0, Lyt2;

    .line 143
    .line 144
    move-object/from16 v1, p2

    .line 145
    .line 146
    check-cast v1, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {v8}, Lb85;->v(I)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-static {v2, v5, v0, v1}, Lxz5;->c(Ljava/lang/String;Ljava/lang/String;Lyt2;I)V

    .line 156
    .line 157
    .line 158
    return-object v7

    .line 159
    :pswitch_1
    move-object/from16 v0, p1

    .line 160
    .line 161
    check-cast v0, Lyt2;

    .line 162
    .line 163
    move-object/from16 v1, p2

    .line 164
    .line 165
    check-cast v1, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v8}, Lb85;->v(I)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-static {v2, v5, v0, v1}, Lrs4;->o(Ljava/lang/String;Ljava/lang/String;Lyt2;I)V

    .line 175
    .line 176
    .line 177
    return-object v7

    .line 178
    :pswitch_2
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, Lyt2;

    .line 181
    .line 182
    move-object/from16 v2, p2

    .line 183
    .line 184
    check-cast v2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    and-int/lit8 v9, v2, 0x3

    .line 191
    .line 192
    if-eq v9, v3, :cond_4

    .line 193
    .line 194
    move v3, v8

    .line 195
    goto :goto_3

    .line 196
    :cond_4
    move v3, v6

    .line 197
    :goto_3
    and-int/2addr v2, v8

    .line 198
    invoke-virtual {v1, v2, v3}, Lyt2;->V(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    iget-object v8, v0, Lwf1;->x:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v1, v8}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    invoke-virtual {v1, v5}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    or-int/2addr v0, v2

    .line 215
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-nez v0, :cond_5

    .line 220
    .line 221
    sget-object v0, Lay0;->a:Ld63;

    .line 222
    .line 223
    if-ne v2, v0, :cond_6

    .line 224
    .line 225
    :cond_5
    new-instance v2, Lbg1;

    .line 226
    .line 227
    invoke-direct {v2, v8, v5, v6}, Lbg1;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v2}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_6
    check-cast v2, Lvr2;

    .line 234
    .line 235
    invoke-static {v4, v6, v2}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    const/16 v29, 0x0

    .line 240
    .line 241
    const v30, 0x3fffc

    .line 242
    .line 243
    .line 244
    const-wide/16 v10, 0x0

    .line 245
    .line 246
    const-wide/16 v12, 0x0

    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const/4 v15, 0x0

    .line 250
    const-wide/16 v16, 0x0

    .line 251
    .line 252
    const/16 v18, 0x0

    .line 253
    .line 254
    const/16 v19, 0x0

    .line 255
    .line 256
    const-wide/16 v20, 0x0

    .line 257
    .line 258
    const/16 v22, 0x0

    .line 259
    .line 260
    const/16 v23, 0x0

    .line 261
    .line 262
    const/16 v24, 0x0

    .line 263
    .line 264
    const/16 v25, 0x0

    .line 265
    .line 266
    const/16 v26, 0x0

    .line 267
    .line 268
    const/16 v28, 0x0

    .line 269
    .line 270
    move-object/from16 v27, v1

    .line 271
    .line 272
    invoke-static/range {v8 .. v30}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_7
    move-object/from16 v27, v1

    .line 277
    .line 278
    invoke-virtual/range {v27 .. v27}, Lyt2;->Y()V

    .line 279
    .line 280
    .line 281
    :goto_4
    return-object v7

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
