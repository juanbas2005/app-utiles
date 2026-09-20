.class public final Lkl6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/io/Externalizable;


# instance fields
.field public w:I

.field public x:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(ILjava/io/Serializable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkl6;->w:I

    .line 5
    .line 6
    iput-object p2, p0, Lkl6;->x:Ljava/io/Serializable;

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
.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lkl6;->w:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_5

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq v0, v1, :cond_4

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq v0, v1, :cond_3

    .line 18
    .line 19
    const/16 v1, 0xa

    .line 20
    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    sget-object v0, Lkotlinx/datetime/YearMonth;->Companion:Llf8;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    sget-object p1, Lsf8;->a:Lz97;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-wide/16 v3, 0xc

    .line 39
    .line 40
    div-long v5, v1, v3

    .line 41
    .line 42
    xor-long v7, v1, v3

    .line 43
    .line 44
    const-wide/16 v9, 0x0

    .line 45
    .line 46
    cmp-long p1, v7, v9

    .line 47
    .line 48
    if-gez p1, :cond_0

    .line 49
    .line 50
    mul-long v7, v5, v3

    .line 51
    .line 52
    cmp-long p1, v7, v1

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    const-wide/16 v7, -0x1

    .line 57
    .line 58
    add-long/2addr v5, v7

    .line 59
    :cond_0
    const-wide/16 v7, 0x7b2

    .line 60
    .line 61
    add-long/2addr v5, v7

    .line 62
    rem-long/2addr v1, v3

    .line 63
    xor-long v7, v1, v3

    .line 64
    .line 65
    neg-long v9, v1

    .line 66
    or-long/2addr v9, v1

    .line 67
    and-long/2addr v7, v9

    .line 68
    const/16 p1, 0x3f

    .line 69
    .line 70
    shr-long/2addr v7, p1

    .line 71
    and-long/2addr v3, v7

    .line 72
    add-long/2addr v1, v3

    .line 73
    long-to-int p1, v1

    .line 74
    add-int/lit8 p1, p1, 0x1

    .line 75
    .line 76
    new-instance v0, Lkotlinx/datetime/YearMonth;

    .line 77
    .line 78
    long-to-int v1, v5

    .line 79
    invoke-direct {v0, v1, p1}, Lkotlinx/datetime/YearMonth;-><init>(II)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 84
    .line 85
    iget p0, p0, Lkl6;->w:I

    .line 86
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v1, "Unknown type tag: "

    .line 90
    .line 91
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :cond_2
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const/4 v0, 0x0

    .line 114
    invoke-static {v0, v0, p1}, Lj08;->a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/datetime/UtcOffset;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    new-instance v0, Lkotlinx/datetime/LocalDateTime;

    .line 120
    .line 121
    new-instance v1, Lkotlinx/datetime/LocalDate;

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 124
    .line 125
    .line 126
    move-result-wide v2

    .line 127
    invoke-static {v2, v3}, Lq94;->l(J)Ljava/time/LocalDate;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-direct {v1, v2}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    .line 135
    .line 136
    .line 137
    sget-object v2, Lkotlinx/datetime/LocalTime;->Companion:Lqa4;

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 140
    .line 141
    .line 142
    move-result-wide v3

    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {v3, v4}, Lqa4;->a(J)Lkotlinx/datetime/LocalTime;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-direct {v0, v1, p1}, Lkotlinx/datetime/LocalDateTime;-><init>(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalTime;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_4
    sget-object v0, Lkotlinx/datetime/LocalTime;->Companion:Lqa4;

    .line 155
    .line 156
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v2}, Lqa4;->a(J)Lkotlinx/datetime/LocalTime;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    goto :goto_0

    .line 168
    :cond_5
    new-instance v0, Lkotlinx/datetime/LocalDate;

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 171
    .line 172
    .line 173
    move-result-wide v1

    .line 174
    invoke-static {v1, v2}, Lq94;->l(J)Ljava/time/LocalDate;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-direct {v0, p1}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    .line 182
    .line 183
    .line 184
    :goto_0
    iput-object v0, p0, Lkl6;->x:Ljava/io/Serializable;

    .line 185
    .line 186
    return-void
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
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
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lkl6;->w:I

    .line 5
    .line 6
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lkl6;->x:Ljava/io/Serializable;

    .line 10
    .line 11
    iget v1, p0, Lkl6;->w:I

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v1, v2, :cond_4

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    if-eq v1, v2, :cond_3

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    if-eq v1, v2, :cond_2

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/16 v2, 0xb

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    check-cast v0, Lkotlinx/datetime/YearMonth;

    .line 31
    .line 32
    sget-object p0, Lsf8;->a:Lz97;

    .line 33
    .line 34
    invoke-virtual {v0}, Lkotlinx/datetime/YearMonth;->getYear()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    int-to-long v1, p0

    .line 39
    const-wide/16 v3, 0x7b2

    .line 40
    .line 41
    sub-long/2addr v1, v3

    .line 42
    const-wide/16 v3, 0xc

    .line 43
    .line 44
    mul-long/2addr v1, v3

    .line 45
    invoke-virtual {v0}, Lkotlinx/datetime/YearMonth;->getMonthNumber$kotlinx_datetime()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    int-to-long v3, p0

    .line 50
    add-long/2addr v1, v3

    .line 51
    const-wide/16 v3, 0x1

    .line 52
    .line 53
    sub-long/2addr v1, v3

    .line 54
    invoke-interface {p1, v1, v2}, Ljava/io/DataOutput;->writeLong(J)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    iget p0, p0, Lkl6;->w:I

    .line 59
    .line 60
    const-string p1, " for value: "

    .line 61
    .line 62
    const-string v1, "Unknown type tag: "

    .line 63
    .line 64
    invoke-static {v1, p0, p1, v0}, Lkj6;->j(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    check-cast v0, Lkotlinx/datetime/UtcOffset;

    .line 69
    .line 70
    invoke-virtual {v0}, Lkotlinx/datetime/UtcOffset;->getTotalSeconds()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-interface {p1, p0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    check-cast v0, Lkotlinx/datetime/LocalDateTime;

    .line 79
    .line 80
    invoke-virtual {v0}, Lkotlinx/datetime/LocalDateTime;->getDate()Lkotlinx/datetime/LocalDate;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Lkotlinx/datetime/LocalDate;->getValue$kotlinx_datetime()Ljava/time/LocalDate;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lfb3;->f(Ljava/time/LocalDate;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    invoke-interface {p1, v1, v2}, Ljava/io/DataOutput;->writeLong(J)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lkotlinx/datetime/LocalDateTime;->getTime()Lkotlinx/datetime/LocalTime;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Lkotlinx/datetime/LocalTime;->toNanosecondOfDay()J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    check-cast v0, Lkotlinx/datetime/LocalTime;

    .line 108
    .line 109
    invoke-virtual {v0}, Lkotlinx/datetime/LocalTime;->toNanosecondOfDay()J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_4
    check-cast v0, Lkotlinx/datetime/LocalDate;

    .line 118
    .line 119
    invoke-virtual {v0}, Lkotlinx/datetime/LocalDate;->getValue$kotlinx_datetime()Ljava/time/LocalDate;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lfb3;->f(Ljava/time/LocalDate;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 128
    .line 129
    .line 130
    return-void
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
.end method
