.class public abstract Lbg0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field public static final w:Lb94;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb94;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [B

    .line 5
    .line 6
    invoke-direct {v0, v1}, Lb94;-><init>([B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbg0;->w:Lb94;

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
.end method

.method public static d(Ljava/util/Iterator;I)Lbg0;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lbg0;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    ushr-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    invoke-static {p0, v0}, Lbg0;->d(Ljava/util/Iterator;I)Lbg0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sub-int/2addr p1, v0

    .line 18
    invoke-static {p0, p1}, Lbg0;->d(Ljava/util/Iterator;I)Lbg0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v1, p0}, Lbg0;->f(Lbg0;)Lbg0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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

.method public static p()Lag0;
    .locals 1

    .line 1
    new-instance v0, Lag0;

    .line 2
    .line 3
    invoke-direct {v0}, Lag0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
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


# virtual methods
.method public abstract A(Ljava/io/OutputStream;II)V
.end method

.method public final f(Lbg0;)Lbg0;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lbg0;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lbg0;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-long v2, v0

    .line 10
    int-to-long v4, v1

    .line 11
    add-long/2addr v2, v4

    .line 12
    const-wide/32 v4, 0x7fffffff

    .line 13
    .line 14
    .line 15
    cmp-long v2, v2, v4

    .line 16
    .line 17
    if-gez v2, :cond_8

    .line 18
    .line 19
    sget-object v0, Lj96;->D:[I

    .line 20
    .line 21
    instance-of v0, p0, Lj96;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move-object v0, p0

    .line 26
    check-cast v0, Lj96;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-virtual {p1}, Lbg0;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-virtual {p0}, Lbg0;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    invoke-virtual {p0}, Lbg0;->size()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p1}, Lbg0;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v1

    .line 53
    const/4 v1, 0x0

    .line 54
    const/16 v3, 0x80

    .line 55
    .line 56
    if-ge v2, v3, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lbg0;->size()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p1}, Lbg0;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int v3, v0, v2

    .line 67
    .line 68
    new-array v3, v3, [B

    .line 69
    .line 70
    invoke-virtual {p0, v1, v1, v0, v3}, Lbg0;->g(III[B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1, v0, v2, v3}, Lbg0;->g(III[B)V

    .line 74
    .line 75
    .line 76
    new-instance p0, Lb94;

    .line 77
    .line 78
    invoke-direct {p0, v3}, Lb94;-><init>([B)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_3
    if-eqz v0, :cond_4

    .line 83
    .line 84
    iget-object v4, v0, Lj96;->z:Lbg0;

    .line 85
    .line 86
    invoke-virtual {v4}, Lbg0;->size()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-virtual {p1}, Lbg0;->size()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    add-int/2addr v6, v5

    .line 95
    if-ge v6, v3, :cond_4

    .line 96
    .line 97
    invoke-virtual {v4}, Lbg0;->size()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-virtual {p1}, Lbg0;->size()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    add-int v3, p0, v2

    .line 106
    .line 107
    new-array v3, v3, [B

    .line 108
    .line 109
    invoke-virtual {v4, v1, v1, p0, v3}, Lbg0;->g(III[B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v1, p0, v2, v3}, Lbg0;->g(III[B)V

    .line 113
    .line 114
    .line 115
    new-instance p0, Lb94;

    .line 116
    .line 117
    invoke-direct {p0, v3}, Lb94;-><init>([B)V

    .line 118
    .line 119
    .line 120
    new-instance p1, Lj96;

    .line 121
    .line 122
    iget-object v0, v0, Lj96;->y:Lbg0;

    .line 123
    .line 124
    invoke-direct {p1, v0, p0}, Lj96;-><init>(Lbg0;Lbg0;)V

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_4
    if-eqz v0, :cond_5

    .line 129
    .line 130
    iget-object v1, v0, Lj96;->z:Lbg0;

    .line 131
    .line 132
    iget-object v3, v0, Lj96;->y:Lbg0;

    .line 133
    .line 134
    invoke-virtual {v3}, Lbg0;->l()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-virtual {v1}, Lbg0;->l()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-le v4, v5, :cond_5

    .line 143
    .line 144
    iget v0, v0, Lj96;->B:I

    .line 145
    .line 146
    invoke-virtual {p1}, Lbg0;->l()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-le v0, v4, :cond_5

    .line 151
    .line 152
    new-instance p0, Lj96;

    .line 153
    .line 154
    invoke-direct {p0, v1, p1}, Lj96;-><init>(Lbg0;Lbg0;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, Lj96;

    .line 158
    .line 159
    invoke-direct {p1, v3, p0}, Lj96;-><init>(Lbg0;Lbg0;)V

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_5
    invoke-virtual {p0}, Lbg0;->l()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-virtual {p1}, Lbg0;->l()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    add-int/lit8 v0, v0, 0x1

    .line 176
    .line 177
    sget-object v1, Lj96;->D:[I

    .line 178
    .line 179
    aget v0, v1, v0

    .line 180
    .line 181
    if-lt v2, v0, :cond_6

    .line 182
    .line 183
    new-instance v0, Lj96;

    .line 184
    .line 185
    invoke-direct {v0, p0, p1}, Lj96;-><init>(Lbg0;Lbg0;)V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :cond_6
    new-instance v0, Lay4;

    .line 190
    .line 191
    const/4 v1, 0x7

    .line 192
    invoke-direct {v0, v1}, Lay4;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, p0}, Lay4;->f(Lbg0;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, p1}, Lay4;->f(Lbg0;)V

    .line 199
    .line 200
    .line 201
    iget-object p0, v0, Lay4;->x:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p0, Ljava/util/Stack;

    .line 204
    .line 205
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, Lbg0;

    .line 210
    .line 211
    :goto_1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_7

    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Lbg0;

    .line 222
    .line 223
    new-instance v1, Lj96;

    .line 224
    .line 225
    invoke-direct {v1, v0, p1}, Lj96;-><init>(Lbg0;Lbg0;)V

    .line 226
    .line 227
    .line 228
    move-object p1, v1

    .line 229
    goto :goto_1

    .line 230
    :cond_7
    return-object p1

    .line 231
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 232
    .line 233
    new-instance p1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const/16 v2, 0x35

    .line 236
    .line 237
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 238
    .line 239
    .line 240
    const-string v2, "ByteString would be too long: "

    .line 241
    .line 242
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v0, "+"

    .line 249
    .line 250
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw p0
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

.method public final g(III[B)V
    .locals 3

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    if-ltz p1, :cond_5

    .line 4
    .line 5
    if-ltz p2, :cond_4

    .line 6
    .line 7
    if-ltz p3, :cond_3

    .line 8
    .line 9
    add-int v0, p1, p3

    .line 10
    .line 11
    invoke-virtual {p0}, Lbg0;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x22

    .line 16
    .line 17
    if-gt v0, v1, :cond_2

    .line 18
    .line 19
    add-int v0, p2, p3

    .line 20
    .line 21
    array-length v1, p4

    .line 22
    if-gt v0, v1, :cond_1

    .line 23
    .line 24
    if-lez p3, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3, p4}, Lbg0;->k(III[B)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    const-string p0, "Target end offset < 0: "

    .line 31
    .line 32
    invoke-static {v2, v0, p0}, Lh;->g(IILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string p0, "Source end offset < 0: "

    .line 37
    .line 38
    invoke-static {v2, v0, p0}, Lh;->g(IILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    const/16 p0, 0x17

    .line 43
    .line 44
    const-string p1, "Length < 0: "

    .line 45
    .line 46
    invoke-static {p0, p3, p1}, Lh;->g(IILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    const-string p0, "Target offset < 0: "

    .line 51
    .line 52
    invoke-static {v0, p2, p0}, Lh;->g(IILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_5
    const-string p0, "Source offset < 0: "

    .line 57
    .line 58
    invoke-static {v0, p1, p0}, Lh;->g(IILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void
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

.method public abstract k(III[B)V
.end method

.method public abstract l()I
.end method

.method public abstract n()Z
.end method

.method public abstract o()Z
.end method

.method public abstract s(III)I
.end method

.method public abstract size()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lbg0;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "<ByteString@%s size=%d>"

    .line 22
    .line 23
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
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
.end method

.method public abstract v(III)I
.end method

.method public abstract w()I
.end method

.method public final x()[B
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbg0;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lsf3;->a:[B

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-array v1, v0, [B

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p0, v2, v2, v0, v1}, Lbg0;->k(III[B)V

    .line 14
    .line 15
    .line 16
    return-object v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public abstract y()Ljava/lang/String;
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lbg0;->y()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const-string v0, "UTF-8 not supported?"

    .line 8
    .line 9
    invoke-static {v0, p0}, Lku4;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
