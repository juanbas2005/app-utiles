.class public final Lef5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfw5;


# instance fields
.field public A:Z

.field public B:J

.field public final w:Lpy6;

.field public final x:Ltc0;

.field public y:Lpi6;

.field public z:I


# direct methods
.method public constructor <init>(Lpy6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lef5;->w:Lpy6;

    .line 5
    .line 6
    invoke-interface {p1}, Lpy6;->c()Ltc0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lef5;->x:Ltc0;

    .line 11
    .line 12
    iget-object p1, p1, Ltc0;->w:Lpi6;

    .line 13
    .line 14
    iput-object p1, p0, Lef5;->y:Lpi6;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget p1, p1, Lpi6;->b:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, -0x1

    .line 22
    :goto_0
    iput p1, p0, Lef5;->z:I

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lef5;->A:Z

    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public final y(Ltc0;J)J
    .locals 11

    .line 1
    iget-boolean v0, p0, Lef5;->A:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_a

    .line 6
    .line 7
    cmp-long v0, p2, v1

    .line 8
    .line 9
    if-ltz v0, :cond_9

    .line 10
    .line 11
    iget-object v3, p0, Lef5;->y:Lpi6;

    .line 12
    .line 13
    iget-object v4, p0, Lef5;->x:Ltc0;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    iget-object v5, v4, Ltc0;->w:Lpi6;

    .line 18
    .line 19
    if-ne v3, v5, :cond_0

    .line 20
    .line 21
    iget v3, p0, Lef5;->z:I

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget v5, v5, Lpi6;->b:I

    .line 27
    .line 28
    if-ne v3, v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p0, "Peek source is invalid because upstream source was used"

    .line 32
    .line 33
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-wide v1

    .line 37
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 38
    .line 39
    return-wide v1

    .line 40
    :cond_2
    iget-wide v5, p0, Lef5;->B:J

    .line 41
    .line 42
    const-wide/16 v7, 0x1

    .line 43
    .line 44
    add-long/2addr v5, v7

    .line 45
    iget-object v0, p0, Lef5;->w:Lpy6;

    .line 46
    .line 47
    invoke-interface {v0, v5, v6}, Lpy6;->j(J)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    const-wide/16 p0, -0x1

    .line 54
    .line 55
    return-wide p0

    .line 56
    :cond_3
    iget-object v0, p0, Lef5;->y:Lpi6;

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v4, Ltc0;->w:Lpi6;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iput-object v0, p0, Lef5;->y:Lpi6;

    .line 65
    .line 66
    iget v0, v0, Lpi6;->b:I

    .line 67
    .line 68
    iput v0, p0, Lef5;->z:I

    .line 69
    .line 70
    :cond_4
    iget-wide v5, v4, Ltc0;->y:J

    .line 71
    .line 72
    iget-wide v7, p0, Lef5;->B:J

    .line 73
    .line 74
    sub-long/2addr v5, v7

    .line 75
    invoke-static {p2, p3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide p2

    .line 79
    iget-wide v7, p0, Lef5;->B:J

    .line 80
    .line 81
    add-long v9, v7, p2

    .line 82
    .line 83
    iget-wide v5, v4, Ltc0;->y:J

    .line 84
    .line 85
    invoke-static/range {v5 .. v10}, Lrj1;->o(JJJ)V

    .line 86
    .line 87
    .line 88
    cmp-long v0, v7, v9

    .line 89
    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    sub-long/2addr v9, v7

    .line 94
    iget-wide v5, p1, Ltc0;->y:J

    .line 95
    .line 96
    add-long/2addr v5, v9

    .line 97
    iput-wide v5, p1, Ltc0;->y:J

    .line 98
    .line 99
    iget-object v0, v4, Ltc0;->w:Lpi6;

    .line 100
    .line 101
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget v3, v0, Lpi6;->c:I

    .line 105
    .line 106
    iget v4, v0, Lpi6;->b:I

    .line 107
    .line 108
    sub-int/2addr v3, v4

    .line 109
    int-to-long v3, v3

    .line 110
    cmp-long v5, v7, v3

    .line 111
    .line 112
    if-ltz v5, :cond_6

    .line 113
    .line 114
    sub-long/2addr v7, v3

    .line 115
    iget-object v0, v0, Lpi6;->f:Lpi6;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    :goto_2
    cmp-long v3, v9, v1

    .line 119
    .line 120
    if-lez v3, :cond_8

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lpi6;->e()Lpi6;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget v4, v3, Lpi6;->b:I

    .line 130
    .line 131
    long-to-int v5, v7

    .line 132
    add-int/2addr v4, v5

    .line 133
    iput v4, v3, Lpi6;->b:I

    .line 134
    .line 135
    long-to-int v5, v9

    .line 136
    add-int/2addr v4, v5

    .line 137
    iget v5, v3, Lpi6;->c:I

    .line 138
    .line 139
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    iput v4, v3, Lpi6;->c:I

    .line 144
    .line 145
    iget-object v4, p1, Ltc0;->w:Lpi6;

    .line 146
    .line 147
    if-nez v4, :cond_7

    .line 148
    .line 149
    iput-object v3, p1, Ltc0;->w:Lpi6;

    .line 150
    .line 151
    iput-object v3, p1, Ltc0;->x:Lpi6;

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    iget-object v4, p1, Ltc0;->x:Lpi6;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v3}, Lpi6;->d(Lpi6;)V

    .line 160
    .line 161
    .line 162
    iput-object v3, p1, Ltc0;->x:Lpi6;

    .line 163
    .line 164
    :goto_3
    iget v4, v3, Lpi6;->c:I

    .line 165
    .line 166
    iget v3, v3, Lpi6;->b:I

    .line 167
    .line 168
    sub-int/2addr v4, v3

    .line 169
    int-to-long v3, v4

    .line 170
    sub-long/2addr v9, v3

    .line 171
    iget-object v0, v0, Lpi6;->f:Lpi6;

    .line 172
    .line 173
    move-wide v7, v1

    .line 174
    goto :goto_2

    .line 175
    :cond_8
    :goto_4
    iget-wide v0, p0, Lef5;->B:J

    .line 176
    .line 177
    add-long/2addr v0, p2

    .line 178
    iput-wide v0, p0, Lef5;->B:J

    .line 179
    .line 180
    return-wide p2

    .line 181
    :cond_9
    const-string p0, "byteCount ("

    .line 182
    .line 183
    const-string p1, ") < 0"

    .line 184
    .line 185
    invoke-static {p2, p3, p0, p1}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    return-wide v1

    .line 193
    :cond_a
    const-string p0, "Source is closed."

    .line 194
    .line 195
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-wide v1
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
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
