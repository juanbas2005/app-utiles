.class public final Ldu0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfi2;


# instance fields
.field public final synthetic w:Lad0;

.field public final synthetic x:I


# direct methods
.method public constructor <init>(Lad0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldu0;->w:Lad0;

    .line 5
    .line 6
    iput p2, p0, Ldu0;->x:I

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
.method public final k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcu0;

    .line 7
    .line 8
    iget v1, v0, Lcu0;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcu0;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcu0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcu0;-><init>(Ldu0;Lf61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcu0;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lcu0;->B:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    sget-object v3, Lvs7;->a:Lvs7;

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_9

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Lka3;

    .line 61
    .line 62
    iget v1, p0, Ldu0;->x:I

    .line 63
    .line 64
    invoke-direct {p2, v1, p1}, Lka3;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput v5, v0, Lcu0;->B:I

    .line 68
    .line 69
    iget-object p0, p0, Ldu0;->w:Lad0;

    .line 70
    .line 71
    invoke-interface {p0, v0, p2}, Lxk6;->b(Lf61;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-ne p0, v6, :cond_4

    .line 76
    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :cond_4
    :goto_1
    iput v4, v0, Lcu0;->B:I

    .line 80
    .line 81
    invoke-interface {v0}, Lf61;->r()Le81;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lr16;->x(Le81;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Lrc9;->a0(Lf61;)Lf61;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    instance-of p2, p1, Lsv1;

    .line 93
    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    move-object v2, p1

    .line 97
    check-cast v2, Lsv1;

    .line 98
    .line 99
    :cond_5
    if-nez v2, :cond_6

    .line 100
    .line 101
    :goto_2
    move-object p0, v3

    .line 102
    goto :goto_6

    .line 103
    :cond_6
    iget-object p1, v2, Lsv1;->z:Lh81;

    .line 104
    .line 105
    invoke-static {p1, p0}, Ltv1;->c(Lh81;Le81;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_7

    .line 110
    .line 111
    iput-object v3, v2, Lsv1;->B:Ljava/lang/Object;

    .line 112
    .line 113
    iput v5, v2, Lvv1;->y:I

    .line 114
    .line 115
    invoke-virtual {p1, p0, v2}, Lh81;->V(Le81;Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    new-instance p2, Lvf8;

    .line 120
    .line 121
    sget-object v0, Lvf8;->y:Ljv2;

    .line 122
    .line 123
    invoke-direct {p2, v0}, Lc1;-><init>(Ld81;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0, p2}, Le81;->X(Le81;)Le81;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    iput-object v3, v2, Lsv1;->B:Ljava/lang/Object;

    .line 131
    .line 132
    iput v5, v2, Lvv1;->y:I

    .line 133
    .line 134
    invoke-virtual {p1, p0, v2}, Lh81;->V(Le81;Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    iget-boolean p0, p2, Lvf8;->x:Z

    .line 138
    .line 139
    if-eqz p0, :cond_a

    .line 140
    .line 141
    invoke-static {}, Lih7;->a()Li72;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    iget-object p1, p0, Li72;->A:Las;

    .line 146
    .line 147
    if-eqz p1, :cond_8

    .line 148
    .line 149
    invoke-virtual {p1}, Las;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    goto :goto_3

    .line 154
    :cond_8
    move p1, v5

    .line 155
    :goto_3
    if-eqz p1, :cond_9

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_9
    iget-wide p1, p0, Li72;->y:J

    .line 159
    .line 160
    const-wide v0, 0x100000000L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    cmp-long p1, p1, v0

    .line 166
    .line 167
    if-ltz p1, :cond_b

    .line 168
    .line 169
    iput-object v3, v2, Lsv1;->B:Ljava/lang/Object;

    .line 170
    .line 171
    iput v5, v2, Lvv1;->y:I

    .line 172
    .line 173
    invoke-virtual {p0, v2}, Li72;->p0(Lvv1;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    :goto_4
    move-object p0, v6

    .line 177
    goto :goto_6

    .line 178
    :cond_b
    invoke-virtual {p0, v5}, Li72;->q0(Z)V

    .line 179
    .line 180
    .line 181
    :try_start_0
    invoke-virtual {v2}, Lvv1;->run()V

    .line 182
    .line 183
    .line 184
    :cond_c
    invoke-virtual {p0}, Li72;->s0()Z

    .line 185
    .line 186
    .line 187
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    if-nez p1, :cond_c

    .line 189
    .line 190
    :goto_5
    invoke-virtual {p0, v5}, Li72;->o0(Z)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :catchall_0
    move-exception p1

    .line 195
    :try_start_1
    invoke-virtual {v2, p1}, Lvv1;->i(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :catchall_1
    move-exception p1

    .line 200
    invoke-virtual {p0, v5}, Li72;->o0(Z)V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :goto_6
    if-ne p0, v6, :cond_d

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_d
    move-object p0, v3

    .line 208
    :goto_7
    if-ne p0, v6, :cond_e

    .line 209
    .line 210
    :goto_8
    return-object v6

    .line 211
    :cond_e
    :goto_9
    return-object v3
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
