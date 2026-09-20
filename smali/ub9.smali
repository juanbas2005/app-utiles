.class public abstract Lub9;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ljava/util/WeakHashMap;

.field public static final b:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lub9;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lub9;->b:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 13

    .line 1
    sget-object v0, Lub9;->b:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    move-object v1, p0

    .line 5
    :goto_0
    if-eqz v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto/16 :goto_d

    .line 20
    .line 21
    :cond_0
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v3, v2

    .line 27
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v0, p0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    goto/16 :goto_b

    .line 38
    .line 39
    :cond_2
    sget-object v1, Lub9;->a:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    monitor-enter v1

    .line 42
    move-object v0, p0

    .line 43
    :goto_2
    if-eqz v0, :cond_3

    .line 44
    .line 45
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_2

    .line 56
    :catchall_1
    move-exception p0

    .line 57
    goto/16 :goto_c

    .line 58
    .line 59
    :cond_3
    if-nez v0, :cond_4

    .line 60
    .line 61
    monitor-exit v1

    .line 62
    const/4 v0, 0x0

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lrb9;

    .line 69
    .line 70
    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    new-instance v0, Llx8;

    .line 75
    .line 76
    const/4 v1, 0x4

    .line 77
    invoke-direct {v0, v1}, Llx8;-><init>(I)V

    .line 78
    .line 79
    .line 80
    :goto_3
    if-nez v0, :cond_e

    .line 81
    .line 82
    invoke-static {}, Lvb9;->c()Lic9;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v0, v0, Lic9;->b:Ljc9;

    .line 87
    .line 88
    if-eqz v0, :cond_e

    .line 89
    .line 90
    new-instance v1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    :goto_4
    if-eqz v0, :cond_5

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    check-cast v0, Lqb9;

    .line 101
    .line 102
    iget-object v0, v0, Lqb9;->w:Lqb9;

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Ljc9;

    .line 110
    .line 111
    check-cast v0, Lqb9;

    .line 112
    .line 113
    iget-object v0, v0, Lqb9;->x:Ljava/util/UUID;

    .line 114
    .line 115
    if-eqz v0, :cond_d

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Ljc9;

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    sget-object v4, Lq93;->x:Lm93;

    .line 131
    .line 132
    const-string v4, "expectedSize"

    .line 133
    .line 134
    invoke-static {v3, v4}, Lie1;->z(ILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v4, "initialCapacity"

    .line 138
    .line 139
    invoke-static {v3, v4}, Lie1;->z(ILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    new-array v3, v3, [Ljava/lang/Object;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    const-string v5, "expectedSize"

    .line 149
    .line 150
    invoke-static {v4, v5}, Lie1;->z(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const-string v5, "initialCapacity"

    .line 154
    .line 155
    invoke-static {v4, v5}, Lie1;->z(ILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-array v4, v4, [Ljava/lang/Object;

    .line 159
    .line 160
    invoke-static {v1}, Lfd1;->Z(Ljava/util/List;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    move v5, v2

    .line 169
    move v6, v5

    .line 170
    move v7, v6

    .line 171
    move v8, v7

    .line 172
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-eqz v9, :cond_a

    .line 177
    .line 178
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    check-cast v9, Ljc9;

    .line 183
    .line 184
    move-object v10, v9

    .line 185
    check-cast v10, Lqb9;

    .line 186
    .line 187
    iget-object v10, v10, Lqb9;->z:Ljava/lang/String;

    .line 188
    .line 189
    add-int/lit8 v11, v7, 0x1

    .line 190
    .line 191
    array-length v12, v4

    .line 192
    if-ge v12, v11, :cond_6

    .line 193
    .line 194
    array-length v8, v4

    .line 195
    invoke-static {v8, v11}, Li93;->d(II)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    :goto_6
    move v8, v2

    .line 204
    goto :goto_7

    .line 205
    :cond_6
    if-eqz v8, :cond_7

    .line 206
    .line 207
    invoke-virtual {v4}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, [Ljava/lang/Object;

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_7
    :goto_7
    add-int/lit8 v11, v7, 0x1

    .line 215
    .line 216
    aput-object v10, v4, v7

    .line 217
    .line 218
    invoke-interface {v9}, Ljc9;->e()Lfc9;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    add-int/lit8 v9, v5, 0x1

    .line 226
    .line 227
    array-length v10, v3

    .line 228
    if-ge v10, v9, :cond_8

    .line 229
    .line 230
    array-length v6, v3

    .line 231
    invoke-static {v6, v9}, Li93;->d(II)I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    :goto_8
    move v6, v2

    .line 240
    goto :goto_9

    .line 241
    :cond_8
    if-eqz v6, :cond_9

    .line 242
    .line 243
    invoke-virtual {v3}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, [Ljava/lang/Object;

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_9
    :goto_9
    add-int/lit8 v9, v5, 0x1

    .line 251
    .line 252
    aput-object v7, v3, v5

    .line 253
    .line 254
    move v5, v9

    .line 255
    move v7, v11

    .line 256
    goto :goto_5

    .line 257
    :cond_a
    sget-object v1, Lub9;->a:Ljava/util/WeakHashMap;

    .line 258
    .line 259
    monitor-enter v1

    .line 260
    :try_start_2
    invoke-static {v7, v4}, Lq93;->p(I[Ljava/lang/Object;)Li36;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    if-eqz v2, :cond_c

    .line 265
    .line 266
    invoke-static {v5, v3}, Lq93;->p(I[Ljava/lang/Object;)Li36;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    if-eqz v3, :cond_b

    .line 271
    .line 272
    new-instance v4, Lrb9;

    .line 273
    .line 274
    invoke-direct {v4, v2, v3, v0}, Lrb9;-><init>(Li36;Li36;Ljava/util/UUID;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, p0, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    monitor-exit v1

    .line 281
    return-void

    .line 282
    :catchall_2
    move-exception p0

    .line 283
    goto :goto_a

    .line 284
    :cond_b
    new-instance p0, Ljava/lang/NullPointerException;

    .line 285
    .line 286
    const-string v0, "Null extras"

    .line 287
    .line 288
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw p0

    .line 292
    :cond_c
    new-instance p0, Ljava/lang/NullPointerException;

    .line 293
    .line 294
    const-string v0, "Null spansNames"

    .line 295
    .line 296
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p0

    .line 300
    :goto_a
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 301
    throw p0

    .line 302
    :cond_d
    const-string p0, "Null rootTraceId"

    .line 303
    .line 304
    invoke-static {p0}, Lku4;->j(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :cond_e
    :goto_b
    return-void

    .line 308
    :goto_c
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 309
    throw p0

    .line 310
    :goto_d
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 311
    throw p0
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
