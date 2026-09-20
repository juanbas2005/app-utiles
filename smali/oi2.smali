.class public final Loi2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldi2;

.field public final synthetic y:Lhs2;


# direct methods
.method public synthetic constructor <init>(Ldi2;Lhs2;I)V
    .locals 0

    .line 1
    iput p3, p0, Loi2;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Loi2;->x:Ldi2;

    .line 4
    .line 5
    iput-object p2, p0, Loi2;->y:Lhs2;

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
.end method


# virtual methods
.method public final a(Lfi2;Lf61;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Loi2;->w:I

    .line 8
    .line 9
    sget-object v4, Lvs7;->a:Lvs7;

    .line 10
    .line 11
    iget-object v5, v0, Loi2;->y:Lhs2;

    .line 12
    .line 13
    iget-object v6, v0, Loi2;->x:Ldi2;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    sget-object v9, Lp81;->w:Lp81;

    .line 19
    .line 20
    const/high16 v10, -0x80000000

    .line 21
    .line 22
    const/4 v11, 0x1

    .line 23
    const/4 v12, 0x2

    .line 24
    const/4 v13, 0x0

    .line 25
    packed-switch v3, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    instance-of v3, v2, Lri2;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    move-object v3, v2

    .line 33
    check-cast v3, Lri2;

    .line 34
    .line 35
    iget v14, v3, Lri2;->A:I

    .line 36
    .line 37
    and-int v15, v14, v10

    .line 38
    .line 39
    if-eqz v15, :cond_0

    .line 40
    .line 41
    sub-int/2addr v14, v10

    .line 42
    iput v14, v3, Lri2;->A:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v3, Lri2;

    .line 46
    .line 47
    invoke-direct {v3, v0, v2}, Lri2;-><init>(Loi2;Lf61;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object v0, v3, Lri2;->z:Ljava/lang/Object;

    .line 51
    .line 52
    iget v2, v3, Lri2;->A:I

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    if-eq v2, v11, :cond_2

    .line 57
    .line 58
    if-ne v2, v12, :cond_1

    .line 59
    .line 60
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_1
    invoke-static {v8}, Lh;->s(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object v4, v13

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    iget v7, v3, Lri2;->D:I

    .line 70
    .line 71
    iget-object v1, v3, Lri2;->C:Lfi2;

    .line 72
    .line 73
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, v3, Lri2;->C:Lfi2;

    .line 81
    .line 82
    iput v7, v3, Lri2;->D:I

    .line 83
    .line 84
    iput v11, v3, Lri2;->A:I

    .line 85
    .line 86
    invoke-static {v6, v1, v3}, Lgr8;->x(Ldi2;Lfi2;Lh61;)Ljava/io/Serializable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v9, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    :goto_1
    check-cast v0, Ljava/lang/Throwable;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    iput-object v13, v3, Lri2;->C:Lfi2;

    .line 98
    .line 99
    iput v7, v3, Lri2;->D:I

    .line 100
    .line 101
    iput v12, v3, Lri2;->A:I

    .line 102
    .line 103
    invoke-interface {v5, v1, v0, v3}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-ne v0, v9, :cond_5

    .line 108
    .line 109
    :goto_2
    move-object v4, v9

    .line 110
    :cond_5
    :goto_3
    return-object v4

    .line 111
    :pswitch_0
    instance-of v3, v2, Lni2;

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    move-object v3, v2

    .line 116
    check-cast v3, Lni2;

    .line 117
    .line 118
    iget v14, v3, Lni2;->A:I

    .line 119
    .line 120
    and-int v15, v14, v10

    .line 121
    .line 122
    if-eqz v15, :cond_6

    .line 123
    .line 124
    sub-int/2addr v14, v10

    .line 125
    iput v14, v3, Lni2;->A:I

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    new-instance v3, Lni2;

    .line 129
    .line 130
    invoke-direct {v3, v0, v2}, Lni2;-><init>(Loi2;Lf61;)V

    .line 131
    .line 132
    .line 133
    :goto_4
    iget-object v0, v3, Lni2;->z:Ljava/lang/Object;

    .line 134
    .line 135
    iget v2, v3, Lni2;->A:I

    .line 136
    .line 137
    const/4 v10, 0x3

    .line 138
    if-eqz v2, :cond_a

    .line 139
    .line 140
    if-eq v2, v11, :cond_9

    .line 141
    .line 142
    if-eq v2, v12, :cond_8

    .line 143
    .line 144
    if-ne v2, v10, :cond_7

    .line 145
    .line 146
    iget-object v1, v3, Lni2;->D:Ljava/io/Serializable;

    .line 147
    .line 148
    check-cast v1, Lvd6;

    .line 149
    .line 150
    :try_start_0
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    goto :goto_6

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    goto :goto_7

    .line 156
    :cond_7
    invoke-static {v8}, Lh;->s(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    move-object v4, v13

    .line 160
    goto :goto_a

    .line 161
    :cond_8
    iget-object v1, v3, Lni2;->D:Ljava/io/Serializable;

    .line 162
    .line 163
    check-cast v1, Ljava/lang/Throwable;

    .line 164
    .line 165
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_b

    .line 169
    :cond_9
    iget v7, v3, Lni2;->E:I

    .line 170
    .line 171
    iget-object v1, v3, Lni2;->C:Lfi2;

    .line 172
    .line 173
    :try_start_1
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    move-object v1, v0

    .line 179
    goto :goto_8

    .line 180
    :cond_a
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :try_start_2
    iput-object v1, v3, Lni2;->C:Lfi2;

    .line 184
    .line 185
    iput v7, v3, Lni2;->E:I

    .line 186
    .line 187
    iput v11, v3, Lni2;->A:I

    .line 188
    .line 189
    invoke-interface {v6, v1, v3}, Ldi2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 193
    if-ne v0, v9, :cond_b

    .line 194
    .line 195
    goto :goto_9

    .line 196
    :cond_b
    :goto_5
    new-instance v2, Lvd6;

    .line 197
    .line 198
    iget-object v0, v3, Lh61;->x:Le81;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-direct {v2, v1, v0}, Lvd6;-><init>(Lfi2;Le81;)V

    .line 204
    .line 205
    .line 206
    :try_start_3
    iput-object v13, v3, Lni2;->C:Lfi2;

    .line 207
    .line 208
    iput-object v2, v3, Lni2;->D:Ljava/io/Serializable;

    .line 209
    .line 210
    iput v7, v3, Lni2;->E:I

    .line 211
    .line 212
    iput v10, v3, Lni2;->A:I

    .line 213
    .line 214
    invoke-interface {v5, v2, v13, v3}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 218
    if-ne v0, v9, :cond_c

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_c
    move-object v1, v2

    .line 222
    :goto_6
    invoke-virtual {v1}, Lh61;->t()V

    .line 223
    .line 224
    .line 225
    goto :goto_a

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    move-object v1, v2

    .line 228
    :goto_7
    invoke-virtual {v1}, Lh61;->t()V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :goto_8
    new-instance v0, Lth7;

    .line 233
    .line 234
    invoke-direct {v0, v1}, Lth7;-><init>(Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    iput-object v13, v3, Lni2;->C:Lfi2;

    .line 238
    .line 239
    iput-object v1, v3, Lni2;->D:Ljava/io/Serializable;

    .line 240
    .line 241
    iput v7, v3, Lni2;->E:I

    .line 242
    .line 243
    iput v12, v3, Lni2;->A:I

    .line 244
    .line 245
    invoke-static {v0, v5, v1, v3}, Lpv8;->l(Lth7;Lhs2;Ljava/lang/Throwable;Lh61;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-ne v0, v9, :cond_d

    .line 250
    .line 251
    :goto_9
    move-object v4, v9

    .line 252
    :goto_a
    return-object v4

    .line 253
    :cond_d
    :goto_b
    throw v1

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
