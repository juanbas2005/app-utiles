.class public final Lp44;
.super Lvh0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final e:Ljava/util/TimeZone;


# instance fields
.field public final c:I

.field public final d:Ln74;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTC"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lp44;->e:Ljava/util/TimeZone;

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
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lvh0;-><init>(Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, 0x6

    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    rem-int/2addr v0, v1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v0

    .line 20
    :goto_0
    iput v1, p0, Lp44;->c:I

    .line 21
    .line 22
    invoke-static {}, Lsg3;->m()Ln74;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Ljava/text/DateFormatSymbols;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Ljava/text/DateFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/text/DateFormatSymbols;->getWeekdays()[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Ljava/text/DateFormatSymbols;

    .line 36
    .line 37
    invoke-direct {v2, p1}, Ljava/text/DateFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/text/DateFormatSymbols;->getShortWeekdays()[Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v2, 0x2

    .line 45
    invoke-static {v2, v1}, Lqs;->R0(I[Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x0

    .line 54
    :goto_1
    if-ge v4, v3, :cond_1

    .line 55
    .line 56
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Ljava/lang/String;

    .line 61
    .line 62
    new-instance v6, Lyb5;

    .line 63
    .line 64
    add-int/lit8 v7, v4, 0x2

    .line 65
    .line 66
    aget-object v7, p1, v7

    .line 67
    .line 68
    invoke-direct {v6, v5, v7}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v6}, Ln74;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    new-instance v2, Lyb5;

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    aget-object v1, v1, v3

    .line 81
    .line 82
    aget-object p1, p1, v3

    .line 83
    .line 84
    invoke-direct {v2, v1, p1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ln74;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lsg3;->i(Ln74;)Ln74;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lp44;->d:Ln74;

    .line 95
    .line 96
    return-void
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
.end method


# virtual methods
.method public final a(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p3, v0}, Lb81;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object p0, p0, Lvh0;->b:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lp44;->e:Ljava/util/TimeZone;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 20
    .line 21
    invoke-direct {v1, p3, p4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 31
    .line 32
    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide p0

    .line 43
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v1, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
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

.method public final b(J)Lth0;
    .locals 6

    .line 1
    sget-object p0, Lp44;->e:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 8
    .line 9
    .line 10
    const/16 p1, 0xb

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-virtual {p0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 14
    .line 15
    .line 16
    const/16 p1, 0xc

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 19
    .line 20
    .line 21
    const/16 p1, 0xd

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 24
    .line 25
    .line 26
    const/16 p1, 0xe

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lth0;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 p2, 0x2

    .line 39
    invoke-virtual {p0, p2}, Ljava/util/Calendar;->get(I)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    add-int/lit8 v2, p2, 0x1

    .line 44
    .line 45
    const/4 p1, 0x5

    .line 46
    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    invoke-direct/range {v0 .. v5}, Lth0;-><init>(IIIJ)V

    .line 55
    .line 56
    .line 57
    return-object v0
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

.method public final c(Ljava/util/Locale;)Lvf1;
    .locals 0

    .line 1
    const/4 p0, 0x3

    .line 2
    invoke-static {p0, p1}, Ljava/text/DateFormat;->getDateInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    check-cast p0, Ljava/text/SimpleDateFormat;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lrd3;->n(Ljava/lang/String;)Lvf1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
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

.method public final d()I
    .locals 0

    .line 1
    iget p0, p0, Lp44;->c:I

    .line 2
    .line 3
    return p0
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

.method public final e(II)Lyh0;
    .locals 2

    .line 1
    sget-object v0, Lp44;->e:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->set(II)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    sub-int/2addr p2, v1

    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x5

    .line 20
    invoke-virtual {v0, p1, v1}, Ljava/util/Calendar;->set(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lp44;->l(Ljava/util/Calendar;)Lyh0;

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
.end method

.method public final f(J)Lyh0;
    .locals 1

    .line 1
    sget-object v0, Lp44;->e:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x5

    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0xb

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 19
    .line 20
    .line 21
    const/16 p1, 0xc

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 24
    .line 25
    .line 26
    const/16 p1, 0xd

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 29
    .line 30
    .line 31
    const/16 p1, 0xe

    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lp44;->l(Ljava/util/Calendar;)Lyh0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
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

.method public final g(Lth0;)Lyh0;
    .locals 1

    .line 1
    iget v0, p1, Lth0;->w:I

    .line 2
    .line 3
    iget p1, p1, Lth0;->x:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lp44;->e(II)Lyh0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public final h()Lth0;
    .locals 8

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0xb

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 9
    .line 10
    .line 11
    const/16 v0, 0xc

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0xd

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 19
    .line 20
    .line 21
    const/16 v0, 0xe

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 24
    .line 25
    .line 26
    const/16 v0, 0xf

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/16 v1, 0x10

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/2addr v1, v0

    .line 39
    new-instance v2, Lth0;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x2

    .line 47
    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    add-int/2addr v4, v0

    .line 52
    const/4 v0, 0x5

    .line 53
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    int-to-long v0, v1

    .line 62
    add-long/2addr v6, v0

    .line 63
    invoke-direct/range {v2 .. v7}, Lth0;-><init>(IIIJ)V

    .line 64
    .line 65
    .line 66
    return-object v2
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
.end method

.method public final i()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->d:Ln74;

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

.method public final j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Lth0;
    .locals 6

    .line 1
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, Lp44;->e:Ljava/util/TimeZone;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 9
    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-virtual {p0, p3}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 13
    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    return-object p3

    .line 23
    :cond_0
    invoke-static {p2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lth0;

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->get(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 p2, 0x2

    .line 38
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    add-int/lit8 v2, p2, 0x1

    .line 43
    .line 44
    const/4 p0, 0x5

    .line 45
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->get(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    invoke-direct/range {v0 .. v5}, Lth0;-><init>(IIIJ)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :catch_0
    return-object p3
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

.method public final k(Lyh0;I)Lyh0;
    .locals 3

    .line 1
    if-gtz p2, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    sget-object v0, Lp44;->e:Ljava/util/TimeZone;

    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-wide v1, p1, Lyh0;->e:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->add(II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lp44;->l(Ljava/util/Calendar;)Lyh0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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

.method public final l(Ljava/util/Calendar;)Lyh0;
    .locals 8

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    add-int/lit8 v1, v1, 0x6

    .line 7
    .line 8
    rem-int/2addr v1, v0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    iget p0, p0, Lp44;->c:I

    .line 14
    .line 15
    sub-int/2addr v0, p0

    .line 16
    if-gez v0, :cond_1

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x7

    .line 19
    .line 20
    :cond_1
    move v5, v0

    .line 21
    new-instance v1, Lyh0;

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->get(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/lit8 v3, v0, 0x1

    .line 34
    .line 35
    const/4 p0, 0x5

    .line 36
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    invoke-direct/range {v1 .. v7}, Lyh0;-><init>(IIIIJ)V

    .line 45
    .line 46
    .line 47
    return-object v1
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

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "LegacyCalendarModel"

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
