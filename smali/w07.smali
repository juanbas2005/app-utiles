.class public final Lw07;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public A:Ld17;

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:I

.field public final synthetic E:Ld17;

.field public final synthetic F:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ld17;Ljava/lang/String;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw07;->E:Ld17;

    .line 2
    .line 3
    iput-object p2, p0, Lw07;->F:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La97;-><init>(ILf61;)V

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lo81;

    .line 2
    .line 3
    check-cast p2, Lf61;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lw07;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lw07;

    .line 10
    .line 11
    sget-object p1, Lvs7;->a:Lvs7;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lw07;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 1

    .line 1
    new-instance p2, Lw07;

    .line 2
    .line 3
    iget-object v0, p0, Lw07;->E:Ld17;

    .line 4
    .line 5
    iget-object p0, p0, Lw07;->F:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Lw07;-><init>(Ld17;Ljava/lang/String;Lf61;)V

    .line 8
    .line 9
    .line 10
    return-object p2
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

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lw07;->D:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    sget-object v5, Lp81;->w:Lp81;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    if-eq v0, v3, :cond_2

    .line 12
    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lw07;->C:Ljava/lang/String;

    .line 18
    .line 19
    check-cast v0, Lw07;

    .line 20
    .line 21
    iget-object p0, p0, Lw07;->A:Ld17;

    .line 22
    .line 23
    check-cast p0, Lf61;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v4

    .line 36
    :cond_1
    iget-object v0, p0, Lw07;->C:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p0, Lw07;->B:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, Lw07;->A:Ld17;

    .line 41
    .line 42
    :try_start_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v0, p0, Lw07;->B:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p0, Lw07;->A:Ld17;

    .line 49
    .line 50
    :try_start_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lw07;->E:Ld17;

    .line 58
    .line 59
    iget-object v0, p0, Lw07;->F:Ljava/lang/String;

    .line 60
    .line 61
    :try_start_3
    iput-object p1, p0, Lw07;->A:Ld17;

    .line 62
    .line 63
    iput-object v0, p0, Lw07;->B:Ljava/lang/String;

    .line 64
    .line 65
    iput v3, p0, Lw07;->D:I

    .line 66
    .line 67
    invoke-static {p1, p0}, Ld17;->a(Ld17;Lh61;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-ne v3, v5, :cond_4

    .line 72
    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_4
    move-object v12, v3

    .line 76
    move-object v3, p1

    .line 77
    move-object p1, v12

    .line 78
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 79
    .line 80
    iput-object v3, p0, Lw07;->A:Ld17;

    .line 81
    .line 82
    iput-object v0, p0, Lw07;->B:Ljava/lang/String;

    .line 83
    .line 84
    iput-object p1, p0, Lw07;->C:Ljava/lang/String;

    .line 85
    .line 86
    iput v2, p0, Lw07;->D:I

    .line 87
    .line 88
    iget-object v2, v3, Ld17;->c:Lh81;

    .line 89
    .line 90
    new-instance v6, Lk05;

    .line 91
    .line 92
    const/16 v7, 0x15

    .line 93
    .line 94
    invoke-direct {v6, v3, v4, v7}, Lk05;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v6, p0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-ne v2, v5, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    move-object v12, v0

    .line 105
    move-object v0, p1

    .line 106
    move-object p1, v2

    .line 107
    move-object v2, v12

    .line 108
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iget-object v3, v3, Ld17;->a:Lj77;

    .line 115
    .line 116
    const-string v6, "connection_spots"

    .line 117
    .line 118
    invoke-static {v3, v6}, Lf55;->i(Lj77;Ljava/lang/String;)Lhm5;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget-object v6, v3, Lhm5;->a:Lgm5;

    .line 123
    .line 124
    new-instance v7, Lmp1;

    .line 125
    .line 126
    iget-object v8, v3, Lhm5;->c:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v9, v6, Lgm5;->c:Lbm5;

    .line 129
    .line 130
    iget-object v9, v9, Lbm5;->v:Lku4;

    .line 131
    .line 132
    const/4 v10, 0x0

    .line 133
    invoke-direct {v7, v8, v9, v10}, Lmp1;-><init>(Ljava/lang/String;Lku4;I)V

    .line 134
    .line 135
    .line 136
    sget-object v8, Li53;->f:Li53;

    .line 137
    .line 138
    invoke-virtual {v7, v8}, Lim5;->e(Li53;)V

    .line 139
    .line 140
    .line 141
    new-instance v8, Lzc9;

    .line 142
    .line 143
    iget-object v10, v7, Lim5;->f:Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    const/4 v11, 0x4

    .line 146
    invoke-direct {v8, v9, v10, v11}, Lzc9;-><init>(Lku4;Ljava/util/Map;I)V

    .line 147
    .line 148
    .line 149
    const-string v9, "id"

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    sget-object v10, Lxd2;->x:Lxd2;

    .line 155
    .line 156
    invoke-virtual {v8, v9, v10, v2}, Lzc9;->a(Ljava/lang/String;Lxd2;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    if-nez p1, :cond_6

    .line 160
    .line 161
    const-string p1, "device_id"

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, p1, v10, v0}, Lzc9;->a(Ljava/lang/String;Lxd2;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_6
    sget-object p1, Lh66;->a:Lh66;

    .line 170
    .line 171
    iget-object v0, v3, Lhm5;->b:Ljava/lang/String;

    .line 172
    .line 173
    iput-object v4, p0, Lw07;->A:Ld17;

    .line 174
    .line 175
    iput-object v4, p0, Lw07;->B:Ljava/lang/String;

    .line 176
    .line 177
    iput-object v4, p0, Lw07;->C:Ljava/lang/String;

    .line 178
    .line 179
    iput v1, p0, Lw07;->D:I

    .line 180
    .line 181
    invoke-virtual {p1, v6, v0, v7, p0}, Lh66;->a(Lgm5;Ljava/lang/String;Lim5;Lf61;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-ne p0, v5, :cond_7

    .line 186
    .line 187
    :goto_2
    return-object v5

    .line 188
    :cond_7
    :goto_3
    sget-object p0, Lvs7;->a:Lvs7;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :catch_0
    move-exception p0

    .line 192
    new-instance p1, Lm66;

    .line 193
    .line 194
    invoke-direct {p1, p0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    move-object p0, p1

    .line 198
    :goto_4
    new-instance p1, Lo66;

    .line 199
    .line 200
    invoke-direct {p1, p0}, Lo66;-><init>(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object p1

    .line 204
    :catch_1
    move-exception p0

    .line 205
    throw p0
    .line 206
    .line 207
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
