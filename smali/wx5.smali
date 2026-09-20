.class public final Lwx5;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic A:I

.field public B:I

.field public synthetic C:Lyg5;

.field public final synthetic D:Lhs2;


# direct methods
.method public synthetic constructor <init>(Lhs2;Lf61;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwx5;->A:I

    .line 2
    .line 3
    iput-object p1, p0, Lwx5;->D:Lhs2;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lwx5;->A:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    sget-object v3, Lvs7;->a:Lvs7;

    .line 7
    .line 8
    iget-object v4, v1, Lwx5;->D:Lhs2;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lp81;->w:Lp81;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v11, v1, Lwx5;->C:Lyg5;

    .line 20
    .line 21
    iget v0, v1, Lwx5;->B:I

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-ne v0, v7, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v5}, Lh;->s(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v3, v8

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v11, Lyg5;->w:Ljava/lang/Object;

    .line 40
    .line 41
    new-instance v9, Lwg6;

    .line 42
    .line 43
    const/16 v15, 0x8

    .line 44
    .line 45
    const/16 v16, 0x1

    .line 46
    .line 47
    const/4 v10, 0x1

    .line 48
    const-class v12, Lyg5;

    .line 49
    .line 50
    const-string v13, "proceed"

    .line 51
    .line 52
    const-string v14, "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 53
    .line 54
    invoke-direct/range {v9 .. v16}, Lwg6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    iput-object v8, v1, Lwx5;->C:Lyg5;

    .line 58
    .line 59
    iput v7, v1, Lwx5;->B:I

    .line 60
    .line 61
    invoke-interface {v4, v0, v9, v1}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne v0, v6, :cond_2

    .line 66
    .line 67
    move-object v3, v6

    .line 68
    :cond_2
    :goto_0
    return-object v3

    .line 69
    :pswitch_0
    iget-object v9, v1, Lwx5;->C:Lyg5;

    .line 70
    .line 71
    iget v0, v1, Lwx5;->B:I

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    if-eq v0, v7, :cond_4

    .line 76
    .line 77
    if-ne v0, v2, :cond_3

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v0, p1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    invoke-static {v5}, Lh;->s(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object v3, v8

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    :try_start_0
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    goto :goto_1

    .line 96
    :cond_5
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :try_start_1
    iput-object v9, v1, Lwx5;->C:Lyg5;

    .line 100
    .line 101
    iput v7, v1, Lwx5;->B:I

    .line 102
    .line 103
    invoke-virtual {v9, v1}, Lyg5;->c(Lf61;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    if-ne v0, v6, :cond_7

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :goto_1
    iget-object v5, v9, Lyg5;->w:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v5, Ly53;

    .line 113
    .line 114
    sget-object v7, Lg43;->a:Lcc4;

    .line 115
    .line 116
    new-instance v7, Lf43;

    .line 117
    .line 118
    invoke-direct {v7, v5}, Lf43;-><init>(Ly53;)V

    .line 119
    .line 120
    .line 121
    iput-object v8, v1, Lwx5;->C:Lyg5;

    .line 122
    .line 123
    iput v2, v1, Lwx5;->B:I

    .line 124
    .line 125
    invoke-interface {v4, v7, v0, v1}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-ne v0, v6, :cond_6

    .line 130
    .line 131
    :goto_2
    move-object v3, v6

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    :goto_3
    check-cast v0, Ljava/lang/Throwable;

    .line 134
    .line 135
    if-nez v0, :cond_8

    .line 136
    .line 137
    :cond_7
    :goto_4
    return-object v3

    .line 138
    :cond_8
    throw v0

    .line 139
    :pswitch_1
    iget-object v9, v1, Lwx5;->C:Lyg5;

    .line 140
    .line 141
    iget v0, v1, Lwx5;->B:I

    .line 142
    .line 143
    if-eqz v0, :cond_b

    .line 144
    .line 145
    if-eq v0, v7, :cond_a

    .line 146
    .line 147
    if-ne v0, v2, :cond_9

    .line 148
    .line 149
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    move-object/from16 v0, p1

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_9
    invoke-static {v5}, Lh;->s(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    move-object v3, v8

    .line 159
    goto :goto_8

    .line 160
    :cond_a
    :try_start_2
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 161
    .line 162
    .line 163
    goto :goto_8

    .line 164
    :catchall_1
    move-exception v0

    .line 165
    goto :goto_5

    .line 166
    :cond_b
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :try_start_3
    iput-object v9, v1, Lwx5;->C:Lyg5;

    .line 170
    .line 171
    iput v7, v1, Lwx5;->B:I

    .line 172
    .line 173
    invoke-virtual {v9, v1}, Lyg5;->c(Lf61;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 177
    if-ne v0, v6, :cond_d

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :goto_5
    iget-object v5, v9, Lyg5;->w:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v5, Ll43;

    .line 183
    .line 184
    invoke-virtual {v5}, Ll43;->c()Lx53;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    iput-object v8, v1, Lwx5;->C:Lyg5;

    .line 189
    .line 190
    iput v2, v1, Lwx5;->B:I

    .line 191
    .line 192
    invoke-interface {v4, v5, v0, v1}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-ne v0, v6, :cond_c

    .line 197
    .line 198
    :goto_6
    move-object v3, v6

    .line 199
    goto :goto_8

    .line 200
    :cond_c
    :goto_7
    check-cast v0, Ljava/lang/Throwable;

    .line 201
    .line 202
    if-nez v0, :cond_e

    .line 203
    .line 204
    :cond_d
    :goto_8
    return-object v3

    .line 205
    :cond_e
    throw v0

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
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
.end method

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwx5;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lwx5;->D:Lhs2;

    .line 6
    .line 7
    check-cast p1, Lyg5;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p3, Lf61;

    .line 13
    .line 14
    new-instance p2, Lwx5;

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-direct {p2, p0, p3, v0}, Lwx5;-><init>(Lhs2;Lf61;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p2, Lwx5;->C:Lyg5;

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Lwx5;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p3, Lf61;

    .line 28
    .line 29
    new-instance p2, Lwx5;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p2, p0, p3, v0}, Lwx5;-><init>(Lhs2;Lf61;I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p2, Lwx5;->C:Lyg5;

    .line 36
    .line 37
    invoke-virtual {p2, v1}, Lwx5;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_1
    check-cast p2, Lh63;

    .line 43
    .line 44
    check-cast p3, Lf61;

    .line 45
    .line 46
    new-instance p2, Lwx5;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-direct {p2, p0, p3, v0}, Lwx5;-><init>(Lhs2;Lf61;I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p2, Lwx5;->C:Lyg5;

    .line 53
    .line 54
    invoke-virtual {p2, v1}, Lwx5;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
