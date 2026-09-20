.class public final Lfm4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Lfm4;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lfm4;

    .line 2
    .line 3
    const-string v11, "November"

    .line 4
    .line 5
    const-string v12, "December"

    .line 6
    .line 7
    const-string v1, "January"

    .line 8
    .line 9
    const-string v2, "February"

    .line 10
    .line 11
    const-string v3, "March"

    .line 12
    .line 13
    const-string v4, "April"

    .line 14
    .line 15
    const-string v5, "May"

    .line 16
    .line 17
    const-string v6, "June"

    .line 18
    .line 19
    const-string v7, "July"

    .line 20
    .line 21
    const-string v8, "August"

    .line 22
    .line 23
    const-string v9, "September"

    .line 24
    .line 25
    const-string v10, "October"

    .line 26
    .line 27
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Lfm4;-><init>(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lfm4;

    .line 39
    .line 40
    const-string v11, "Nov"

    .line 41
    .line 42
    const-string v12, "Dec"

    .line 43
    .line 44
    const-string v1, "Jan"

    .line 45
    .line 46
    const-string v2, "Feb"

    .line 47
    .line 48
    const-string v3, "Mar"

    .line 49
    .line 50
    const-string v4, "Apr"

    .line 51
    .line 52
    const-string v5, "May"

    .line 53
    .line 54
    const-string v6, "Jun"

    .line 55
    .line 56
    const-string v7, "Jul"

    .line 57
    .line 58
    const-string v8, "Aug"

    .line 59
    .line 60
    const-string v9, "Sep"

    .line 61
    .line 62
    const-string v10, "Oct"

    .line 63
    .line 64
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Lfm4;-><init>(Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lfm4;->b:Lfm4;

    .line 76
    .line 77
    return-void
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

.method public constructor <init>(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfm4;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0xc

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ne v0, v1, :cond_4

    .line 14
    .line 15
    invoke-static {p1}, Lsg3;->v(Ljava/util/Collection;)Lre3;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lpe3;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    move-object v0, p1

    .line 24
    check-cast v0, Lqe3;

    .line 25
    .line 26
    iget-boolean v0, v0, Lqe3;->y:Z

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    move-object v0, p1

    .line 31
    check-cast v0, Lje3;

    .line 32
    .line 33
    invoke-virtual {v0}, Lje3;->nextInt()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lfm4;->a:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/CharSequence;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-lez v1, :cond_2

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    :goto_0
    if-ge v1, v0, :cond_0

    .line 53
    .line 54
    iget-object v3, p0, Lfm4;->a:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object v4, p0, Lfm4;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v3, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-nez v3, :cond_1

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, "Month names must be unique, but \'"

    .line 78
    .line 79
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, Lfm4;->a:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Ljava/lang/String;

    .line 89
    .line 90
    const-string v0, "\' was repeated"

    .line 91
    .line 92
    invoke-static {p1, p0, v0}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_2
    const-string p0, "A month name can not be empty"

    .line 101
    .line 102
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v2

    .line 106
    :cond_3
    return-void

    .line 107
    :cond_4
    const-string p0, "Month names must contain exactly 12 elements"

    .line 108
    .line 109
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v2
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
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lfm4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lfm4;

    .line 6
    .line 7
    iget-object p1, p1, Lfm4;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object p0, p0, Lfm4;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
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

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfm4;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v4, Lem4;->D:Lem4;

    .line 2
    .line 3
    const/16 v5, 0x18

    .line 4
    .line 5
    iget-object v0, p0, Lfm4;->a:Ljava/util/List;

    .line 6
    .line 7
    const-string v1, ", "

    .line 8
    .line 9
    const-string v2, "MonthNames("

    .line 10
    .line 11
    const-string v3, ")"

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method
