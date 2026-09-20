.class public final Lh47;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lqe4;


# instance fields
.field public final b:Lj77;

.field public final c:Lc47;

.field public final d:Lt77;

.field public final e:Law;


# direct methods
.method public constructor <init>(Lj77;Lc47;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lh47;->b:Lj77;

    .line 11
    .line 12
    iput-object p2, p0, Lh47;->c:Lc47;

    .line 13
    .line 14
    move-object p2, p1

    .line 15
    check-cast p2, Lm77;

    .line 16
    .line 17
    iget-object p2, p2, Lm77;->b:Lt77;

    .line 18
    .line 19
    iput-object p2, p0, Lh47;->d:Lt77;

    .line 20
    .line 21
    const-string p2, "Supabase-Storage"

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p1, p2, v0, v0}, Lt75;->j(Lj77;Ljava/lang/String;Lub4;Lvr2;)Lcf4;

    .line 25
    .line 26
    .line 27
    new-instance p2, Lay5;

    .line 28
    .line 29
    const/16 v1, 0x11

    .line 30
    .line 31
    invoke-direct {p2, v1, p0}, Lay5;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/16 v1, 0xc

    .line 35
    .line 36
    invoke-static {p1, p0, p2, v0, v1}, Lsg3;->g(Lj77;Lqe4;Lay5;Ljava/lang/Integer;I)Law;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lh47;->e:Law;

    .line 41
    .line 42
    const-string p0, "iceberg"

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Law;->d(Ljava/lang/String;)Law;

    .line 45
    .line 46
    .line 47
    const-string p0, "vector"

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Law;->d(Ljava/lang/String;)Law;

    .line 50
    .line 51
    .line 52
    return-void
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
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lh47;->c:Lc47;

    .line 2
    .line 3
    return-object p0
    .line 4
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

.method public final e(Lyl1;Lf61;)Ljava/io/Serializable;
    .locals 8

    .line 1
    instance-of v0, p2, Lg47;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lg47;

    .line 7
    .line 8
    iget v1, v0, Lg47;->E:I

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
    iput v1, v0, Lg47;->E:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lg47;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lg47;-><init>(Lh47;Lf61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lg47;->C:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lg47;->E:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lg47;->B:Lj77;

    .line 36
    .line 37
    iget-object p1, v0, Lg47;->A:Lw63;

    .line 38
    .line 39
    iget-object v0, v0, Lg47;->z:Lyl1;

    .line 40
    .line 41
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v7, p2

    .line 45
    move-object p2, p1

    .line 46
    move-object p1, v0

    .line 47
    move-object v0, v7

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lyl1;->e()Lw63;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iput-object p1, v0, Lg47;->z:Lyl1;

    .line 63
    .line 64
    iput-object p2, v0, Lg47;->A:Lw63;

    .line 65
    .line 66
    iget-object p0, p0, Lh47;->b:Lj77;

    .line 67
    .line 68
    iput-object p0, v0, Lg47;->B:Lj77;

    .line 69
    .line 70
    iput v2, v0, Lg47;->E:I

    .line 71
    .line 72
    sget-object v1, Lmo0;->a:Ljava/nio/charset/Charset;

    .line 73
    .line 74
    invoke-static {p1, v1, v0}, Lh49;->q(Lyl1;Ljava/nio/charset/Charset;Lh61;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v1, Lp81;->w:Lp81;

    .line 79
    .line 80
    if-ne v0, v1, :cond_3

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_3
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 84
    .line 85
    :try_start_0
    sget-object v1, Ll18;->a:Lkm3;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object v2, Lio/github/jan/supabase/storage/StorageErrorResponse;->Companion:Lf47;

    .line 91
    .line 92
    invoke-virtual {v2}, Lf47;->serializer()Lzr3;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lzr3;

    .line 97
    .line 98
    invoke-virtual {v1, v2, v0}, Lpl3;->b(Lzr3;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    goto :goto_2

    .line 103
    :catch_0
    move-exception v1

    .line 104
    check-cast p0, Lm77;

    .line 105
    .line 106
    iget-object p0, p0, Lm77;->f:Lcf4;

    .line 107
    .line 108
    iget-object v2, p0, Lcf4;->z:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Lms3;

    .line 111
    .line 112
    iget-object p0, p0, Lcf4;->y:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Ljava/lang/String;

    .line 115
    .line 116
    sget-object v4, Lub4;->x:Lub4;

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Lms3;->a(Lub4;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_4

    .line 123
    .line 124
    new-instance v5, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v6, "Could not decode "

    .line 127
    .line 128
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/16 v6, 0xc8

    .line 132
    .line 133
    invoke-static {v6, v0}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v0, " as "

    .line 141
    .line 142
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-class v0, Lio/github/jan/supabase/storage/StorageErrorResponse;

    .line 146
    .line 147
    sget-object v6, Lb26;->a:Lc26;

    .line 148
    .line 149
    invoke-virtual {v6, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v0}, Lgq3;->A()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const/16 v0, 0x2e

    .line 161
    .line 162
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v2, v4, p0, v1, v0}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_4
    :goto_2
    check-cast v3, Lio/github/jan/supabase/storage/StorageErrorResponse;

    .line 173
    .line 174
    if-nez v3, :cond_5

    .line 175
    .line 176
    new-instance v3, Lio/github/jan/supabase/storage/StorageErrorResponse;

    .line 177
    .line 178
    invoke-virtual {p1}, Lyl1;->e()Lw63;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    iget p0, p0, Lw63;->w:I

    .line 183
    .line 184
    const-string v0, "Unknown error"

    .line 185
    .line 186
    const-string v1, ""

    .line 187
    .line 188
    invoke-direct {v3, p0, v0, v1}, Lio/github/jan/supabase/storage/StorageErrorResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    sget-object p0, Lw63;->D:Lw63;

    .line 192
    .line 193
    invoke-static {p2, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    if-nez p2, :cond_6

    .line 198
    .line 199
    new-instance p0, Lio/github/jan/supabase/exceptions/UnknownRestException;

    .line 200
    .line 201
    new-instance p2, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string v0, "Unknown error response "

    .line 204
    .line 205
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    invoke-direct {p0, p1, p2}, Lio/github/jan/supabase/exceptions/UnknownRestException;-><init>(Lyl1;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-object p0

    .line 219
    :cond_6
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getStatusCode()I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    sget-object v0, Lw63;->E:Lw63;

    .line 224
    .line 225
    iget v0, v0, Lw63;->w:I

    .line 226
    .line 227
    if-eq p2, v0, :cond_9

    .line 228
    .line 229
    iget p0, p0, Lw63;->w:I

    .line 230
    .line 231
    if-eq p2, p0, :cond_8

    .line 232
    .line 233
    sget-object p0, Lw63;->F:Lw63;

    .line 234
    .line 235
    iget p0, p0, Lw63;->w:I

    .line 236
    .line 237
    if-ne p2, p0, :cond_7

    .line 238
    .line 239
    new-instance p0, Lio/github/jan/supabase/exceptions/NotFoundRestException;

    .line 240
    .line 241
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getError()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getMessage()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-direct {p0, p2, v0, p1}, Lio/github/jan/supabase/exceptions/RestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 256
    .line 257
    .line 258
    throw p0

    .line 259
    :cond_7
    new-instance p0, Lio/github/jan/supabase/exceptions/UnknownRestException;

    .line 260
    .line 261
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getMessage()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    invoke-direct {p0, p1, p2}, Lio/github/jan/supabase/exceptions/UnknownRestException;-><init>(Lyl1;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p0

    .line 269
    :cond_8
    new-instance p0, Lio/github/jan/supabase/exceptions/BadRequestRestException;

    .line 270
    .line 271
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getError()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getMessage()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-direct {p0, p2, v0, p1}, Lio/github/jan/supabase/exceptions/RestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 286
    .line 287
    .line 288
    throw p0

    .line 289
    :cond_9
    new-instance p0, Lio/github/jan/supabase/exceptions/UnauthorizedRestException;

    .line 290
    .line 291
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getError()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    invoke-virtual {v3}, Lio/github/jan/supabase/storage/StorageErrorResponse;->getMessage()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-direct {p0, p2, v0, p1}, Lio/github/jan/supabase/exceptions/RestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 306
    .line 307
    .line 308
    throw p0
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

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "storage"

    .line 2
    .line 3
    return-object p0
    .line 4
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

.method public final h()Lj77;
    .locals 0

    .line 1
    iget-object p0, p0, Lh47;->b:Lj77;

    .line 2
    .line 3
    return-object p0
    .line 4
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

.method public l(Ljava/lang/String;)Lam6;
    .locals 5

    .line 1
    new-instance v0, Lam6;

    .line 2
    .line 3
    iget-object v1, p0, Lh47;->e:Law;

    .line 4
    .line 5
    const-string v2, "object"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Law;->d(Ljava/lang/String;)Law;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lh47;->c:Lc47;

    .line 12
    .line 13
    iget-object v2, v2, Lc47;->v:Lb47;

    .line 14
    .line 15
    sget v2, Lgk5;->a:I

    .line 16
    .line 17
    new-instance v2, Ln63;

    .line 18
    .line 19
    invoke-static {}, Lgw8;->d()Lay4;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v4}, Ln63;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Lhj8;->G(Lay4;)Lkg5;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p1, p0, v1, v2}, Lam6;-><init>(Ljava/lang/String;Lh47;Law;Ln63;)V

    .line 32
    .line 33
    .line 34
    return-object v0
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
.end method
