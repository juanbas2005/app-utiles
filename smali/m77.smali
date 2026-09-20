.class public final Lm77;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lj77;


# instance fields
.field public final a:Ll77;

.field public final b:Lt77;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Lh81;

.field public final f:Lcf4;

.field public final g:Ljava/lang/String;

.field public final h:Ltx3;

.field public final i:Lbe1;


# direct methods
.method public constructor <init>(Ll77;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm77;->a:Ll77;

    .line 5
    .line 6
    iget-object v0, p1, Ll77;->d:Lt77;

    .line 7
    .line 8
    iput-object v0, p0, Lm77;->b:Lt77;

    .line 9
    .line 10
    iget-object v0, p1, Ll77;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lm77;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p1, Ll77;->c:Lp77;

    .line 15
    .line 16
    iget-boolean v0, v0, Lp77;->a:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lm77;->d:Z

    .line 19
    .line 20
    iget-object v0, p1, Ll77;->e:Lh81;

    .line 21
    .line 22
    iput-object v0, p0, Lm77;->e:Lh81;

    .line 23
    .line 24
    iget-object p1, p1, Ll77;->b:Lo77;

    .line 25
    .line 26
    iget-object v0, p1, Lo77;->a:Lub4;

    .line 27
    .line 28
    iget-object p1, p1, Lo77;->b:Lvr2;

    .line 29
    .line 30
    const-string v1, "Supabase-Core"

    .line 31
    .line 32
    invoke-static {p0, v1, v0, p1}, Lt75;->j(Lj77;Ljava/lang/String;Lub4;Lvr2;)Lcf4;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lm77;->f:Lcf4;

    .line 37
    .line 38
    iget-object v0, p1, Lcf4;->z:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lms3;

    .line 41
    .line 42
    iget-object p1, p1, Lcf4;->y:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    sget-object v1, Lub4;->x:Lub4;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lms3;->a(Lub4;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    const-string v2, "SupabaseClient created! Please report any bugs you find."

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-virtual {v0, v1, p1, v3, v2}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    :try_start_0
    new-instance p1, Lm25;

    .line 61
    .line 62
    sget-object p1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception p1

    .line 66
    iget-object v0, p0, Lm77;->f:Lcf4;

    .line 67
    .line 68
    iget-object v2, v0, Lcf4;->z:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lms3;

    .line 71
    .line 72
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Lms3;->a(Lub4;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    const-string v3, "Failed to get OS information. If this is not intentional, please report this issue."

    .line 83
    .line 84
    invoke-virtual {v2, v1, v0, p1, v3}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    :goto_0
    iget-boolean p1, p0, Lm77;->d:Z

    .line 88
    .line 89
    iget-object v0, p0, Lm77;->c:Ljava/lang/String;

    .line 90
    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    const-string p1, "https://"

    .line 94
    .line 95
    invoke-static {p1, v0}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    const-string p1, "http://"

    .line 101
    .line 102
    invoke-static {p1, v0}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_1
    iput-object p1, p0, Lm77;->g:Ljava/lang/String;

    .line 107
    .line 108
    new-instance p1, Ltx3;

    .line 109
    .line 110
    invoke-direct {p1, p0}, Ltx3;-><init>(Lm77;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lm77;->h:Ltx3;

    .line 114
    .line 115
    iget-object p1, p0, Lm77;->a:Ll77;

    .line 116
    .line 117
    iget-object p1, p1, Ll77;->f:Ljava/util/Map;

    .line 118
    .line 119
    invoke-static {p1}, Lsf4;->Z(Ljava/util/Map;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const/16 v0, 0xa

    .line 124
    .line 125
    invoke-static {p1, v0}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-static {v0}, Ltf4;->F(I)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    const/16 v1, 0x10

    .line 134
    .line 135
    if-ge v0, v1, :cond_3

    .line 136
    .line 137
    move v0, v1

    .line 138
    :cond_3
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 139
    .line 140
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lyb5;

    .line 158
    .line 159
    iget-object v2, v0, Lyb5;->w:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Ljava/lang/String;

    .line 162
    .line 163
    iget-object v0, v0, Lyb5;->x:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lvr2;

    .line 166
    .line 167
    invoke-interface {v0, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_4
    iget-object p1, p0, Lm77;->f:Lcf4;

    .line 176
    .line 177
    const-string v0, " [PluginManager]"

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Lcf4;->b(Ljava/lang/String;)Lcf4;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    new-instance v0, Lbe1;

    .line 184
    .line 185
    invoke-direct {v0, v1, p1}, Lbe1;-><init>(Ljava/util/LinkedHashMap;Lcf4;)V

    .line 186
    .line 187
    .line 188
    iput-object v0, p0, Lm77;->i:Lbe1;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, Ljava/lang/Iterable;

    .line 195
    .line 196
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_5

    .line 205
    .line 206
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    check-cast p1, Lqe4;

    .line 211
    .line 212
    invoke-interface {p1}, Lqe4;->g()V

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_5
    return-void
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
