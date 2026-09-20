.class public final Lgp2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnp2;


# direct methods
.method public synthetic constructor <init>(Lnp2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgp2;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lgp2;->x:Lnp2;

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
.method public a(Lu5;Lf61;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lgp2;->x:Lnp2;

    .line 6
    .line 7
    iget-object v3, v2, Lnp2;->e:Ld37;

    .line 8
    .line 9
    instance-of v4, v1, Lip2;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, Lip2;

    .line 15
    .line 16
    iget v5, v4, Lip2;->B:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lip2;->B:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lip2;

    .line 29
    .line 30
    invoke-direct {v4, v0, v1}, Lip2;-><init>(Lgp2;Lf61;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v4, Lip2;->z:Ljava/lang/Object;

    .line 34
    .line 35
    iget v1, v4, Lip2;->B:I

    .line 36
    .line 37
    const/4 v5, 0x6

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    if-ne v1, v8, :cond_1

    .line 44
    .line 45
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_2
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ld37;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lis7;

    .line 64
    .line 65
    iget-object v0, v0, Lis7;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lmo2;

    .line 68
    .line 69
    iget-boolean v0, v0, Lmo2;->e:Z

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    move v14, v8

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v14, v7

    .line 76
    :goto_1
    invoke-virtual {v3}, Ld37;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v9, v1

    .line 81
    check-cast v9, Lis7;

    .line 82
    .line 83
    iget-object v10, v9, Lis7;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v10, Lmo2;

    .line 86
    .line 87
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const/16 v23, 0x0

    .line 91
    .line 92
    const/16 v24, 0x3fef

    .line 93
    .line 94
    move-object v11, v9

    .line 95
    move-object v9, v10

    .line 96
    const/4 v10, 0x0

    .line 97
    move-object v12, v11

    .line 98
    const/4 v11, 0x0

    .line 99
    move-object v13, v12

    .line 100
    const/4 v12, 0x0

    .line 101
    move-object v15, v13

    .line 102
    const/4 v13, 0x0

    .line 103
    move-object/from16 v16, v15

    .line 104
    .line 105
    const/4 v15, 0x0

    .line 106
    move-object/from16 v17, v16

    .line 107
    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    move-object/from16 v18, v17

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    move-object/from16 v19, v18

    .line 115
    .line 116
    const/16 v18, 0x0

    .line 117
    .line 118
    move-object/from16 v20, v19

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    move-object/from16 v21, v20

    .line 123
    .line 124
    const/16 v20, 0x0

    .line 125
    .line 126
    move-object/from16 v22, v21

    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    move-object/from16 v25, v22

    .line 131
    .line 132
    const/16 v22, 0x0

    .line 133
    .line 134
    move-object/from16 v8, v25

    .line 135
    .line 136
    invoke-static/range {v9 .. v24}, Lmo2;->a(Lmo2;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLhv2;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Map;ZZI)Lmo2;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    invoke-static {v8, v9, v7, v6, v5}, Lis7;->a(Lis7;Ljava/lang/Object;ZLhv2;I)Lis7;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-virtual {v3, v1, v8}, Ld37;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_7

    .line 149
    .line 150
    if-eq v0, v14, :cond_6

    .line 151
    .line 152
    iget-object v0, v2, Lnp2;->b:Lsn2;

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    iput v1, v4, Lip2;->B:I

    .line 156
    .line 157
    check-cast v0, Llo2;

    .line 158
    .line 159
    iget-object v1, v0, Llo2;->b:Lh81;

    .line 160
    .line 161
    new-instance v8, Lju1;

    .line 162
    .line 163
    invoke-direct {v8, v0, v6, v5}, Lju1;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 164
    .line 165
    .line 166
    invoke-static {v1, v8, v4}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    sget-object v1, Lp81;->w:Lp81;

    .line 171
    .line 172
    if-ne v0, v1, :cond_4

    .line 173
    .line 174
    return-object v1

    .line 175
    :cond_4
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    :cond_5
    invoke-virtual {v3}, Ld37;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    move-object v1, v0

    .line 186
    check-cast v1, Lis7;

    .line 187
    .line 188
    iget-object v4, v1, Lis7;->a:Ljava/lang/Object;

    .line 189
    .line 190
    move-object v8, v4

    .line 191
    check-cast v8, Lmo2;

    .line 192
    .line 193
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/16 v23, 0x3fdf

    .line 199
    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v10, 0x0

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    const/4 v13, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    const/16 v20, 0x0

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    invoke-static/range {v8 .. v23}, Lmo2;->a(Lmo2;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLhv2;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Map;ZZI)Lmo2;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-static {v1, v4, v7, v6, v5}, Lis7;->a(Lis7;Ljava/lang/Object;ZLhv2;I)Lis7;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v3, v0, v1}, Ld37;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_5

    .line 231
    .line 232
    invoke-virtual {v2}, Lnp2;->g()V

    .line 233
    .line 234
    .line 235
    :cond_6
    sget-object v0, Lvs7;->a:Lvs7;

    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_7
    const/4 v8, 0x1

    .line 239
    goto/16 :goto_1
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

.method public final k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lgp2;->w:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lu5;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lgp2;->a(Lu5;Lf61;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    move-object/from16 v12, p1

    .line 20
    .line 21
    check-cast v12, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Lgp2;->x:Lnp2;

    .line 27
    .line 28
    iget-object v0, v0, Lnp2;->e:Ld37;

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0}, Ld37;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v2, v1

    .line 35
    check-cast v2, Lis7;

    .line 36
    .line 37
    iget-object v3, v2, Lis7;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lmo2;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v15, 0x0

    .line 45
    const/16 v16, 0x3bff

    .line 46
    .line 47
    move-object v4, v2

    .line 48
    const/4 v2, 0x0

    .line 49
    move-object v5, v1

    .line 50
    move-object v1, v3

    .line 51
    const/4 v3, 0x0

    .line 52
    move-object v6, v4

    .line 53
    const/4 v4, 0x0

    .line 54
    move-object v7, v5

    .line 55
    const/4 v5, 0x0

    .line 56
    move-object v8, v6

    .line 57
    const/4 v6, 0x0

    .line 58
    move-object v9, v7

    .line 59
    const/4 v7, 0x0

    .line 60
    move-object v10, v8

    .line 61
    const/4 v8, 0x0

    .line 62
    move-object v11, v9

    .line 63
    const/4 v9, 0x0

    .line 64
    move-object v13, v10

    .line 65
    const/4 v10, 0x0

    .line 66
    move-object v14, v11

    .line 67
    const/4 v11, 0x0

    .line 68
    move-object/from16 v17, v13

    .line 69
    .line 70
    const/4 v13, 0x0

    .line 71
    move-object/from16 v18, v14

    .line 72
    .line 73
    const/4 v14, 0x0

    .line 74
    move-object/from16 v19, v17

    .line 75
    .line 76
    move-object/from16 v17, v0

    .line 77
    .line 78
    move-object/from16 v0, v19

    .line 79
    .line 80
    move-object/from16 v19, v18

    .line 81
    .line 82
    invoke-static/range {v1 .. v16}, Lmo2;->a(Lmo2;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLhv2;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Map;ZZI)Lmo2;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const/4 v3, 0x6

    .line 87
    const/4 v4, 0x0

    .line 88
    invoke-static {v0, v1, v4, v2, v3}, Lis7;->a(Lis7;Ljava/lang/Object;ZLhv2;I)Lis7;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object/from16 v1, v17

    .line 93
    .line 94
    move-object/from16 v14, v19

    .line 95
    .line 96
    invoke-virtual {v1, v14, v0}, Ld37;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_0

    .line 101
    .line 102
    sget-object v0, Lvs7;->a:Lvs7;

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_0
    move-object v0, v1

    .line 106
    goto :goto_0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
