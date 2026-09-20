.class public final Lbu5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final c:Lbu5;


# instance fields
.field public final a:Lf96;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbu5;

    .line 2
    .line 3
    invoke-direct {v0}, Lbu5;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbu5;->c:Lbu5;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbu5;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lf96;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, v1}, Lf96;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lbu5;->a:Lf96;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lpg6;
    .locals 10

    .line 1
    const-string v0, "messageType"

    .line 2
    .line 3
    invoke-static {v0, p1}, Ltf3;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbu5;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lpg6;

    .line 13
    .line 14
    if-nez v1, :cond_d

    .line 15
    .line 16
    iget-object p0, p0, Lbu5;->a:Lf96;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v1, Landroidx/datastore/preferences/protobuf/i;->a:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v1, Landroidx/datastore/preferences/protobuf/e;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Landroidx/datastore/preferences/protobuf/i;->a:Ljava/lang/Class;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    .line 44
    .line 45
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    :goto_0
    iget-object p0, p0, Lf96;->x:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lve4;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lve4;->a(Ljava/lang/Class;)Lew5;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget p0, v4, Lew5;->d:I

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    and-int/2addr p0, v2

    .line 61
    const/4 v5, 0x1

    .line 62
    if-ne p0, v2, :cond_2

    .line 63
    .line 64
    move p0, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    :goto_1
    const-string v2, "Protobuf runtime is not correctly loaded."

    .line 68
    .line 69
    if-eqz p0, :cond_5

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    sget-object p0, Landroidx/datastore/preferences/protobuf/i;->c:Landroidx/datastore/preferences/protobuf/l;

    .line 78
    .line 79
    sget-object v1, Lda2;->a:Lba2;

    .line 80
    .line 81
    iget-object v2, v4, Lew5;->a:Landroidx/datastore/preferences/protobuf/a;

    .line 82
    .line 83
    new-instance v3, Landroidx/datastore/preferences/protobuf/h;

    .line 84
    .line 85
    invoke-direct {v3, p0, v1, v2}, Landroidx/datastore/preferences/protobuf/h;-><init>(Landroidx/datastore/preferences/protobuf/j;Lba2;Landroidx/datastore/preferences/protobuf/a;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_3
    sget-object p0, Landroidx/datastore/preferences/protobuf/i;->b:Landroidx/datastore/preferences/protobuf/j;

    .line 91
    .line 92
    sget-object v1, Lda2;->b:Lba2;

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    iget-object v2, v4, Lew5;->a:Landroidx/datastore/preferences/protobuf/a;

    .line 97
    .line 98
    new-instance v3, Landroidx/datastore/preferences/protobuf/h;

    .line 99
    .line 100
    invoke-direct {v3, p0, v1, v2}, Landroidx/datastore/preferences/protobuf/h;-><init>(Landroidx/datastore/preferences/protobuf/j;Lba2;Landroidx/datastore/preferences/protobuf/a;)V

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object v3

    .line 108
    :cond_5
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_8

    .line 113
    .line 114
    move p0, v5

    .line 115
    sget-object v5, Liz4;->b:Lgz4;

    .line 116
    .line 117
    sget-object v6, Lt74;->b:Ls74;

    .line 118
    .line 119
    sget-object v7, Landroidx/datastore/preferences/protobuf/i;->c:Landroidx/datastore/preferences/protobuf/l;

    .line 120
    .line 121
    invoke-virtual {v4}, Lew5;->a()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-static {v1}, Lb81;->B(I)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eq v1, p0, :cond_6

    .line 130
    .line 131
    sget-object p0, Lda2;->a:Lba2;

    .line 132
    .line 133
    move-object v8, p0

    .line 134
    goto :goto_2

    .line 135
    :cond_6
    move-object v8, v3

    .line 136
    :goto_2
    sget-object v9, Lnf4;->b:Llf4;

    .line 137
    .line 138
    instance-of p0, v4, Lew5;

    .line 139
    .line 140
    if-eqz p0, :cond_7

    .line 141
    .line 142
    invoke-static/range {v4 .. v9}, Landroidx/datastore/preferences/protobuf/g;->w(Lew5;Lgz4;Ls74;Landroidx/datastore/preferences/protobuf/j;Lba2;Llf4;)Landroidx/datastore/preferences/protobuf/g;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    goto :goto_4

    .line 147
    :cond_7
    sget-object p0, Landroidx/datastore/preferences/protobuf/g;->n:[I

    .line 148
    .line 149
    invoke-static {}, Lku4;->a()V

    .line 150
    .line 151
    .line 152
    return-object v3

    .line 153
    :cond_8
    move p0, v5

    .line 154
    sget-object v5, Liz4;->a:Lgz4;

    .line 155
    .line 156
    sget-object v6, Lt74;->a:Ls74;

    .line 157
    .line 158
    sget-object v7, Landroidx/datastore/preferences/protobuf/i;->b:Landroidx/datastore/preferences/protobuf/j;

    .line 159
    .line 160
    invoke-virtual {v4}, Lew5;->a()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-static {v1}, Lb81;->B(I)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eq v1, p0, :cond_a

    .line 169
    .line 170
    sget-object p0, Lda2;->b:Lba2;

    .line 171
    .line 172
    if-eqz p0, :cond_9

    .line 173
    .line 174
    move-object v8, p0

    .line 175
    goto :goto_3

    .line 176
    :cond_9
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-object v3

    .line 180
    :cond_a
    move-object v8, v3

    .line 181
    :goto_3
    sget-object v9, Lnf4;->a:Llf4;

    .line 182
    .line 183
    instance-of p0, v4, Lew5;

    .line 184
    .line 185
    if-eqz p0, :cond_c

    .line 186
    .line 187
    invoke-static/range {v4 .. v9}, Landroidx/datastore/preferences/protobuf/g;->w(Lew5;Lgz4;Ls74;Landroidx/datastore/preferences/protobuf/j;Lba2;Llf4;)Landroidx/datastore/preferences/protobuf/g;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    :goto_4
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, Lpg6;

    .line 196
    .line 197
    if-eqz p0, :cond_b

    .line 198
    .line 199
    return-object p0

    .line 200
    :cond_b
    return-object v3

    .line 201
    :cond_c
    sget-object p0, Landroidx/datastore/preferences/protobuf/g;->n:[I

    .line 202
    .line 203
    invoke-static {}, Lku4;->a()V

    .line 204
    .line 205
    .line 206
    return-object v3

    .line 207
    :cond_d
    return-object v1
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
