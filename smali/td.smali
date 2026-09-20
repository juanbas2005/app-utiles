.class public final Ltd;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcs0;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/content/ClipboardManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltd;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a()Landroid/content/ClipboardManager;
    .locals 2

    .line 1
    iget-object v0, p0, Ltd;->b:Landroid/content/ClipboardManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ltd;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v1, "clipboard"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/content/ClipboardManager;

    .line 17
    .line 18
    iput-object v0, p0, Ltd;->b:Landroid/content/ClipboardManager;

    .line 19
    .line 20
    :cond_0
    return-object v0
    .line 21
.end method

.method public final b(Lvl;)V
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ltd;->a()Landroid/content/ClipboardManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lvl;->y:Ljava/util/ArrayList;

    .line 8
    .line 9
    sget-object v3, La42;->w:La42;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v4, v2

    .line 16
    :goto_0
    iget-object v0, v0, Lvl;->x:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_1
    new-instance v4, Landroid/text/SpannableString;

    .line 27
    .line 28
    invoke-direct {v4, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lns8;

    .line 32
    .line 33
    const/16 v5, 0x15

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-direct {v0, v5, v6}, Lns8;-><init>(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    iput-object v5, v0, Lns8;->x:Ljava/lang/Object;

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    move-object v2, v3

    .line 48
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move v5, v6

    .line 53
    :goto_1
    if-ge v5, v3, :cond_15

    .line 54
    .line 55
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Lul;

    .line 60
    .line 61
    iget-object v8, v7, Lul;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Lyy6;

    .line 64
    .line 65
    iget v9, v7, Lul;->b:I

    .line 66
    .line 67
    iget v7, v7, Lul;->c:I

    .line 68
    .line 69
    iget-object v10, v0, Lns8;->x:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v10, Landroid/os/Parcel;

    .line 72
    .line 73
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    iput-object v10, v0, Lns8;->x:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v10, v8, Lyy6;->a:Lkf7;

    .line 83
    .line 84
    iget-wide v11, v8, Lyy6;->l:J

    .line 85
    .line 86
    iget-wide v13, v8, Lyy6;->h:J

    .line 87
    .line 88
    move/from16 p1, v7

    .line 89
    .line 90
    iget-wide v6, v8, Lyy6;->b:J

    .line 91
    .line 92
    move-object v15, v2

    .line 93
    move/from16 v16, v3

    .line 94
    .line 95
    invoke-interface {v10}, Lkf7;->b()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    move-object v10, v4

    .line 100
    move/from16 v17, v5

    .line 101
    .line 102
    sget-wide v4, Ljt0;->g:J

    .line 103
    .line 104
    invoke-static {v2, v3, v4, v5}, Ljt0;->c(JJ)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v3, 0x1

    .line 109
    if-nez v2, :cond_3

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Lns8;->R(B)V

    .line 112
    .line 113
    .line 114
    iget-object v2, v8, Lyy6;->a:Lkf7;

    .line 115
    .line 116
    invoke-interface {v2}, Lkf7;->b()J

    .line 117
    .line 118
    .line 119
    move-result-wide v18

    .line 120
    move-wide/from16 v20, v4

    .line 121
    .line 122
    invoke-static/range {v18 .. v19}, Lgl0;->d0(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v3

    .line 126
    iget-object v5, v0, Lns8;->x:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v5, Landroid/os/Parcel;

    .line 129
    .line 130
    invoke-virtual {v5, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    move-wide/from16 v20, v4

    .line 135
    .line 136
    :goto_2
    sget-wide v3, Lwg7;->c:J

    .line 137
    .line 138
    invoke-static {v6, v7, v3, v4}, Lwg7;->a(JJ)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    const/4 v2, 0x2

    .line 143
    if-nez v5, :cond_4

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Lns8;->R(B)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v6, v7}, Lns8;->T(J)V

    .line 149
    .line 150
    .line 151
    :cond_4
    iget-object v5, v8, Lyy6;->c:Lam2;

    .line 152
    .line 153
    const/4 v6, 0x3

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    invoke-virtual {v0, v6}, Lns8;->R(B)V

    .line 157
    .line 158
    .line 159
    iget v5, v5, Lam2;->w:I

    .line 160
    .line 161
    iget-object v7, v0, Lns8;->x:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v7, Landroid/os/Parcel;

    .line 164
    .line 165
    invoke-virtual {v7, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    .line 167
    .line 168
    :cond_5
    iget-object v5, v8, Lyy6;->d:Lyl2;

    .line 169
    .line 170
    if-eqz v5, :cond_8

    .line 171
    .line 172
    iget v5, v5, Lyl2;->a:I

    .line 173
    .line 174
    const/4 v7, 0x4

    .line 175
    invoke-virtual {v0, v7}, Lns8;->R(B)V

    .line 176
    .line 177
    .line 178
    if-nez v5, :cond_7

    .line 179
    .line 180
    :cond_6
    const/4 v5, 0x0

    .line 181
    goto :goto_3

    .line 182
    :cond_7
    const/4 v7, 0x1

    .line 183
    if-ne v5, v7, :cond_6

    .line 184
    .line 185
    const/4 v5, 0x1

    .line 186
    :goto_3
    invoke-virtual {v0, v5}, Lns8;->R(B)V

    .line 187
    .line 188
    .line 189
    :cond_8
    iget-object v5, v8, Lyy6;->e:Lzl2;

    .line 190
    .line 191
    if-eqz v5, :cond_d

    .line 192
    .line 193
    iget v5, v5, Lzl2;->a:I

    .line 194
    .line 195
    const/4 v7, 0x5

    .line 196
    invoke-virtual {v0, v7}, Lns8;->R(B)V

    .line 197
    .line 198
    .line 199
    if-nez v5, :cond_a

    .line 200
    .line 201
    :cond_9
    const/4 v2, 0x0

    .line 202
    goto :goto_4

    .line 203
    :cond_a
    const v7, 0xffff

    .line 204
    .line 205
    .line 206
    if-ne v5, v7, :cond_b

    .line 207
    .line 208
    const/4 v2, 0x1

    .line 209
    goto :goto_4

    .line 210
    :cond_b
    const/4 v7, 0x1

    .line 211
    if-ne v5, v7, :cond_c

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_c
    if-ne v5, v2, :cond_9

    .line 215
    .line 216
    move v2, v6

    .line 217
    :goto_4
    invoke-virtual {v0, v2}, Lns8;->R(B)V

    .line 218
    .line 219
    .line 220
    :cond_d
    iget-object v2, v8, Lyy6;->g:Ljava/lang/String;

    .line 221
    .line 222
    if-eqz v2, :cond_e

    .line 223
    .line 224
    const/4 v5, 0x6

    .line 225
    invoke-virtual {v0, v5}, Lns8;->R(B)V

    .line 226
    .line 227
    .line 228
    iget-object v5, v0, Lns8;->x:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v5, Landroid/os/Parcel;

    .line 231
    .line 232
    invoke-virtual {v5, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :cond_e
    invoke-static {v13, v14, v3, v4}, Lwg7;->a(JJ)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-nez v2, :cond_f

    .line 240
    .line 241
    const/4 v2, 0x7

    .line 242
    invoke-virtual {v0, v2}, Lns8;->R(B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v13, v14}, Lns8;->T(J)V

    .line 246
    .line 247
    .line 248
    :cond_f
    iget-object v2, v8, Lyy6;->i:Lh60;

    .line 249
    .line 250
    if-eqz v2, :cond_10

    .line 251
    .line 252
    iget v2, v2, Lh60;->a:F

    .line 253
    .line 254
    const/16 v3, 0x8

    .line 255
    .line 256
    invoke-virtual {v0, v3}, Lns8;->R(B)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v2}, Lns8;->S(F)V

    .line 260
    .line 261
    .line 262
    :cond_10
    iget-object v2, v8, Lyy6;->j:Llf7;

    .line 263
    .line 264
    if-eqz v2, :cond_11

    .line 265
    .line 266
    const/16 v3, 0x9

    .line 267
    .line 268
    invoke-virtual {v0, v3}, Lns8;->R(B)V

    .line 269
    .line 270
    .line 271
    iget v3, v2, Llf7;->a:F

    .line 272
    .line 273
    invoke-virtual {v0, v3}, Lns8;->S(F)V

    .line 274
    .line 275
    .line 276
    iget v2, v2, Llf7;->b:F

    .line 277
    .line 278
    invoke-virtual {v0, v2}, Lns8;->S(F)V

    .line 279
    .line 280
    .line 281
    :cond_11
    move-wide/from16 v2, v20

    .line 282
    .line 283
    invoke-static {v11, v12, v2, v3}, Ljt0;->c(JJ)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-nez v2, :cond_12

    .line 288
    .line 289
    const/16 v2, 0xa

    .line 290
    .line 291
    invoke-virtual {v0, v2}, Lns8;->R(B)V

    .line 292
    .line 293
    .line 294
    invoke-static {v11, v12}, Lgl0;->d0(J)J

    .line 295
    .line 296
    .line 297
    move-result-wide v2

    .line 298
    iget-object v4, v0, Lns8;->x:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v4, Landroid/os/Parcel;

    .line 301
    .line 302
    invoke-virtual {v4, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 303
    .line 304
    .line 305
    :cond_12
    iget-object v2, v8, Lyy6;->m:Lrd7;

    .line 306
    .line 307
    if-eqz v2, :cond_13

    .line 308
    .line 309
    const/16 v3, 0xb

    .line 310
    .line 311
    invoke-virtual {v0, v3}, Lns8;->R(B)V

    .line 312
    .line 313
    .line 314
    iget v2, v2, Lrd7;->a:I

    .line 315
    .line 316
    iget-object v3, v0, Lns8;->x:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v3, Landroid/os/Parcel;

    .line 319
    .line 320
    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 321
    .line 322
    .line 323
    :cond_13
    iget-object v2, v8, Lyy6;->n:Llq6;

    .line 324
    .line 325
    if-eqz v2, :cond_14

    .line 326
    .line 327
    const/16 v3, 0xc

    .line 328
    .line 329
    invoke-virtual {v0, v3}, Lns8;->R(B)V

    .line 330
    .line 331
    .line 332
    iget-wide v3, v2, Llq6;->a:J

    .line 333
    .line 334
    invoke-static {v3, v4}, Lgl0;->d0(J)J

    .line 335
    .line 336
    .line 337
    move-result-wide v3

    .line 338
    iget-object v5, v0, Lns8;->x:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v5, Landroid/os/Parcel;

    .line 341
    .line 342
    invoke-virtual {v5, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 343
    .line 344
    .line 345
    iget-wide v3, v2, Llq6;->b:J

    .line 346
    .line 347
    const/16 v5, 0x20

    .line 348
    .line 349
    shr-long v5, v3, v5

    .line 350
    .line 351
    long-to-int v5, v5

    .line 352
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    invoke-virtual {v0, v5}, Lns8;->S(F)V

    .line 357
    .line 358
    .line 359
    const-wide v5, 0xffffffffL

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    and-long/2addr v3, v5

    .line 365
    long-to-int v3, v3

    .line 366
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    invoke-virtual {v0, v3}, Lns8;->S(F)V

    .line 371
    .line 372
    .line 373
    iget v2, v2, Llq6;->c:F

    .line 374
    .line 375
    invoke-virtual {v0, v2}, Lns8;->S(F)V

    .line 376
    .line 377
    .line 378
    :cond_14
    new-instance v2, Landroid/text/Annotation;

    .line 379
    .line 380
    iget-object v3, v0, Lns8;->x:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v3, Landroid/os/Parcel;

    .line 383
    .line 384
    invoke-virtual {v3}, Landroid/os/Parcel;->marshall()[B

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    const/4 v4, 0x0

    .line 389
    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    const-string v5, "androidx.compose.text.SpanStyle"

    .line 394
    .line 395
    invoke-direct {v2, v5, v3}, Landroid/text/Annotation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    const/16 v3, 0x21

    .line 399
    .line 400
    move/from16 v5, p1

    .line 401
    .line 402
    invoke-virtual {v10, v2, v9, v5, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 403
    .line 404
    .line 405
    add-int/lit8 v5, v17, 0x1

    .line 406
    .line 407
    move v6, v4

    .line 408
    move-object v4, v10

    .line 409
    move-object v2, v15

    .line 410
    move/from16 v3, v16

    .line 411
    .line 412
    goto/16 :goto_1

    .line 413
    .line 414
    :cond_15
    move-object v10, v4

    .line 415
    move-object v0, v10

    .line 416
    :goto_5
    const-string v2, "plain text"

    .line 417
    .line 418
    invoke-static {v2, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 423
    .line 424
    .line 425
    return-void
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
